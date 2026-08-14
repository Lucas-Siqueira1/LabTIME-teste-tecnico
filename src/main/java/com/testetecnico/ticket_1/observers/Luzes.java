package com.testetecnico.ticket_1.observers;

import com.testetecnico.ticket_1.Observer;
import com.testetecnico.ticket_1.enums.NivelEnergia;

/**
 * Observador responsável por ajustar a iluminação da nave de acordo
 * com o nível de dano do núcleo.
 */
public class Luzes implements Observer {

    /**
     * Abaixa o nível das luzes para economizar energia se a contagem
     * de dano estiver em {@link NivelEnergia#CRITICO}; caso contrário,
     * retorna as luzes ao nível padrão.
     *
     * @param contagemDano contagem de dano atual do núcleo
     */
    @Override
    public void notificate(int contagemDano) {
        if (contagemDano == NivelEnergia.CRITICO.getValor()) {
            System.out.println("Abaixando nível das luzes para economizar energia!");
        } else {
            System.out.println("Retornando às luzes para o nível padrão.\n");
        }
    }
}