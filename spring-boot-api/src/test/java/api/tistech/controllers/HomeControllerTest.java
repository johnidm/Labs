package api.tistech.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class HomeControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void index() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();

        MockHttpServletResponse response = result.getResponse();

        assertEquals(200, response.getStatus());
        assertEquals("TisTech API running!", response.getContentAsString());
    }

}