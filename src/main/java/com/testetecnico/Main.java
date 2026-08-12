package com.testetecnico;

import com.testetecnico.ticket_1.Escudo;
import com.testetecnico.ticket_1.Luzes;
import com.testetecnico.ticket_1.Nucleo;
import com.testetecnico.ticket_1.Painel;
import com.testetecnico.ticket_1.testes_menu.SistemaEnergia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean executando = true;

        var sistemaEnergia = new SistemaEnergia();
        var nucleo = new Nucleo();

        var painel = new Painel();
        var escudo = new Escudo();
        var luzes = new Luzes();

        nucleo.addObserver(painel);
        nucleo.addObserver(escudo);
        nucleo.addObserver(luzes);

        System.out.println("Menu de Interação");
        System.out.println("-----------------------");

        while(executando) {
            System.out.println("1 - Testar Sistema de Contingência do Núcleo da Nave");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    sistemaEnergia.menuNave(nucleo, escudo, luzes, painel);
                    break;
                case 0:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();

    }
}