abstract class FigurasGeometricas {
 public double calcularPerimetro() {
    return 0.0;
 }
    private String nombre;
public FigurasGeometricas(String nombre) {
this.setNombre(nombre);
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public abstract double calcularArea();
}