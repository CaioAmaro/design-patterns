package br.com.alura.comportamental.strategy;

import br.com.alura.comportamental.strategy.imposto.CalculadoraDeImpostos;
import br.com.alura.comportamental.strategy.imposto.ICMS;
import br.com.alura.comportamental.strategy.imposto.ISS;
import br.com.alura.comportamental.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
