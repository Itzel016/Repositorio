class Pentagono extends FigurasGeometricas {
    private double lado;

    public Pentagono(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double apotema;
        try {
            apotema = lado / (2 * Math.tan(Math.PI / 5));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error en el cálculo del área: " + e.getMessage());
        }

        double perimetro = calcularPerimetro();
        double area = (perimetro * apotema) / 2;
        return area;
    }
    
    public double calcularPerimetro() {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado del pentágono debe ser mayor que cero.");
        }
        return 5 * lado;
    }
}
