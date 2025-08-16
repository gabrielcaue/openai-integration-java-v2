package com.gabriel.openprompthub.service;

import com.gabriel.openprompthub.model.Prompt;
import com.gabriel.openprompthub.repository.PromptRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromptService {

    private final PromptRepository repository;

    public PromptService(PromptRepository repository) {
        this.repository = repository;
    }

    public List<Prompt> listarTodos() {
        return repository.findAll();
    }

    public Prompt salvar(Prompt prompt) {
        return repository.save(prompt);
    }

    public Prompt buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
