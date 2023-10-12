public class Circulo extends FigurasGeometricas {
private double radio;
public Circulo(double radio) {
super("Círculo");
this.radio = radio;
}

@Override
public double calcularArea() {
return Math.PI * Math.pow(radio, 2);
}

@Override
public double calcularPerimetro() {
    return 2 * Math.PI *radio ;
}

}

