package com.testetecnico.ticket_1;

import com.testetecnico.ticket_1.enums.NivelEnergia;

import java.util.ArrayList;
import java.util.List;

public class Nucleo {

    private List<Observer> observers = new ArrayList<>();
    private int contagemDano = 0;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public int tomarDano() {
        if (++contagemDano == NivelEnergia.CRITICO.getValor()) {
            notificarObservers();
            return NivelEnergia.CRITICO.getValor();
        }else if (contagemDano >= NivelEnergia.FATAL.getValor()) {
            return NivelEnergia.FATAL.getValor();
        }
        return contagemDano;
    }

    public int repararNucleo() {
        boolean estavaCritico = (contagemDano == NivelEnergia.CRITICO.getValor());
        this.contagemDano = 0;
        if (estavaCritico) {
            notificarObservers();
        }
        return contagemDano;
    }

    public void nivelEnergia() {
        if (contagemDano == NivelEnergia.INTACTA.getValor()) System.out.println("\nO nivel de energia do nucleo esta em 100%!\n");
        else if (contagemDano == NivelEnergia.LEVE.getValor()) System.out.println("\nO nivel de energia do nucleo esta em 70%!\n");
        else if (contagemDano == NivelEnergia.MODERADO.getValor()) System.out.println("\nO nivel de energia do nucleo esta em 40%!\n");
        else if (contagemDano == NivelEnergia.CRITICO.getValor()) System.out.println("\nAtencao!\nO nivel de energia do nucleo esta em 10%!\n");
    }

    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.notificate(contagemDano);
        }
    }


}
