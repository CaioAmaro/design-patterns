package br.com.alura.comportamental.state.situacao;

import br.com.alura.comportamental.state.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise {

    public BigDecimal aplicarDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(){
        
    }

}
