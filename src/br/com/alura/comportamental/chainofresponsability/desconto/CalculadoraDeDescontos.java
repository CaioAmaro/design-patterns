package br.com.alura.comportamental.chainofresponsability.desconto;

import br.com.alura.comportamental.chainofresponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconstos {

    public BigDecimal calcular(Orcamento orcamento){

        if(orcamento.getQuantidadeDeItens() > 5){
            return orcamento.getValor().multiply( new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }

}
