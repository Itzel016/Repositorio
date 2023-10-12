import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora de Área y Perímetro de un Pentágono");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa la longitud de un lado del pentágono: ");
            double lado = scanner.nextDouble();

            FigurasGeometricas pentagono = new Pentagono(lado);

            System.out.println("El perímetro del pentágono es: " + pentagono.calcularPerimetro());
            System.out.println("El área del pentágono es: " + pentagono.calcularArea());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
