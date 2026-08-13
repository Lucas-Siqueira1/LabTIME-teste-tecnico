package com.testetecnico.ticket_3.armas;

import com.testetecnico.ticket_3.Arma;

public class Missil implements Arma {
    @Override
    public void atirar() {
        System.out.println("Verificando armamento...");
        System.out.println("Conferindo trajetória...");
        System.out.println("Mísseis disparados com sucesso!\n");
    }
}
