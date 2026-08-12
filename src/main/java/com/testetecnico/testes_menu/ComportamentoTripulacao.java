package com.testetecnico.testes_menu;

import com.testetecnico.ticket_2.Tripulante;

import java.util.Scanner;

public class ComportamentoTripulacao {
    public void menuTripulantes(Tripulante tripulante) {
        Scanner scanner = new Scanner(System.in);
        var opcoesFuncoes = new OpcoesFuncoes();

        while(true) {
            System.out.println("\nSistema de Delegação de Funções");
            System.out.println("---------------------------------------------");
            System.out.println("1 - Alterar função");
            System.out.println("2 - Iniciar trabalho");
            System.out.println("0 - Voltar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    opcoesFuncoes.menuOpcoesFuncoes(tripulante);
                    break;
                case 2:
                    tripulante.trabalhar();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }

    }


}
