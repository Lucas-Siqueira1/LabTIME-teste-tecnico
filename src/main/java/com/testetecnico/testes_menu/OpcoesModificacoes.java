package com.testetecnico.testes_menu;

import com.testetecnico.ticket_3.Nave;
import com.testetecnico.ticket_3.modificacoes.DanoFogo;
import com.testetecnico.ticket_3.modificacoes.DisparoMultiplo;
import com.testetecnico.ticket_3.modificacoes.PerfuracaoBlindagem;

import java.util.Scanner;

public class OpcoesModificacoes {
    private final Scanner scanner;

    public OpcoesModificacoes(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menuModificacoes(Nave nave) {
        while(true) {
            System.out.println("\nEscolha qual modificação deseja adicionar a sua arma");
            System.out.println("------------------------------------------------------------------");
            System.out.println("1 - Efeito de Fogo");
            System.out.println("2 - Perfuração de Blindagem");
            System.out.println("3 - Disparos Múltiplos");
            System.out.println("0 - Voltar\n");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if(nave.getArmaAtual() != null) {
                        nave.adicionarModificacao(new DanoFogo(nave.getArmaAtual()));
                        System.out.println("Modificação adicionada com sucesso!\n");
                    }else {
                        System.out.println("Você ainda não possui uma arma equipada.");
                    }
                    break;
                case 2:
                    if(nave.getArmaAtual() != null) {
                        nave.adicionarModificacao(new PerfuracaoBlindagem(nave.getArmaAtual()));
                        System.out.println("Modificação adicionada com sucesso!\n");
                    }else {
                        System.out.println("Você ainda não possui uma arma equipada.");
                    }
                    break;
                case 3:
                    if(nave.getArmaAtual() != null) {
                        nave.adicionarModificacao(new DisparoMultiplo(nave.getArmaAtual()));
                        System.out.println("Modificação adicionada com sucesso!\n");
                    }else {
                        System.out.println("Você ainda não possui uma arma equipada.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
