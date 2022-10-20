package com.emily.server;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlashCardRepo extends JpaRepository<FlashCardEntity, Long> {
    Optional<FlashCardEntity> findByFront(String front);
}
