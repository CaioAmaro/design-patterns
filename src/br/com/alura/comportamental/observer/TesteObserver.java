package br.com.alura.comportamental.command;

import br.com.alura.comportamental.command.orcamento.Orcamento;
import br.com.alura.comportamental.command.pedido.GeraPedido;
import br.com.alura.comportamental.command.pedido.GeraPedidoHandle;

import java.math.BigDecimal;

public class TesteCommand {
    public static void main(String[] args) {
        String cliente = args[0];
        Orcamento orcamento = new Orcamento(new BigDecimal(args[1]), Integer.parseInt(args[2]));

        GeraPedido gerador = new GeraPedido(cliente,orcamento.getValor(), orcamento.getQuantidadeDeItens());
        GeraPedidoHandle handle = new GeraPedidoHandle(/*Injeção de depedências.*/);

        handle.execute(gerador);

    }
}
