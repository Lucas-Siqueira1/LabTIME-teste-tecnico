package com.testetecnico.ticket_3;

public abstract class ArmamentoDecorator implements Arma{
    protected Arma armamentoDecorado;

    public ArmamentoDecorator(Arma armamentoDecorado) {
        this.armamentoDecorado = armamentoDecorado;
    }
}
