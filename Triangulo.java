class Triangulo extends FigurasGeometricas {
    private double lado1;
    private double lado2;
    private double lado3;

    /**
     * @param lado1
     * @param lado2
     * @param lado3
     */
    public Triangulo(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        if (esTrianguloValido(lado1, lado2, lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            throw new IllegalArgumentException("No es posible crear un triángulo con estos lados");
        }
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área del triángulo aquí
        // Por ejemplo, puedes usar la fórmula de Herón
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    private boolean esTrianguloValido(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
