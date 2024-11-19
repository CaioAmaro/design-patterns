package br.com.alura.comportamental.chainofresponsability.desconto;

import br.com.alura.comportamental.chainofresponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                            new DescontoParaOrcamentoComValorMaiorQuinhentos(
                            new SemDesconto()));

        return desconto.calcular(orcamento);

    }

}
