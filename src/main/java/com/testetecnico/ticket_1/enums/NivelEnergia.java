package com.testetecnico.ticket_1.enums;

public enum NivelEnergia {
    INTACTA(0),
    LEVE(1),
    MODERADO(2),
    CRITICO(3),
    FATAL(4);

    private int valor;

    NivelEnergia(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
