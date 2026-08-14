package com.testetecnico.testes_menu;

import com.testetecnico.ticket_3.Nave;
import com.testetecnico.ticket_3.armas.CanhaoDePlasma;
import com.testetecnico.ticket_3.armas.LaserContinuo;
import com.testetecnico.ticket_3.armas.Missil;

import java.util.Scanner;

public class OpcoesArmamentos {
    private final Scanner scanner;

    public OpcoesArmamentos(Scanner scanner) {
        this.scanner = scanner;
    }

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
