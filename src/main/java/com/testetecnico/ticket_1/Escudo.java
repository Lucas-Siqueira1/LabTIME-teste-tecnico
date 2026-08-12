package com.testetecnico.ticket_1;

public class Escudo implements Observer{
    @Override
    public void notificate(int contagemDano) {
        if (contagemDano == 3) {
            System.out.println("Fortificando os escudos nos locais atacados!");
        } else {
            System.out.println("Normalizando escudo.");
        }
    }
}
