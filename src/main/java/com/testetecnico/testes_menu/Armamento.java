package com.testetecnico.testes_menu;

import com.testetecnico.ticket_3.Nave;

import java.util.Scanner;

public class Armamento {
    private final Scanner scanner;

    public Armamento(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menuArmamento(Nave nave) {
        var opcoesArmamentos = new OpcoesArmamentos(scanner);
        var opcoesModificacoes = new OpcoesModificacoes(scanner);

        while(true) {

            System.out.println("\nGerenciamento de armamento");
            System.out.println("----------------------------------");
            System.out.println("1 - Selecionar armamento");
            System.out.println("2 - Efetuar disparo");
            System.out.println("3 - Adicionar modificação");
            System.out.println("0 - Voltar\n");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    opcoesArmamentos.menuOpcoesArmamentos(nave);
                    break;
                case 2:
                    nave.atirar();
                    break;
                case 3:
                    opcoesModificacoes.menuModificacoes(nave);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
