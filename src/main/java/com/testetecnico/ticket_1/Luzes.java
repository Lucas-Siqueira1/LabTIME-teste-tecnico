package com.testetecnico.ticket_1;

public class Luzes implements Observer{
    @Override
    public void notificate(int contagemDano) {
        if (contagemDano == 3) {
            System.out.println("Abaixando nível das luzes para economizar energia!");
        } else {
            System.out.println("Retornando às luzes para o nível padrão.\n");
        }
    }
}
