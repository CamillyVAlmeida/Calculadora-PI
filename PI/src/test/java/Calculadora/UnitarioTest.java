package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class UnitarioTest {
    
    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(10.0, calc.somar(6, 4 ), 0.0001);
    }
    
}
