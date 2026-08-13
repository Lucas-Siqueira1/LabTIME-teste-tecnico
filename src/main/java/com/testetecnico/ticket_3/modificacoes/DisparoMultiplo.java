package com.testetecnico.ticket_3.modificacoes;

import com.testetecnico.ticket_3.Arma;
import com.testetecnico.ticket_3.ArmamentoDecorator;

public class DisparoMultiplo extends ArmamentoDecorator {
    public DisparoMultiplo(Arma armamentoDecorado) {
        super(armamentoDecorado);
    }

    @Override
    public void atirar() {
        armamentoDecorado.atirar();
        System.out.println(" + Efeito de disparo múltiplo!");
    }
}
