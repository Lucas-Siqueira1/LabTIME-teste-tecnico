package com.testetecnico.ticket_2;

public class Tripulante {

    private String name;
    private Funcao funcaoAtual;

    public Tripulante(String name, Funcao funcaoAtual) {
        this.name = name;
        this.funcaoAtual = funcaoAtual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Funcao getFuncao() {
        return funcaoAtual;
    }

    public void trocarFuncao(Funcao novaFuncao) {
        this.funcaoAtual = novaFuncao;
    }

    public void trabalhar() {
        funcaoAtual.trabalhar(this);
    }
}
