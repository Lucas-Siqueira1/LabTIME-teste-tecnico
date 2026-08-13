package com.testetecnico.ticket_3.armas;

import com.testetecnico.ticket_3.Arma;

public class LaserContinuo implements Arma {
    @Override
    public void atirar() {
        System.out.println("Preparando armamento a laser...");
        System.out.println("Conferindo carga...");
        System.out.println("Iniciando disparo contínuo do laser.");
        System.out.println("Disparo concluído com sucesso!\n");
    }
}
