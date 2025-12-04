package com.example.av2.dto;

import java.util.List;
import java.io.Serializable;

public class ListaNumerosDTO implements Serializable {

    private List<Integer> numeros;

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}