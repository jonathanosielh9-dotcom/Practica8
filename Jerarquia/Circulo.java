
package Jerarquia;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String color, double radio) {
        super("Circulo", color); 
        this.radio = radio;
    }

    public static Circulo crearDesdeTeclado() {
        System.out.println("\nDatos para el Circulo");
        String color = LectorTeclado.leerTexto("Color del circulo: ");
        double radio = LectorTeclado.leerDoublePositivo("Radio del circulo: ");
        return new Circulo(color, radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " | Radio: " + radio + " | Area: " + String.format("%.2f", calcularArea());
    }
}
