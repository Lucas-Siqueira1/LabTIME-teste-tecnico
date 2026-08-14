package com.testetecnico.ticket_1.observers;

import com.testetecnico.ticket_1.Observer;
import com.testetecnico.ticket_1.enums.NivelEnergia;

/**
 * Observador responsável por ajustar os escudos da nave de acordo
 * com o nível de dano do núcleo.
 */
public class Escudo implements Observer {

    /**
     * Fortifica os escudos se a contagem de dano estiver em
     * {@link NivelEnergia#CRITICO}; caso contrário, normaliza os escudos.
     *
     * @param contagemDano contagem de dano atual do núcleo
     */
    @Override
    public void notificate(int contagemDano) {
        if (contagemDano == NivelEnergia.CRITICO.getValor()) {
            System.out.println("Fortificando os escudos nos locais atacados!");
        } else {
            System.out.println("Normalizando escudo.");
        }
    }
}