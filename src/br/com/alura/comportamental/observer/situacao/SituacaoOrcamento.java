package br.com.alura.comportamental.command.situacao;

import br.com.alura.comportamental.command.DomainException;
import br.com.alura.comportamental.command.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser Aprovado!");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser Reprovado!");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser Finalizado!");
    }

}
