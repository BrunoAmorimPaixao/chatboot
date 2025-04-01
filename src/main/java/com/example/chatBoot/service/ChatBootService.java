package com.example.chatBoot.service;

import com.example.chatBoot.model.PerguntaResposta;
import com.example.chatBoot.repository.PerguntaRespostaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChatBootService {

    private final PerguntaRespostaRepository repository;


    public ChatBootService(PerguntaRespostaRepository repository) {
        this.repository = repository;
    }

    public String responder (String pergunta){
        Optional<PerguntaResposta> resultado = repository.findByPerguntaContainingIgnoreCase(pergunta);
        return resultado.map(PerguntaResposta::getResposta).orElse("Desculpe! Pode reformular a pergunta?");
    }
}
