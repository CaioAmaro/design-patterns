package br.com.alura.comportamental.chainofresponsability;

import br.com.alura.comportamental.chainofresponsability.desconto.CalculadoraDeDescontos;
import br.com.alura.comportamental.chainofresponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteResponsability {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento( new BigDecimal("200"),6);
        Orcamento segundo = new Orcamento( new BigDecimal("1000"),1);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
