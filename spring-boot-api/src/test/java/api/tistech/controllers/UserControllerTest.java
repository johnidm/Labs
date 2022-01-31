package api.tistech.controllers;

import api.tistech.model.User;
import api.tistech.repository.UserRepository;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class UserControllerTest {

    @Autowired
    private UserRepository repository;

    @Autowired
    UserController controller;

    private MockMvc mvc;

    @BeforeEach
    void setup() {

        repository.save(
                User.builder()
                        .name("Michelle")
                        .build());

        repository.save(
                User.builder()
                        .name("Michael")
                        .build());

        repository.save(
                User.builder()
                        .name("Phill")
                        .build());

        mvc = standaloneSetup(controller).build();
    }

    @Test
    void getAllUsers() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/user");
        MvcResult result = mvc.perform(request).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(200, response.getStatus());

        String expected = "[{\"id\":1,\"name\":\"Patricia\"},{\"id\":2,\"name\":\"Jennifer\"},{\"id\":3,\"name\":\"Robert\"},{\"id\":4,\"name\":\"Michelle\"},{\"id\":5,\"name\":\"Michael\"},{\"id\":6,\"name\":\"Phill\"}]";
        assertEquals(expected, response.getContentAsString());
    }

    @Test
    void getUser() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/user/2");
        MvcResult result = mvc.perform(request).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(200, response.getStatus());

        String expected = "{\"id\":2,\"name\":\"Jennifer\"}";
        assertEquals(expected, response.getContentAsString());
    }

    @Test
    void createUser() throws Exception {

        String body = "{\"name\":\"Mary\"}";

        RequestBuilder request = MockMvcRequestBuilders
                .post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(body);

        MvcResult result = mvc.perform(request).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(201, response.getStatus());

        String expected = "{\"id\":7,\"name\":\"Mary\"}";
        assertEquals(expected, response.getContentAsString());

        User user = repository.findById(7).get();
        assertEquals(7, user.getId());
        assertEquals("Mary", user.getName());
    }

    @Test
    void updateUser() throws Exception {
        String body = "{\"name\":\"Steave\"}";

        RequestBuilder request = MockMvcRequestBuilders
                .put("/user/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(body);

        MvcResult result = mvc.perform(request).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(200, response.getStatus());

        String expected = "{\"id\":1,\"name\":\"Steave\"}";
        assertEquals(expected, response.getContentAsString());

        User user = repository.findById(1).get();
        assertEquals(1, user.getId());
        assertEquals("Steave", user.getName());
    }

    @Test
    void delete() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .delete("/user/2");

        MvcResult result = mvc.perform(request).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(204, response.getStatus());

        Optional<User> user = repository.findById(2);
        assertFalse(user.isPresent());
    }

    @Test
    void searchByName() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/user/search?name=Mich");
        MvcResult result = mvc.perform(request).andReturn();
        MockHttpServletResponse response = result.getResponse();

        assertEquals(200, response.getStatus());

        String expected = "[{\"id\":4,\"name\":\"Michelle\"},{\"id\":5,\"name\":\"Michael\"}]";
        assertEquals(expected, response.getContentAsString());
    }
}