package com.testetecnico.ticket_3;

/**
 * Decorator base do padrão Decorator para {@link Arma}, usado para
 * adicionar modificações (efeitos extras) a uma arma já existente
 * sem alterar sua implementação original.
 * <p>
 * Subclasses devem implementar {@link Arma#atirar()} delegando para
 * {@link #armamentoDecorado} e adicionando seu efeito específico.
 */
public abstract class ArmamentoDecorator implements Arma{

    /** Arma (ou outro decorator) que está sendo decorado por esta modificação. */
    protected Arma armamentoDecorado;

    /**
     * Cria o decorator envolvendo a arma informada.
     *
     * @param armamentoDecorado arma (ou decorator) a ser decorado
     */
    public ArmamentoDecorator(Arma armamentoDecorado) {
        this.armamentoDecorado = armamentoDecorado;
    }
}