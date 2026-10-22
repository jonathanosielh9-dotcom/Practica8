
package Circulo;

class Circulo extends Figura {
    private double radio;

    public Circulo() {
        this("Circulo Basico", "Rojo", 1.0);
    }

    public Circulo(double radio) {
        this("Circulo Personalizado", "Azul", radio);
    }

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
        System.out.println("[Circulo] Configurando radio: " + this.radio);
    }

    public static Circulo crearDesdeTeclado() {
        System.out.println("\nCreando Circulo del usuario");
        String nombre = LectorTeclado.leerTexto("Ingrese el nombre del circulo: ");
        String color = LectorTeclado.leerTexto("Ingrese el color del circulo: ");
        double radio = LectorTeclado.leerDoublePositivo("Ingrese el radio del circulo (mayor a 0): ");
        return new Circulo(nombre, color, radio);
    }
    
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " | Radio: " + radio + " | Area: " + String.format("%.2f", calcularArea());
    }
}
