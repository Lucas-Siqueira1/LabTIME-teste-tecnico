package com.testetecnico.ticket_3.armas;

import com.testetecnico.ticket_3.Arma;

public class CanhaoDePlasma implements Arma {
    @Override
    public void atirar() {
        System.out.println("Carregando canhão de plasma...");
        System.out.println("Travando a mira no alvo...");
        System.out.println("Disparo efetuado com sucesso!");
    }
}
