package br.com.alura.comportamental.state;

import br.com.alura.comportamental.state.desconto.CalculadoraDeDescontos;
import br.com.alura.comportamental.state.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteTemplateMethod {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento( new BigDecimal("200"),6);
        Orcamento segundo = new Orcamento( new BigDecimal("1000"),1);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
