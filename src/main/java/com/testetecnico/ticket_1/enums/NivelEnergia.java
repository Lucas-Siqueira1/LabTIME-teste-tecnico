package com.testetecnico.ticket_1.enums;

/**
 * Representa os níveis de energia (ou dano) do {@link com.testetecnico.ticket_1.Nucleo}
 * da nave, do estado intacto ao estado fatal.
 * <p>
 * O valor de cada nível corresponde à contagem de dano acumulada
 * necessária para atingi-lo.
 */
public enum NivelEnergia {
    INTACTA(0),
    LEVE(1),
    MODERADO(2),
    CRITICO(3),
    FATAL(4);

    private int valor;

    NivelEnergia(int valor) {
        this.valor = valor;
    }

    /**
     * Retorna o valor numérico associado a este nível de energia,
     * correspondente à contagem de dano necessária para atingi-lo.
     *
     * @return o valor do nível de energia
     */
    public int getValor() {
        return valor;
    }

}