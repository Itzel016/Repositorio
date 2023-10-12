public class Main {
    public static void main(String[] args) {
        try {
            Trapecio trapecio = new Trapecio("Pentágono Regular", 0.0);
            System.out.println("Nombre de la figura: " + trapecio.nombre);
            System.out.println("Perímetro del pentágono: " + trapecio.calcularPerimetro());
            System.out.println("Área del pentágono: " + trapecio.calcularArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error de cálculo del área: " + e.getMessage());
        }
    }
}