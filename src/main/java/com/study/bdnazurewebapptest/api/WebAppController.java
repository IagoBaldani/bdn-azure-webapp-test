package com.study.bdnazurewebapptest.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WebAppController {

    @GetMapping
    public ResponseEntity<String> getMethod(@RequestParam(value = "nome") String nome){
        if(nome.equals("")){
            return ResponseEntity.status(HttpStatus.OK).body("Olá, convidado!");
        }
        else{
            String resposta = "Olá, " + nome + "!";
            return ResponseEntity.status(HttpStatus.OK).body(resposta);
        }
    }
}
