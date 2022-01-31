package api.tistech.controllers;

import api.tistech.service.TokenAuthenticationService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class AuthenticationControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void authentication() throws Exception {
        String body = "{\"username\":\"tistech\", \"password\":\"1234\"}";

        RequestBuilder request = MockMvcRequestBuilders
                .post("/authentication")
                .contentType(MediaType.APPLICATION_JSON)
                .content(body);

        MvcResult result = mvc.perform(request).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(201, response.getStatus());

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(response.getContentAsString());
        String token = node.get("token").asText();

        String user = TokenAuthenticationService.getUser(token);

        assertEquals("tistech", user);

    }

    @Test
    void authenticationFailure() throws Exception {
        String body = "{\"username\":\"john\", \"password\":\"1234\"}";

        RequestBuilder request = MockMvcRequestBuilders
                .post("/authentication")
                .contentType(MediaType.APPLICATION_JSON)
                .content(body);

        MvcResult result = mvc.perform(request).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(403, response.getStatus());

    }
}