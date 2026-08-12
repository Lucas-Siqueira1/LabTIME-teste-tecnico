package com.testetecnico.ticket_2.funcoes;

import com.testetecnico.ticket_2.Funcao;
import com.testetecnico.ticket_2.Tripulante;

public class FuncaoOperadorCanhoes implements Funcao {
    @Override
    public void trabalhar(Tripulante tripulante) {
        System.out.println("\n" + tripulante.getName() + " é o novo operador de canhões! Conferindo armamento e ajustando mira.");
    }
}
