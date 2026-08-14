package com.testetecnico.ticket_3;

/**
 * Interface do padrão Strategy/Decorator, implementada por todo
 * armamento que pode ser equipado em uma {@link Nave}, incluindo
 * armas base e suas modificações ({@link ArmamentoDecorator}).
 */
public interface Arma {

    /**
     * Executa a ação de disparo desta arma.
     */
    public void atirar();
}