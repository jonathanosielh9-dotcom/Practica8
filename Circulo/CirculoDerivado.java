package Circulo;

public class CirculoDerivado {

    public static void main(String[] args) {
        System.out.println("\t\t\t CONSTRUCTORES Y HERENCIA \n");

        System.out.println("Creando Figura por defecto");
        Figura f1 = new Figura();

        System.out.println("\nCreando Circulo por defecto");
        Circulo c1 = new Circulo();

        System.out.println("\nCreando Circulo con radio personalizado");
        Circulo c2 = new Circulo(5.0);
        
        Circulo cUsuario = Circulo.crearDesdeTeclado();

        System.out.println("\n\tRESULTADOS FINALES");
        System.out.println(f1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(cUsuario);
    }
    
}
