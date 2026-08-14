package com.testetecnico.testes_menu;

import com.testetecnico.ticket_1.observers.Escudo;
import com.testetecnico.ticket_1.observers.Luzes;
import com.testetecnico.ticket_1.Nucleo;
import com.testetecnico.ticket_1.observers.Painel;
import com.testetecnico.ticket_1.enums.NivelEnergia;

import java.util.Scanner;

public class SistemaEnergia {

    private final Scanner scanner;

    public SistemaEnergia(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menuNave(Nucleo nucleo, Escudo escudo, Luzes luzes, Painel painel) {

        while(true) {
            System.out.println("\nSistema de Contingência do Núcleo da Nave");
            System.out.println("---------------------------------------------------");
            System.out.println("1 - Tomar dano");
            System.out.println("2 - Reparar nucleo");
            System.out.println("3 - Verificar nivel de energia");
            System.out.println("0 - Voltar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int contador = nucleo.tomarDano();
                    if (contador == NivelEnergia.FATAL.getValor()) {
                        System.out.println("\nA nave sofreu um dano fatal!");
                        System.out.println("GAME OVER! A nave foi destruída.");
                        System.exit(0);
                    }
                    break;
                case 2:
                    nucleo.repararNucleo();
                    break;
                case 3:
                    nucleo.nivelEnergia();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
