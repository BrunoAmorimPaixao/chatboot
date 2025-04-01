package com.example.chatBoot.repository;

import com.example.chatBoot.model.PerguntaResposta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PerguntaRespostaRepository extends JpaRepository<PerguntaResposta, Long> {
    Optional<PerguntaResposta> findByPerguntaContainingIgnoreCase(String pergunta);

}
