
package jerarquiafiguras;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super("Triangulo", color); 
        this.base = base;
        this.altura = altura;
    }

    public static Triangulo crearDesdeTeclado() {
        System.out.println("\nDatos para el Triangulo");
        String color = LectorTeclado.leerTexto("Color del triangulo: ");
        double base = LectorTeclado.leerDoublePositivo("Base del triangulo: ");
        double altura = LectorTeclado.leerDoublePositivo("Altura del triangulo: ");
        return new Triangulo(color, base, altura);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Base: " + base + ", Altura: " + altura + " | Area: " + String.format("%.2f", calcularArea());
    }
}