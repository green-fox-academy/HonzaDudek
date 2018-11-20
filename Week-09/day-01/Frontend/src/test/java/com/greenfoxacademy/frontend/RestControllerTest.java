package com.greenfoxacademy.frontend;

import com.greenfoxacademy.frontend.Controllers.RestController;
import com.greenfoxacademy.frontend.Repositories.LogRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestController.class)
public class RestControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    LogRepo repo;

    @Test
    public void doublingTestStatus() throws Exception {
        mockMvc.perform(get("/doubling?input=5"))
                .andExpect(status().is(200));
    }

    @Test
    public void doublingTestReturn() throws Exception {
        mockMvc.perform(get("/doubling?input=5"))
                .andExpect(jsonPath("$.received", is(5)))
                .andExpect(jsonPath("$.result", is(10)));
    }

    @Test
    public void greeterStatus() throws Exception {
        mockMvc.perform(get("/greeter?name=Petike&title=student"))
                .andExpect(status().is(200));
    }

    @Test
    public void greeterTestReturnFullWelcome() throws Exception {
        mockMvc.perform(get("/greeter?name=Petike&title=student"))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
    }

    @Test
    public void greeterTestReturnNameOnly() throws Exception {
        mockMvc.perform(get("/greeter?name=Petike"))
                .andExpect(jsonPath("$.welcome_message", is("You also have to provide title!")));
    }

    @Test
    public void greeterTestReturnTitleOnly() throws Exception {
        mockMvc.perform(get("/greeter?title=student"))
                .andExpect(jsonPath("$.welcome_message", is("You also have to provide name!")));
    }

    @Test
    public void appendAStatusOk() throws Exception {
        mockMvc.perform(get("/appenda/kuty"))
                .andExpect(status().isOk());
    }

    @Test
    public void appendAStatusError() throws Exception {
        mockMvc.perform(get("/appenda/"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void appendAReturn() throws Exception {
        mockMvc.perform(get("/appenda/kuty"))
                .andExpect(jsonPath("$.appended", is("kutya")));
    }

    @Test
    public void doUntilStatusOk() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 5}"))
                .andExpect(status().isOk());
    }

    @Test
    public void doUntilStatusError() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(jsonPath("$.error", is("Please provide a number!")));
    }

    @Test
    public void doUntilReturn() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 7}"))
                .andExpect(jsonPath("result", is(28)));
    }

    @Test
    public void arraysStatusOk() throws Exception {
        mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\": \"sum\", \"numbers\": [1, 2, 5, 10]}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("result", is(18)));
    }
}
