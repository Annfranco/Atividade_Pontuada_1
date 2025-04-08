package com.senai.atividade_pontuada.APIREST_Spring_Boot.model;

public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");

    private String textoEstadoCivil;

    EstadoCivil(String textoEstadoCivil) {
        this.textoEstadoCivil = textoEstadoCivil;
    }
}
