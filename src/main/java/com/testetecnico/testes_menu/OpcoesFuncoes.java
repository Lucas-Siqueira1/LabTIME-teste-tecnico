package com.testetecnico.testes_menu;

import com.testetecnico.ticket_2.Tripulante;
import com.testetecnico.ticket_2.funcoes.FuncaoMecanico;
import com.testetecnico.ticket_2.funcoes.FuncaoOperadorCanhoes;
import com.testetecnico.ticket_2.funcoes.FuncaoPiloto;

import java.util.Scanner;

public class OpcoesFuncoes {
    private final Scanner scanner;

    public OpcoesFuncoes(Scanner scanner) {
        this.scanner = scanner;
    }

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
