package es.plaiaundi.ed.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Resta (Persona B)")
class RestaTest {

    private final Calculadora calc = new Calculadora();

    @Test
    @DisplayName("10 - 4 = 6")
    void restaResultadoPositivo() {
        assertEquals(6, calc.restar(10, 4));
    }

    @Test
    @DisplayName("4 - 10 = -6")
    void restaResultadoNegativo() {
        assertEquals(-6, calc.restar(4, 10));
    }

    @Test
    @DisplayName("-2 - -5 = 3")
    void restaDosNegativos() {
        assertEquals(3, calc.restar(-2, -5));
    }

    // TODO Persona B: anade aqui tu propio caso de prueba
}
