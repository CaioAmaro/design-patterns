package br.com.alura.comportamental.strategy.imposto;

import br.com.alura.comportamental.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {
    BigDecimal calcular(Orcamento orcamento);
}
