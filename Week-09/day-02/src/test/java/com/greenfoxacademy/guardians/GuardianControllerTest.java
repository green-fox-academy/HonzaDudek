package com.greenfoxacademy.guardians;

import com.greenfoxacademy.guardians.Controllers.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGrootStatusOk() throws Exception {
        mockMvc.perform(get("/groot?message=hellothere"))
                .andExpect(status().isOk());
    }

    @Test
    public void testGrootResponse() throws Exception {
        mockMvc.perform(get("/groot?message=hellothere"))
                .andExpect(jsonPath("translation", is("I am Groot!")));
    }

    @Test
    public void testGrootResponseNoInput() throws Exception {
        mockMvc.perform(get("/groot"))
                .andExpect(status().is(400))
                .andExpect(jsonPath("error", is("I am Groot!")));
    }

    @Test
    public void testYonduStatusOk() throws Exception {
        mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
                .andExpect(status().isOk());
    }

    @Test
    public void testYonduReturn() throws Exception {
        mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
                .andExpect(jsonPath("speed", is(10.0)));
    }

    @Test
    public void testYonduNoDistance() throws Exception {
        mockMvc.perform(get("/yondu?time=10.0"))
                .andExpect(status().is(400))
                .andExpect(jsonPath("error", is("You have to provide distance")));
    }

    @Test
    public void testYonduNoTime() throws Exception {
        mockMvc.perform(get("/yondu?distance=100.0"))
                .andExpect(status().is(400))
                .andExpect(jsonPath("error", is("You have to provide time")));
    }
}
