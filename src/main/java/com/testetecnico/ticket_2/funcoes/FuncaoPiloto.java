package com.testetecnico.ticket_2.funcoes;

import com.testetecnico.ticket_2.Funcao;
import com.testetecnico.ticket_2.Tripulante;

public class FuncaoPiloto implements Funcao {
    @Override
    public void trabalhar(Tripulante tripulante) {
        System.out.println("\n" + tripulante.getName() + " assumiu o controle! Ajustando painel de navegação e ajustando rota.");
    }
}
