package com.testetecnico.ticket_2;

/**
 * Interface do padrão Strategy, implementada pelas diferentes
 * funções que um {@link Tripulante} pode exercer a bordo da nave.
 */
public interface Funcao {

    /**
     * Executa a ação de trabalho correspondente a esta função,
     * usando o tripulante informado (tipicamente para exibir
     * mensagens personalizadas com seu nome).
     *
     * @param tripulante tripulante que está executando o trabalho
     */
    public void trabalhar(Tripulante tripulante);
}