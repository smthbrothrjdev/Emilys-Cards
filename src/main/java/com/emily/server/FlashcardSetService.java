package com.emily.server;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class FlashcardSetService {

    private final FlashcardSetRepo flashcardSetRepo;


    public FlashcardSetService(FlashcardSetRepo flashcardSetRepo) {
        this.flashcardSetRepo = flashcardSetRepo;
    }

    public List<FlashcardSetEntity> getall() {
        return this.flashcardSetRepo.findAll();
    }

    public FlashcardSetEntity getFLashcard(String name) {
        return (flashcardSetRepo.findByName(name).orElseThrow(()-> new NoSuchElementException("not found")));
    }
}
