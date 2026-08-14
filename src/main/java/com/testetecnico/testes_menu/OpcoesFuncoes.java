package com.testetecnico.testes_menu;

import com.testetecnico.ticket_2.Tripulante;
import com.testetecnico.ticket_2.funcoes.FuncaoMecanico;
import com.testetecnico.ticket_2.funcoes.FuncaoOperadorCanhoes;
import com.testetecnico.ticket_2.funcoes.FuncaoPiloto;

import java.util.Scanner;

/**
 * Menu de console responsável por permitir a troca de função
 * de um {@link Tripulante}.
 * <p>
 * Utiliza o mesmo {@link Scanner} recebido para ler a opção
 * escolhida pelo usuário.
 */
public class OpcoesFuncoes {
    private final Scanner scanner;

    /**
     * Cria o menu de opções de função.
     *
     * @param scanner scanner usado para ler as opções digitadas pelo usuário
     */
    public OpcoesFuncoes(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Exibe o menu de escolha de função para o tripulante informado.
     * <p>
     * Opções disponíveis:
     * <ul>
     *     <li>1 - Atribui {@link FuncaoPiloto} e encerra o menu</li>
     *     <li>2 - Atribui {@link FuncaoMecanico} e encerra o menu</li>
     *     <li>3 - Atribui {@link FuncaoOperadorCanhoes} e encerra o menu</li>
     *     <li>0 - Encerra o menu sem trocar de função</li>
     * </ul>
     * Assim como em {@link OpcoesArmamentos}, qualquer opção válida encerra
     * o menu; apenas uma opção inválida faz o menu ser reapresentado.
     *
     * @param tripulante tripulante que terá sua função trocada via {@link Tripulante#trocarFuncao}
     */
    public void menuOpcoesFuncoes(Tripulante tripulante) {
        var piloto = new FuncaoPiloto();
        var mecanico = new FuncaoMecanico();
        var operadorCanhoes = new FuncaoOperadorCanhoes();

        while (true) {
            System.out.println("Escolha a função");
            System.out.println("1 - Piloto");
            System.out.println("2 - Mecânico");
            System.out.println("3 - Operador de Canhões");
            System.out.println("0 - Voltar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    tripulante.trocarFuncao(piloto);
                    return;
                case 2:
                    tripulante.trocarFuncao(mecanico);
                    return;
                case 3:
                    tripulante.trocarFuncao(operadorCanhoes);
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}