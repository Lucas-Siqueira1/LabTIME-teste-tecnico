package com.testetecnico.testes_menu;

import com.testetecnico.ticket_3.Nave;
import com.testetecnico.ticket_3.armas.CanhaoDePlasma;
import com.testetecnico.ticket_3.armas.LaserContinuo;
import com.testetecnico.ticket_3.armas.Missil;

import java.util.Scanner;

/**
 * Menu de console responsável por permitir a troca de armamento
 * de uma {@link Nave}.
 * <p>
 * Utiliza o mesmo {@link Scanner} recebido para ler a opção
 * escolhida pelo usuário.
 */
public class OpcoesArmamentos {
    private final Scanner scanner;

    /**
     * Cria o menu de opções de armamento.
     *
     * @param scanner scanner usado para ler as opções digitadas pelo usuário
     */
    public OpcoesArmamentos(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Exibe o menu de escolha de armamento para a nave informada.
     * <p>
     * Opções disponíveis:
     * <ul>
     *     <li>1 - Equipa {@link CanhaoDePlasma} e encerra o menu</li>
     *     <li>2 - Equipa {@link LaserContinuo} e encerra o menu</li>
     *     <li>3 - Equipa {@link Missil} e encerra o menu</li>
     *     <li>0 - Encerra o menu sem trocar de arma</li>
     * </ul>
     * Diferente de escolher uma arma ou voltar, uma opção inválida
     * não encerra o menu: a mensagem de erro é exibida e as opções
     * são reapresentadas.
     *
     * @param nave nave que terá seu armamento trocado via {@link Nave#trocarArma}
     */
    public void menuOpcoesArmamentos(Nave nave) {
        var canhaoDePlasma = new CanhaoDePlasma();
        var laserContinuo = new LaserContinuo();
        var missil = new Missil();

        while(true) {
            System.out.println("\nEscolha seu armamento");
            System.out.println("1 - Canhão de Plasma");
            System.out.println("2 - Laser Continuo");
            System.out.println("3 - Míssil");
            System.out.println("0 - Voltar\n");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    nave.trocarArma(canhaoDePlasma);
                    return;
                case 2:
                    nave.trocarArma(laserContinuo);
                    return;
                case 3:
                    nave.trocarArma(missil);
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}