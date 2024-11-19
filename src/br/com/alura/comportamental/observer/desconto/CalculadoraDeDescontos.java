package br.com.alura.comportamental.command.desconto;

import br.com.alura.comportamental.command.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto cadeiaDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                                  new DescontoParaOrcamentoComValorMaiorQuinhentos(
                                  new SemDesconto()));

        return cadeiaDesconto.calcular(orcamento);

    }

}
