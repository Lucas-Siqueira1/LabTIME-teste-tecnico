package com.testetecnico.ticket_3.armas;

import com.testetecnico.ticket_3.Arma;

/**
 * Arma base: canhão de plasma.
 */
public class CanhaoDePlasma implements Arma {

    /**
     * Executa a sequência de disparo do canhão de plasma:
     * carregamento, travamento de mira e disparo.
     */
    @Override
    public void atirar() {
        System.out.println("Carregando canhão de plasma...");
        System.out.println("Travando a mira no alvo...");
        System.out.println("Disparo efetuado com sucesso!");
    }
}