package com.testetecnico.testes_menu;

import com.testetecnico.ticket_3.Nave;
import com.testetecnico.ticket_3.modificacoes.DanoFogo;
import com.testetecnico.ticket_3.modificacoes.DisparoMultiplo;
import com.testetecnico.ticket_3.modificacoes.PerfuracaoBlindagem;

import java.util.Scanner;

/**
 * Menu de console responsável por adicionar modificações à arma
 * atualmente equipada em uma {@link Nave}.
 * <p>
 * Utiliza o mesmo {@link Scanner} recebido para ler a opção
 * escolhida pelo usuário.
 */
public class OpcoesModificacoes {
    private final Scanner scanner;

    /**
     * Cria o menu de opções de modificação.
     *
     * @param scanner scanner usado para ler as opções digitadas pelo usuário
     */
    public OpcoesModificacoes(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Exibe o menu de adição de modificações para a arma atual da nave.
     * <p>
     * Opções disponíveis:
     * <ul>
     *     <li>1 - Adiciona {@link DanoFogo} à arma atual</li>
     *     <li>2 - Adiciona {@link PerfuracaoBlindagem} à arma atual</li>
     *     <li>3 - Adiciona {@link DisparoMultiplo} à arma atual</li>
     *     <li>0 - Encerra o menu</li>
     * </ul>
     * Diferente de {@link OpcoesArmamentos} e {@link OpcoesFuncoes}, uma
     * opção válida (1, 2 ou 3) não encerra o menu — as opções continuam
     * sendo reapresentadas até que o usuário escolha voltar (0). Se a
     * nave não tiver nenhuma arma equipada ({@link Nave#getArmaAtual()}
     * retornando {@code null}), a modificação não é adicionada e uma
     * mensagem informativa é exibida.
     *
     * @param nave nave cuja arma atual receberá a modificação
     */
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