package com.testetecnico.ticket_2.funcoes;

import com.testetecnico.ticket_2.Funcao;
import com.testetecnico.ticket_2.Tripulante;

public class FuncaoMecanico implements Funcao {
    @Override
    public void trabalhar(Tripulante tripulante) {
        System.out.println("\n" + tripulante.getName() + " é o novo mecânico da nave! Organizando caixa de ferramentas e conferindo situação da nave.");
    }
}
