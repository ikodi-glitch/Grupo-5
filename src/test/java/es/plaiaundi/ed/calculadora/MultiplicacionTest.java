package es.plaiaundi.ed.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Multiplicacion (Persona C)")
class MultiplicacionTest {

    private final Calculadora calc = new Calculadora();

    @Test
    @DisplayName("3 x 4 = 12")
    void multiplicaDosPositivos() {
        assertEquals(12, calc.multiplicar(3, 4));
    }

    @Test
    @DisplayName("-3 x 4 = -12")
    void multiplicaPositivoPorNegativo() {
        assertEquals(-12, calc.multiplicar(-3, 4));
    }

    @Test
    @DisplayName("7 x 0 = 0")
    void multiplicaPorCero() {
        assertEquals(0, calc.multiplicar(7, 0));
    }

    // TODO Persona C: anade aqui tu propio caso de prueba
}
