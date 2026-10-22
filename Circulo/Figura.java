
package circuloderivado;

class Figura {
    protected String nombre;
    protected String color;

    public Figura() {
        this("Figura Generica", "Negro");
    }

    public Figura(String nombre) {
        this(nombre, "Negro"); 
    }

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        System.out.println("[Figura] Inicializando: " + this.nombre + " (" + this.color + ")");
    }

    @Override
    public String toString() {
        return "Figura: " + nombre + " | Color: " + color;
    }
}
