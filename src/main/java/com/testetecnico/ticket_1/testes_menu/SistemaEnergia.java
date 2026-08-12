package com.testetecnico.ticket_1.testes_menu;

import com.testetecnico.ticket_1.Escudo;
import com.testetecnico.ticket_1.Luzes;
import com.testetecnico.ticket_1.Nucleo;
import com.testetecnico.ticket_1.Painel;

import java.util.Scanner;

public class SistemaEnergia {
    public void menuNave(Nucleo nucleo, Escudo escudo, Luzes luzes, Painel painel) {
        Scanner scanner = new Scanner(System.in);

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
                    if (nucleo.tomarDano() > 3) return;
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
