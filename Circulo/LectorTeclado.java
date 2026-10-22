
package Circulo;

import java.util.Scanner;

class LectorTeclado {
    private static final Scanner scanner = new Scanner(System.in);

    public static double leerDoublePositivo(String mensaje) {
        double valor;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextDouble()) {
                System.out.println(" Error: Entrada no valida. Debe ingresar un numero.");
                scanner.next();
                System.out.print(mensaje);
            }
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println(" Error: El valor debe ser mayor a 0.");
            }
        } while (valor <= 0);
        return valor;
    }

    public static String leerTexto(String mensaje) {
        String texto;
        do {
            System.out.print(mensaje);
            texto = scanner.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println(" Error: El texto no puede estar vacio.");
            }
        } while (texto.isEmpty());
        return texto;
    }
}
