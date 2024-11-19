package br.com.alura.comportamental.command.pedido;

import br.com.alura.comportamental.command.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandle {

    //construtor com injeção de depedencias. repository

    public void execute(GeraPedido dados){

        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar Email com dados do novo pedido");

    }

}
