package com.testetecnico.ticket_1;

/**
 * Interface do padrão Observer, implementada por componentes da nave
 * que precisam reagir a mudanças no nível de dano do
 * {@link com.testetecnico.ticket_1.Nucleo}.
 */
public interface Observer {

    /**
     * Notificado pelo {@link com.testetecnico.ticket_1.Nucleo} quando
     * há uma mudança relevante no nível de dano.
     *
     * @param contagemDano contagem de dano atual do núcleo no momento da notificação
     */
    public void notificate(int contagemDano);
}