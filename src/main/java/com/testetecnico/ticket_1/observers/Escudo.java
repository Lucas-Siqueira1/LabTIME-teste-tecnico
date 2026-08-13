package com.testetecnico.ticket_1.observers;

import com.testetecnico.ticket_1.Observer;
import com.testetecnico.ticket_1.enums.NivelEnergia;

public class Escudo implements Observer {
    @Override
    public void notificate(int contagemDano) {
        if (contagemDano == NivelEnergia.CRITICO.getValor()) {
            System.out.println("Fortificando os escudos nos locais atacados!");
        } else {
            System.out.println("Normalizando escudo.");
        }
    }
}
