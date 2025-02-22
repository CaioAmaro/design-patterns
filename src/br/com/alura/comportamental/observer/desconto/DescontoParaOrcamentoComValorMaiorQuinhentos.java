package br.com.alura.comportamental.command.desconto;

import br.com.alura.comportamental.command.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
