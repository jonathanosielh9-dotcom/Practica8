
package Jerarquia;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(String color, double lado) {
        super("Cuadrado", color);
        this.lado = lado;
    }

    public static Cuadrado crearDesdeTeclado() {
        System.out.println("\nDatos para el Cuadrado");
        String color = LectorTeclado.leerTexto("Color del cuadrado: ");
        double lado = LectorTeclado.leerDoublePositivo("Lado del cuadrado: ");
        return new Cuadrado(color, lado);
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " | Lado: " + lado + " | Area: " + String.format("%.2f", calcularArea());
    }
}
