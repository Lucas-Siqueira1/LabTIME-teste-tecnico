package com.testetecnico.ticket_1.observers;

import com.testetecnico.ticket_1.Observer;
import com.testetecnico.ticket_1.enums.NivelEnergia;

public class Luzes implements Observer {
    @Override
    public void notificate(int contagemDano) {
        if (contagemDano == NivelEnergia.CRITICO.getValor()) {
            System.out.println("Abaixando nível das luzes para economizar energia!");
        } else {
            System.out.println("Retornando às luzes para o nível padrão.\n");
        }
    }
}
