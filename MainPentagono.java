class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0; 
    }

    public double calcularPerimetro() {
        return 0;
    }
}

class Pentagono extends FiguraGeometrica {
    private double lado;

    public Pentagono(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double apotema = lado / (2 * Math.tan(Math.PI / 5));
        double perimetro = calcularPerimetro(); 
        double area = (perimetro * apotema) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
}

public class MainPentagono {
    public static void main(String[] args) {
        Pentagono pentagono = new Pentagono("Pentágono", 5.0);

        System.out.println("Nombre de la figura: " + pentagono.nombre);
        System.out.println("Perímetro del pentágono: " + pentagono.calcularPerimetro());
        System.out.println("Área del pentágono: " + pentagono.calcularArea());
    }
}
