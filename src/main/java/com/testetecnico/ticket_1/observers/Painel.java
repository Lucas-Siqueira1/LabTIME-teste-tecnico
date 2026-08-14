package com.testetecnico.ticket_1.observers;

import com.testetecnico.ticket_1.Observer;
import com.testetecnico.ticket_1.enums.NivelEnergia;

/**
 * Observador responsável por exibir alertas no painel da nave de
 * acordo com o nível de dano do núcleo.
 */
public class Painel implements Observer {

    /**
     * Exibe um alerta urgente de estado crítico se a contagem de dano
     * estiver em {@link NivelEnergia#CRITICO}; caso contrário, exibe
     * uma mensagem de que a energia foi estabilizada.
     *
     * @param contagemDano contagem de dano atual do núcleo
     */
    @Override
    public void notificate(int contagemDano) {
        if (contagemDano == NivelEnergia.CRITICO.getValor()) {
            System.out.println("\nURGENTE!!!\nALERTA DE ESTADO CRITICO: ENERGIA ABAIXO DE 25%!");
        } else {
            System.out.println("\nNúcleo reparado! Energia estabilizada.");
        }
    }
}