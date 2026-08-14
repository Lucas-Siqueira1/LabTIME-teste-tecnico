package com.testetecnico.ticket_3;

/**
 * Representa a nave e seu armamento atual, permitindo trocar de
 * arma, adicionar modificações (padrão Decorator) e disparar.
 */
public class Nave {

    private Arma armaAtual = null;

    /**
     * Equipa a nave com a arma informada, substituindo a arma
     * (e quaisquer modificações) atualmente equipada.
     *
     * @param novaArma nova arma a ser equipada
     */
    public void trocarArma(Arma novaArma) {
        this.armaAtual = novaArma;
        System.out.println("\nArma equipada com sucesso!\n");
    }

    /**
     * Retorna a arma atualmente equipada, já incluindo eventuais
     * modificações aplicadas via {@link #adicionarModificacao}.
     *
     * @return a arma atual, ou {@code null} se nenhuma arma foi equipada
     */
    public Arma getArmaAtual() {
        return armaAtual;
    }

    /**
     * Dispara a arma atualmente equipada.
     * <p>
     * Se nenhuma arma estiver equipada, exibe uma mensagem informativa
     * em vez de disparar.
     */
    public void atirar() {
        if (armaAtual == null) {
            System.out.println("\nVocê ainda não equipou nenhum armamento.\n");
        }else {
            armaAtual.atirar();
        }
    }

    /**
     * Aplica uma modificação (decorator) sobre a arma atual, substituindo
     * a arma atual pela versão decorada.
     * <p>
     * Como a arma atual é substituída pelo próprio decorator, chamadas
     * sucessivas a este método acumulam modificações — cada nova
     * modificação envolve a anterior, em vez de substituí-la.
     *
     * @param armamentoDecorado a arma atual já envolvida pela nova modificação
     *                          (tipicamente um {@link ArmamentoDecorator}
     *                          construído a partir de {@link #getArmaAtual()})
     */
    public void adicionarModificacao(Arma armamentoDecorado) {
        this.armaAtual = armamentoDecorado;
    }
}