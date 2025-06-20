package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(10.0, calc.somar(6, 4), 0.0001);
    }

    @Test
    void testSubtrair() {
        assertEquals(2.0, calc.subtrair(6, 4), 0.0001);
    }

    @Test
    void testMultiplicar() {
        assertEquals(24.0, calc.multiplicar(6, 4), 0.0001);
    }

    @Test
    void testDividir() {
        assertEquals(2.0, calc.dividir(8, 4), 0.0001);
    }

    @Test
    void testDivisaoPorZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(5, 0);
        });
        assertEquals("Não é possível dividir por zero.", exception.getMessage());
    }
} 