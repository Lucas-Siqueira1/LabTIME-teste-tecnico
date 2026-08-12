package com.testetecnico.ticket_1.enums;

public enum NivelEnergia {
    FATAL(4),
    CRITICO(3);

    private int valor;

    NivelEnergia(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
