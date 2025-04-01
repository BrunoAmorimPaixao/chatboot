package com.example.chatBoot;

import com.example.chatBoot.model.PerguntaResposta;
import com.example.chatBoot.repository.PerguntaRespostaRepository;
import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;

@Comment("")
public class DataLoader implements CommandLineRunner {

    private final PerguntaRespostaRepository repository;

    public DataLoader(PerguntaRespostaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new PerguntaResposta("Qual o horario de funcionamento","Funcionamento de 9h as 18hs"));
    }
}
