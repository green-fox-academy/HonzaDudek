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

    @Test
    public void testShipOverallStatusStatusOk() throws Exception {
        mockMvc.perform(get("/rocket"))
                .andExpect(status().isOk());
    }

    @Test
    public void testShipOverallStatusResponse() throws Exception {
        mockMvc.perform(get("/rocket")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.caliber25", is(0)))
                .andExpect(jsonPath("$.caliber30", is(0)))
                .andExpect(jsonPath("$.caliber50", is(0)))
                .andExpect(jsonPath("$.shipstatus", is("empty")))
                .andExpect(jsonPath("$.ready", is(false)));
    }

    @Test
    public void testShipOverallStatusResponseAfterFill() throws Exception {
        mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.received", is(".50")))
                .andExpect(jsonPath("$.amount", is(5000)))
                .andExpect(jsonPath("$.shipstatus", is("40%")))
                .andExpect(jsonPath("$.ready", is(false)));
    }

    @Test
    public void testShipOverallStatusResponseFillWithNoParams() throws Exception {
        mockMvc.perform(get("/rocket/fill")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(400))
                .andExpect(jsonPath("$.error", is("Specify the caliber and amount of ammo to re-fill")));
    }
}
