public class Pentagono implements FigurasGeometricas {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double apotema = lado / (2 * Math.tan(Math.PI / 5));
        double perimetro = calcularPerimetro();
        return (perimetro * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
}