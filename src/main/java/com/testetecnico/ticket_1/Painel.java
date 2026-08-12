package com.testetecnico.ticket_1;

import com.testetecnico.ticket_1.enums.NivelEnergia;

public class Painel implements Observer{
    @Override
    public void notificate(int contagemDano) {
        if (contagemDano == NivelEnergia.CRITICO.getValor()) {
            System.out.println("\nURGENTE!!!\nALERTA DE ESTADO CRITICO: ENERGIA ABAIXO DE 25%!");
        } else {
            System.out.println("\nNúcleo reparado! Energia estabilizada.");
        }
    }
}
