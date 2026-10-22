package Jerarquia;

public class JerarquiaFiguras {

    public static void main(String[] args) {
        System.out.println("JERARQUIA DE FIGURAS GEOMETRICAS\n");

        Triangulo triangulo = Triangulo.crearDesdeTeclado();
        Cuadrado cuadrado = Cuadrado.crearDesdeTeclado();
        Rectangulo rectangulo = Rectangulo.crearDesdeTeclado();
        Circulo circulo = Circulo.crearDesdeTeclado();
        Pentagono pentagono = Pentagono.crearDesdeTeclado();

        System.out.println("\t\t\t RESULTADOS DE LAS FIGURAS");
        
        FiguraGeometrica[] figuras = {triangulo, cuadrado, rectangulo, circulo, pentagono};

        for (FiguraGeometrica fig : figuras) {
            System.out.println(fig);
        }
    }
    
}
