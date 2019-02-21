package org.otp.orgtoolssuite.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
@AutoConfigureMockMvc
public class TestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void test() throws Exception {
        this.mvc.perform(get("/api/test")).andExpect(status().isOk())
                .andExpect(content().string("test v1"));
    }


}
