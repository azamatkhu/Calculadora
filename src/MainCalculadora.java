public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        try {
            calculadora.calcular(2, 2, "sumar");
            calculadora.calcular(2, 2, "restar");
            calculadora.calcular(2, 2, "noexiste");
            calculadora.calcular(2, 0, "dividir");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
