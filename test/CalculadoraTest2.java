import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest2 {

    private InputStream old;
    private PrintStream originalOut;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        // Conservamos la entrada y salida antiguas.
        old = System.in;
        originalOut = System.out;

        // Redirect System.out to a ByteArrayOutputStream
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calcular() {
    }

    @Test
    void main() {
        String inputString = "+\n2\n7\n";

        try {
            System.setIn(new ByteArrayInputStream(inputString.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        try {
            MainCalculadora.main(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String esperado = "Dime una operación" + System.lineSeparator() +
                "Dime un número" + System.lineSeparator() +
                "Dime un número" + System.lineSeparator() +
                "El resultado es: 9";
        assertEquals(esperado+ System.lineSeparator(), outputStream.toString());
    }
}
