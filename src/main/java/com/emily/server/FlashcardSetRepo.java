package com.emily.server;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FlashcardSetRepo extends JpaRepository<FlashcardSetEntity, Long> {

    Optional<FlashcardSetEntity> findByName(String name);
}
