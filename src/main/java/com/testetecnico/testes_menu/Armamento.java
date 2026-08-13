package com.testetecnico.testes_menu;

import com.testetecnico.ticket_3.Nave;

import java.util.Scanner;

public class Armamento {
    public void menuArmamento(Nave nave) {
        Scanner scanner = new Scanner(System.in);
        var opcoesArmamentos = new OpcoesArmamentos();

        while(true) {

            System.out.println("Gerenciamento de armamento");
            System.out.println("----------------------------------");
            System.out.println("1 - Selecionar armamento");
            System.out.println("2 - Efetuar disparo");
            System.out.println("0 - Voltar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    opcoesArmamentos.menuOpcoesArmamentos(nave);
                    break;
                case 2:
                    nave.atirar();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
