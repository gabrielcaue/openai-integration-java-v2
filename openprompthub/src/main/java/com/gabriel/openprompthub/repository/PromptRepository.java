package com.gabriel.openprompthub.repository;

import com.gabriel.openprompthub.model.Prompt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromptRepository extends JpaRepository<Prompt, Long> {
}
