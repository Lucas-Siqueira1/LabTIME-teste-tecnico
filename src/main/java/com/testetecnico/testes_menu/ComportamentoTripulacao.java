package com.testetecnico.testes_menu;

import com.testetecnico.ticket_2.Tripulante;

import java.util.Scanner;

/**
 * Menu de console responsável por gerenciar as ações disponíveis
 * para um {@link Tripulante}, como alteração de função e início
 * de trabalho.
 * <p>
 * Utiliza o mesmo {@link Scanner} recebido para ler a entrada do
 * usuário durante toda a interação.
 */
public class ComportamentoTripulacao {
    private final Scanner scanner;

    /**
     * Cria o menu de comportamento da tripulação.
     *
     * @param scanner scanner usado para ler as opções digitadas pelo usuário
     */
    public ComportamentoTripulacao(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Exibe o menu de delegação de funções para o tripulante informado
     * e mantém a interação em loop até que o usuário escolha voltar
     * (opção 0).
     * <p>
     * Opções disponíveis:
     * <ul>
     *     <li>1 - Abre o submenu de alteração de função ({@link OpcoesFuncoes})</li>
     *     <li>2 - Executa {@link Tripulante#trabalhar()}</li>
     *     <li>0 - Encerra o menu e retorna ao chamador</li>
     * </ul>
     * Opções inválidas exibem uma mensagem de erro e o menu é reapresentado.
     *
     * @param tripulante tripulante que terá suas funções/trabalho gerenciados neste menu
     */
    public void menuTripulantes(Tripulante tripulante) {
        var opcoesFuncoes = new OpcoesFuncoes(scanner);

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
