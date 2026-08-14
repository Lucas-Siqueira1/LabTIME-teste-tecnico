package com.testetecnico.ticket_3.armas;

import com.testetecnico.ticket_3.Arma;

/**
 * Arma base: míssil.
 */
public class Missil implements Arma {

    /**
     * Executa a sequência de disparo do míssil: verificação de
     * armamento, conferência de trajetória e disparo.
     */
    @Override
    public void atirar() {
        System.out.println("Verificando armamento...");
        System.out.println("Conferindo trajetória...");
        System.out.println("Mísseis disparados com sucesso!\n");
    }
}