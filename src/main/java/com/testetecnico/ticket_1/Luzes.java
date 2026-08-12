package com.testetecnico.ticket_1;

import com.testetecnico.ticket_1.enums.NivelEnergia;

public class Luzes implements Observer{
    @Override
    public void notificate(int contagemDano) {
        if (contagemDano == NivelEnergia.CRITICO.getValor()) {
            System.out.println("Abaixando nível das luzes para economizar energia!");
        } else {
            System.out.println("Retornando às luzes para o nível padrão.\n");
        }
    }
}
