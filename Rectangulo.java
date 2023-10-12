public class Rectangulo extends FigurasGeometricas {
private double base;
private double altura;
private double lado1, lado2;

public Rectangulo(String nombre, double lado1, double lado2) {
    super(nombre);
    this.lado1 = lado1;
    this.lado2 = lado2;
}
public Rectangulo(double base, double altura) {
super("Rectángulo");
this.base = base;
this.altura = altura;
}
@Override
public double calcularArea() {
return base * altura;

}
@Override
public double calcularPerimetro() {
    // TODO Auto-generated method stub
    return 2 * (lado1 + lado2);
}

}
