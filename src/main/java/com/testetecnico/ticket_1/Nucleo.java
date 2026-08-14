package com.testetecnico.ticket_1;

import com.testetecnico.ticket_1.enums.NivelEnergia;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa o núcleo de energia da nave, responsável por controlar
 * a contagem de dano acumulada e notificar seus {@link Observer}s
 * (padrão Observer) quando o dano atinge o nível
 * {@link NivelEnergia#CRITICO}.
 */
public class Nucleo {

    private List<Observer> observers = new ArrayList<>();
    private int contagemDano = 0;

    /**
     * Registra um observador para ser notificado sobre mudanças
     * no nível de dano do núcleo.
     *
     * @param observer observador a ser adicionado
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove um observador previamente registrado, que deixa de
     * ser notificado sobre mudanças no nível de dano do núcleo.
     *
     * @param observer observador a ser removido
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Incrementa em 1 a contagem de dano do núcleo.
     * <p>
     * Os observadores registrados só são notificados quando a
     * contagem de dano atinge exatamente {@link NivelEnergia#CRITICO}
     * — danos acima disso (incluindo {@link NivelEnergia#FATAL}) não
     * disparam nova notificação.
     *
     * @return a contagem de dano atual, exceto quando ela atinge ou
     *         ultrapassa {@link NivelEnergia#FATAL}, caso em que o
     *         valor de {@link NivelEnergia#FATAL} é retornado no lugar
     *         da contagem real
     */
    public int tomarDano() {
        if (++contagemDano == NivelEnergia.CRITICO.getValor()) {
            notificarObservers();
            return NivelEnergia.CRITICO.getValor();
        }else if (contagemDano >= NivelEnergia.FATAL.getValor()) {
            return NivelEnergia.FATAL.getValor();
        }
        return contagemDano;
    }

    /**
     * Zera a contagem de dano do núcleo, reparando-o por completo.
     * <p>
     * Se o núcleo estava em {@link NivelEnergia#CRITICO} no momento
     * do reparo, os observadores registrados são notificados (já com
     * a contagem de dano zerada).
     *
     * @return a contagem de dano após o reparo, que é sempre 0
     */
    public int repararNucleo() {
        boolean estavaCritico = (contagemDano == NivelEnergia.CRITICO.getValor());
        this.contagemDano = 0;
        if (estavaCritico) {
            notificarObservers();
        }
        return contagemDano;
    }

    /**
     * Exibe no console o nível de energia atual do núcleo, com base
     * na contagem de dano acumulada.
     * <p>
     * Não exibe nenhuma mensagem se a contagem de dano estiver em
     * {@link NivelEnergia#FATAL}.
     */
    public void nivelEnergia() {
        if (contagemDano == NivelEnergia.INTACTA.getValor()) System.out.println("\nO nivel de energia do nucleo esta em 100%!\n");
        else if (contagemDano == NivelEnergia.LEVE.getValor()) System.out.println("\nO nivel de energia do nucleo esta em 70%!\n");
        else if (contagemDano == NivelEnergia.MODERADO.getValor()) System.out.println("\nO nivel de energia do nucleo esta em 40%!\n");
        else if (contagemDano == NivelEnergia.CRITICO.getValor()) System.out.println("\nAtencao!\nO nivel de energia do nucleo esta em 10%!\n");
    }

    /**
     * Notifica todos os observadores registrados com a contagem de
     * dano atual do núcleo.
     */
    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.notificate(contagemDano);
        }
    }


}