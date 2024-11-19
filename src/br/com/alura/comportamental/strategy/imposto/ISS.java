package br.com.alura.comportamental.strategy.imposto;

import br.com.alura.comportamental.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS {

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
