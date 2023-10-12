public class Main {
    public static void main(String[] args) {
        try {
            Pentagono pentagono = new Pentagono("Pentágono Regular", 0.0);
            System.out.println("Nombre de la figura: " + pentagono.nombre);
            System.out.println("Perímetro del pentágono: " + pentagono.calcularPerimetro());
            System.out.println("Área del pentágono: " + pentagono.calcularArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error de cálculo del área: " + e.getMessage());
        }
    }
}
