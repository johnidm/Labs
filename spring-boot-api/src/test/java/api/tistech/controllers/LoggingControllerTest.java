package api.tistech.controllers;

import api.tistech.model.Logging;
import api.tistech.repository.LoggingRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.util.Date;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class LoggingControllerTest {

    @Autowired
    private LoggingRepository repository;

    @Autowired
    LoggingController controller;

    private MockMvc mvc;

    @BeforeEach
    void setup() {

        repository.save(
                Logging.builder()
                        .action("request-post")
                        .username("mary")
                        .statusCode(200)
                        .url("http://127.0.0.1:8081/logging/all")
                        .createdAt(Date.from(Instant.parse("2000-01-01T00:00:00.000Z")))
                        .build());

        mvc = standaloneSetup(controller).build();
    }

    @Test
    void getAllLogs() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/logging/all");
        MvcResult result = mvc.perform(request).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(200, response.getStatus());

        String expected = "[{\"id\":4,\"username\":\"mary\",\"action\":\"request-post\",\"url\":\"http://127.0.0.1:8081/logging/all\",\"statusCode\":200,\"createdAt\":946684800000}]";
        assertEquals(expected, response.getContentAsString());

    }

}