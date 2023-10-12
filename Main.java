public class Main {
    public static void main(String[] args) {
        try {
            Rectangulo rectangulo = new Rectangulo(4, 7);
            Circulo circulo = new Circulo(2);
            Triangulo triangulo = new Triangulo(null, 7, 4, 5); // Triángulo válido

            System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
            System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
            System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());

            // Intentar crear un triángulo inválido
            // Esto lanzará una excepción
            //Triangulo invalido = new Triangulo(1, 1, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error de división entre cero: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}
