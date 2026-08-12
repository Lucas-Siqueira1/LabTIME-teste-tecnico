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
        }else if (contagemDano >= NivelEnergia.FATAL.getValor()) {
            System.out.println("\nA nave sofreu um dano fatal!");
            System.out.println("GAME OVER! A nave foi destruída.");
            System.exit(0);
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
        if (contagemDano == 0) System.out.println("\nO nivel de energia do nucleo esta em 100%!\n");
        else if (contagemDano == 1) System.out.println("\nO nivel de energia do nucleo esta em 70%!\n");
        else if (contagemDano == 2) System.out.println("\nO nivel de energia do nucleo esta em 40%!\n");
        else if (contagemDano == NivelEnergia.CRITICO.getValor()) System.out.println("\nAtencao!\nO nivel de energia do nucleo esta em 10%!\n");
    }

    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.notificate(contagemDano);
        }
    }


}
