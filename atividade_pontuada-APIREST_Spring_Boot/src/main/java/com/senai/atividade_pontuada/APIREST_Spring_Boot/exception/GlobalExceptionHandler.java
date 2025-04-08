package com.senai.atividade_pontuada.APIREST_Spring_Boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handlerIllegalArgument(IllegalArgumentException erro) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("mensagem", erro.getMessage()));
    }

    @ExceptionHandler(EmailJaCadastradoException.class)
    public ResponseEntity<Map<String, Object>> EmailJaCadastrado(EmailJaCadastradoException erro) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(Map.of("mensagem", erro.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> MethodArgumentNotValid(MethodArgumentNotValidException erro) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("mensagem", erro.getFieldErrors().get(0).getDefaultMessage()));
    }

    @ExceptionHandler(NoResourceFoundException .class)
    public ResponseEntity<Map<String, Object>> NoResourceFound(NoResourceFoundException erro) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(Map.of("mensagem", "Funcionario não encontrado."));
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Map<String, Object>> HttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException erro) {
        return ResponseEntity
                .status(HttpStatus.METHOD_NOT_ALLOWED)
                .body(Map.of("mensagem", "Método não suportado."));
    }

}
