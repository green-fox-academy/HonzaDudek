package com.greenfoxacademy.guardians;

import com.greenfoxacademy.guardians.Controllers.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    MockMvc mockMvc;

    public GuardianControllerTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    public void testGrootStatusOk() throws Exception {
        mockMvc.perform(post("/groot?message=hellothere"))
                .andExpect(s)
    }
}
