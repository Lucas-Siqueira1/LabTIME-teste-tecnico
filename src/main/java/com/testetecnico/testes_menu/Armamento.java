package com.testetecnico.testes_menu;

import com.testetecnico.ticket_3.Nave;

import java.util.Scanner;

/**
 * Menu de console responsável pelo gerenciamento de armamento
 * de uma {@link Nave}: seleção de arma, disparo e adição de
 * modificações.
 * <p>
 * Delega a seleção de arma para {@link OpcoesArmamentos} e a
 * adição de modificações para {@link OpcoesModificacoes}, ambos
 * criados com o mesmo {@link Scanner} recebido.
 */
public class Armamento {
    private final Scanner scanner;

    /**
     * Cria o menu de gerenciamento de armamento.
     *
     * @param scanner scanner usado para ler as opções digitadas pelo usuário
     */
    public Armamento(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Exibe o menu de gerenciamento de armamento da nave informada.
     * <p>
     * Opções disponíveis:
     * <ul>
     *     <li>1 - Abre o submenu de seleção de arma ({@link OpcoesArmamentos})</li>
     *     <li>2 - Efetua um disparo via {@link Nave#atirar()}</li>
     *     <li>3 - Abre o submenu de modificações ({@link OpcoesModificacoes})</li>
     *     <li>0 - Encerra o menu e retorna ao chamador</li>
     * </ul>
     *
     * @param nave nave cujo armamento será gerenciado neste menu
     */
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