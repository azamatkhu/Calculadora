import java.io.*;

public class Calculadora {
    public static int calcular(int a, int b, String operacion) {
        switch (operacion) {
            case "sumar":
                System.out.println(a + b);
                return a + b;
            case "restar":
                System.out.println(a - b);
                return a - b;
            case "multiplicar":
                System.out.println(a * b);
                return a * b;
            case "dividir":
                if (b == 0) {
                    throw new ArithmeticException("No se puede dividir por zero");
                }
                System.out.println(a / b);
                return a / b;
        }
        return 0;
    }
}