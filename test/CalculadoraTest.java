import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void calcular() {
        assertAll(
            () -> assertEquals(7, Calculadora.calcular(3,5,"sumar")),
            () -> assertEquals(7, Calculadora.calcular(3,5,"restar")),
            () -> assertEquals(7, Calculadora.calcular(3,5,"sumar")),
            () -> assertEquals(7, Calculadora.calcular(3,5,"multiplicar"))
        );
    }
}