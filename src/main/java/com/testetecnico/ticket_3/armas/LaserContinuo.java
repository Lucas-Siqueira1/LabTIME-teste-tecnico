package com.testetecnico.ticket_3.armas;

import com.testetecnico.ticket_3.Arma;

/**
 * Arma base: laser contínuo.
 */
public class LaserContinuo implements Arma {

    /**
     * Executa a sequência de disparo do laser contínuo: preparação,
     * conferência de carga e disparo.
     */
    @Override
    public void atirar() {
        System.out.println("Preparando armamento a laser...");
        System.out.println("Conferindo carga...");
        System.out.println("Iniciando disparo contínuo do laser.");
        System.out.println("Disparo concluído com sucesso!\n");
    }
}