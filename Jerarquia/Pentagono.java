
package jerarquiafiguras;

public class Pentagono extends FiguraGeometrica {
    private double perimetro;
    private double apotema;

    public Pentagono(String color, double perimetro, double apotema) {
        super("Pentagono", color);
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    public static Pentagono crearDesdeTeclado() {
        System.out.println("\nDatos para el Pentagono");
        String color = LectorTeclado.leerTexto("Color del pentagono: ");
        double perimetro = LectorTeclado.leerDoublePositivo("Perimetro del pentagono: ");
        double apotema = LectorTeclado.leerDoublePositivo("Apotema del pentagono: ");
        return new Pentagono(color, perimetro, apotema);
    }

    @Override
    public double calcularArea() {
        return (perimetro * apotema) / 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Perimetro: " + perimetro + ", Apotema: " + apotema + " | Area: " + String.format("%.2f", calcularArea());
    }
}
