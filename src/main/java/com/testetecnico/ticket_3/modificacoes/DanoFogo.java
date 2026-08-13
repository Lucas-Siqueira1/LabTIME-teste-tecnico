package com.testetecnico.ticket_3.modificacoes;

import com.testetecnico.ticket_3.Arma;
import com.testetecnico.ticket_3.ArmamentoDecorator;

public class DanoFogo extends ArmamentoDecorator {
    public DanoFogo(Arma armamentoDecorado) {
        super(armamentoDecorado);
    }

    @Override
    public void atirar() {
        armamentoDecorado.atirar();
        System.out.println(" + Efeito de fogo!");
    }
}
