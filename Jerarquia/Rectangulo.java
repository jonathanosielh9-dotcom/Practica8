
package jerarquiafiguras;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super("Rectangulo", color);
        this.base = base;
        this.altura = altura;
    }

    public static Rectangulo crearDesdeTeclado() {
        System.out.println("\nDatos para el Rectangulo");
        String color = LectorTeclado.leerTexto("Color del rectangulo: ");
        double base = LectorTeclado.leerDoublePositivo("Base del rectangulo: ");
        double altura = LectorTeclado.leerDoublePositivo("Altura del rectangulo: ");
        return new Rectangulo(color, base, altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return super.toString() + " | Base: " + base + ", Altura: " + altura + " | Area: " + String.format("%.2f", calcularArea());
    }
}
