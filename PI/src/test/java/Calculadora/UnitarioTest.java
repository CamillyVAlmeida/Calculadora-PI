package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class UnitarioTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(4.0, calc.somar(2, 2 ), 0.0001);
    }
    
}
