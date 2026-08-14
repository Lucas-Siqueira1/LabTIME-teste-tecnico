package com.testetecnico.testes_menu;

import com.testetecnico.ticket_3.Nave;
import com.testetecnico.ticket_3.modificacoes.DanoFogo;
import com.testetecnico.ticket_3.modificacoes.DisparoMultiplo;
import com.testetecnico.ticket_3.modificacoes.PerfuracaoBlindagem;

import java.util.Scanner;

public class OpcoesModificacoes {
    public void menuModificacoes(Nave nave) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Escolha qual modificação deseja adicionar a sua arma");
            System.out.println("------------------------------------------------------------------");
            System.out.println("1 - Efeito de Fogo");
            System.out.println("2 - Perfuração de Blindagem");
            System.out.println("3 - Disparos Múltiplos");
            System.out.println("0 - Voltar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    nave.adicionarModificacao(new DanoFogo(nave.getArmaAtual()));
                    System.out.println("Modificação adicionada com sucesso!\n");
                    break;
                case 2:
                    nave.adicionarModificacao(new PerfuracaoBlindagem(nave.getArmaAtual()));
                    System.out.println("Modificação adicionada com sucesso!\n");
                    break;
                case 3:
                    nave.adicionarModificacao(new DisparoMultiplo(nave.getArmaAtual()));
                    System.out.println("Modificação adicionada com sucesso!\n");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
