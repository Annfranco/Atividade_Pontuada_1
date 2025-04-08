package com.senai.atividade_pontuada.APIREST_Spring_Boot.model;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico");

    private String nomeSetor;

    Setor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
}
