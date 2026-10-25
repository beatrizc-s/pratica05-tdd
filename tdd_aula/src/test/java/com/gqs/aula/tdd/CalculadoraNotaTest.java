package com.gqs.aula.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraNotaTest {

    @Test
    public void testSomaDasNotas() {
        CalculadoraNota calc = new CalculadoraNota();
        double resultado = calc.calcularNotaFinal(30.0, 40.0);
        assertEquals(70.0, resultado, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotaNegativaLancaExcecao() {
        CalculadoraNota calc = new CalculadoraNota();
        calc.calcularNotaFinal(-10.0, 40.0);
    }
}
