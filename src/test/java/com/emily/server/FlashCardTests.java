package com.emily.server;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class FlashCardTests {

    @Autowired
    MockMvc mvc;

    @Autowired FlashCardRepo repo;

    private final String URL="localhost:8080";



    @Test
    @Transactional
    @Rollback
    void getAllFlashCardsReturnsOk() throws Exception{
        mvc.perform(get("/flashcards")).andExpect(status().isOk());
    }


}
