package com.testetecnico.testes_menu;

import com.testetecnico.ticket_1.observers.Escudo;
import com.testetecnico.ticket_1.observers.Luzes;
import com.testetecnico.ticket_1.Nucleo;
import com.testetecnico.ticket_1.observers.Painel;
import com.testetecnico.ticket_1.enums.NivelEnergia;

import java.util.Scanner;

/**
 * Menu de console responsável pelo sistema de contingência do
 * núcleo de energia da nave: aplicar dano, reparar e verificar
 * o nível de energia atual.
 * <p>
 * Utiliza o mesmo {@link Scanner} recebido para ler a opção
 * escolhida pelo usuário.
 */
public class SistemaEnergia {

    private final Scanner scanner;

    /**
     * Cria o menu do sistema de energia.
     *
     * @param scanner scanner usado para ler as opções digitadas pelo usuário
     */
    public SistemaEnergia(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Exibe o menu de contingência do núcleo informado.
     * <p>
     * Opções disponíveis:
     * <ul>
     *     <li>1 - Aplica dano via {@link Nucleo#tomarDano()}. Se o dano
     *     resultante atingir {@link NivelEnergia#FATAL}, a aplicação é
     *     encerrada imediatamente com {@link System#exit(int)}, sem
     *     retornar ao chamador</li>
     *     <li>2 - Repara o núcleo via {@link Nucleo#repararNucleo()}</li>
     *     <li>3 - Exibe o nível de energia atual via {@link Nucleo#nivelEnergia()}</li>
     *     <li>0 - Encerra o menu e retorna ao chamador</li>
     * </ul>
     *
     * @param nucleo núcleo de energia da nave a ser gerenciado
     */
    public void menuNave(Nucleo nucleo) {

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