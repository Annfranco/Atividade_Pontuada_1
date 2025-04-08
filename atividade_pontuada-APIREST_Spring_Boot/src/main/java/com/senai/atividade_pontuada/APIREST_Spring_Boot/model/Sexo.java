package com.senai.atividade_pontuada.APIREST_Spring_Boot.model;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String textoSexo;

    Sexo(String textoSexo) {
        this.textoSexo = textoSexo;
    }
}
