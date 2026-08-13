package com.testetecnico.ticket_3.modificacoes;

import com.testetecnico.ticket_3.Arma;
import com.testetecnico.ticket_3.ArmamentoDecorator;

public class PerfuracaoBlindagem extends ArmamentoDecorator {
    public PerfuracaoBlindagem(Arma armamentoDecorado) {
        super(armamentoDecorado);
    }

    @Override
    public void atirar() {
        armamentoDecorado.atirar();
        System.out.println(" + Efeito de perfuração de blindagem!");
    }
}
