package com.emily.server;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FlashcardSetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "flashcardSetEntity", fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<FlashCardEntity> flashcardSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<FlashCardEntity> getFlashcardSet() {
        return flashcardSet;
    }

    public void setFlashcardSet(Set<FlashCardEntity> flashcardSet) {
        this.flashcardSet = flashcardSet;
    }
}

