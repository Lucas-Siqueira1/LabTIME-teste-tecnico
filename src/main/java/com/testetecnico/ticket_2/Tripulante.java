package com.testetecnico.ticket_2;

/**
 * Representa um membro da tripulação da nave, com um nome e uma
 * {@link Funcao} atualmente exercida (padrão Strategy).
 */
public class Tripulante {

    private String name;
    private Funcao funcaoAtual;

    /**
     * Cria um tripulante com o nome e a função inicial informados.
     *
     * @param name nome do tripulante
     * @param funcaoAtual função inicial exercida pelo tripulante
     */
    public Tripulante(String name, Funcao funcaoAtual) {
        this.name = name;
        this.funcaoAtual = funcaoAtual;
    }

    /** @return o nome do tripulante */
    public String getName() {
        return name;
    }

    /** @param name novo nome do tripulante */
    public void setName(String name) {
        this.name = name;
    }

    /** @return a função atualmente exercida pelo tripulante */
    public Funcao getFuncao() {
        return funcaoAtual;
    }

    /**
     * Troca a função atual do tripulante pela informada.
     *
     * @param novaFuncao nova função a ser exercida
     */
    public void trocarFuncao(Funcao novaFuncao) {
        this.funcaoAtual = novaFuncao;
    }

    /**
     * Executa o trabalho correspondente à função atual do tripulante,
     * delegando para {@link Funcao#trabalhar}.
     */
    public void trabalhar() {
        funcaoAtual.trabalhar(this);
    }
}