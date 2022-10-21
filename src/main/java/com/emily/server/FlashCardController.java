package com.emily.server;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin()
public class FlashCardController {



 private final FlashCardService fcs;

    public FlashCardController(FlashCardService fcs) {
        this.fcs = fcs;
    }

    @GetMapping("/flashcards")
    public List<FlashCardEntity> getAllFlashCards(){
        return fcs.findAll();
    }

    @PostMapping("/flashcards")
    public FlashCardEntity addAFlashcard(@RequestBody FlashCardDTO entity){
        return fcs.addOne(entity);
    }

    @GetMapping("flashcards/{front}")
    public FlashCardEntity getByFrontText(@PathVariable String front){
        return fcs.getByFront(front);
    }
    @PatchMapping("/flashcards/{front}")
    public FlashCardEntity patchByFrontText(@PathVariable String front, @RequestBody Map<String,String> fc){
      return fcs.patchByFront(front, fc);
    }

}
