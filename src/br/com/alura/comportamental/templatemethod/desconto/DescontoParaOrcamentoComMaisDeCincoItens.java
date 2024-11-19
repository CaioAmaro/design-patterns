package br.com.alura.comportamental.chainofresponsability.desconto;

import br.com.alura.comportamental.chainofresponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{

    public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){

        if(orcamento.getQuantidadeDeItens() > 5){
            return orcamento.getValor().multiply( new BigDecimal("0.1"));
        }

        return this.proximo.calcular(orcamento);
    }

}
