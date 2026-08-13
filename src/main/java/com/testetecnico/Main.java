package com.testetecnico;

import com.testetecnico.testes_menu.Armamento;
import com.testetecnico.testes_menu.ComportamentoTripulacao;
import com.testetecnico.ticket_1.observers.Escudo;
import com.testetecnico.ticket_1.observers.Luzes;
import com.testetecnico.ticket_1.Nucleo;
import com.testetecnico.ticket_1.observers.Painel;
import com.testetecnico.testes_menu.SistemaEnergia;
import com.testetecnico.ticket_2.Tripulante;
import com.testetecnico.ticket_2.funcoes.FuncaoPiloto;
import com.testetecnico.ticket_3.Nave;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean executando = true;

        var sistemaEnergia = new SistemaEnergia();
        var comportamentoTripulacao = new ComportamentoTripulacao();
        var armamento = new Armamento();

        var nucleo = new Nucleo();
        var painel = new Painel();
        var escudo = new Escudo();
        var luzes = new Luzes();

        var piloto = new FuncaoPiloto();
        var tripulante1 = new Tripulante("Lucas", piloto);
        var nave = new Nave();

        nucleo.addObserver(painel);
        nucleo.addObserver(escudo);
        nucleo.addObserver(luzes);

        System.out.println("Menu de Interação");
        System.out.println("-----------------------");

        while(executando) {
            System.out.println("\n1 - Testar Sistema de Contingência do Núcleo da Nave");
            System.out.println("2 - Testar Comportamento Dinâmico da Tripulação");
            System.out.println("3 - Testar Armamento Modular e Modificadores Piratas");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    sistemaEnergia.menuNave(nucleo, escudo, luzes, painel);
                    break;
                case 2:
                    comportamentoTripulacao.menuTripulantes(tripulante1);
                    break;
                case 3:
                    armamento.menuArmamento(nave);
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