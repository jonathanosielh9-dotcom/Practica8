
package Jerarquia;

public class FiguraGeometrica {
    protected String nombre;
    protected String color;

    public FiguraGeometrica() {
        this("Figura", "Generico"); 
    }

    public FiguraGeometrica(String nombre) {
        this(nombre, "Generico"); 
    }

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public double calcularArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Figura: " + nombre + " | Color: " + color;
    }
}
