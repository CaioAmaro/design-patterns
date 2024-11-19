package br.com.alura.comportamental.observer.pedido.acao;

import br.com.alura.comportamental.command.pedido.Pedido;

public class EnviarEmailPedido {

    public  void executar(Pedido pedido){
        System.out.println("Enviando Email com dados do pedido");
    }
}
