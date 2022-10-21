package com.emily.server;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class FlashcardSetController {

    private final FlashCardService flashCardService;
    private final FlashcardSetService flashcardSetService;


    public FlashcardSetController(FlashCardService flashCardService, FlashcardSetService flashcardSetService) {
        this.flashCardService = flashCardService;
        this.flashcardSetService = flashcardSetService;
    }


    @GetMapping("/sets")
    public List<FlashcardSetEntity> getAllSets(){
        return flashcardSetService.getall();

    }

    @GetMapping("/sets/{name}")
    public FlashcardSetEntity getFlahscardSet(@PathVariable String name){
        return flashcardSetService.getFLashcard(name);
    }
}
