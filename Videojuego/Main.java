public class Main {
public static void main(String[] args) {

    Guerrero leo = new Guerrero("Leonidas de acero", 30, 30, 25, "Acero", 28);
    Mago as = new Mago("Astrea", 30, 30, 25, 30, "bola de fuego");

    Aldeano aldeanoM = new Aldeano("Friguil", "Carpintero", true);
    Aldeano aldeanoS = new Aldeano("Aldeano", "Herrero", false);

    Villano vik = new Villano("Viktor", 60, 60, 60, false, 30);
    Villano mal = new Villano("MALAKOR", true);

    // Inicio de la aventura
    System.out.println("========================================");
    System.out.println("       INICIO DE LA AVENTURA");
    System.out.println("========================================");

    System.out.println("\n=== LOS HEROES LLEGAN AL PUEBLO ===");

    System.out.println("\n" + leo.nombre + ": Buenos días. ¿Qué está pasando en este pueblo?");
    System.out.println(as.nombre + ": El ambiente se siente extraño. Debemos investigar.");

    // Interacción con los aldeanos
    System.out.println("\n=== HABLANDO CON LOS ALDEANOS ===");

    System.out.println("\n" + aldeanoM.nombre + ", el " + aldeanoM.oficio + ":");
    aldeanoM.darMision();

    System.out.println("\n" + leo.nombre + ": Aceptamos la misión. ¿Dónde podemos encontrar al villano?");
    System.out.println(aldeanoM.nombre + ": Viktor controla el camino hacia el castillo.");
    System.out.println(aldeanoM.nombre + ": Pero cuidado, su amo es mucho más peligroso.");

    System.out.println("\n" + as.nombre + ": Primero derrotaremos a Viktor y después iremos por su jefe.");
    System.out.println(leo.nombre + ": Trabajaremos juntos. No dejaremos que amenacen este pueblo.");

    System.out.println("\n=== VISITA AL HERRERO ===");

    System.out.println(aldeanoS.nombre + ", el " + aldeanoS.oficio + ":");
    aldeanoS.darMision();
    aldeanoS.comerciar();

    System.out.println(leo.nombre + ": Necesitamos equipo para nuestra aventura.");
    System.out.println(aldeanoS.nombre + ": Cuida tu armadura, guerrero. Te ayudará en combate.");

    // Información de los personajes
    System.out.println("\n========================================");
    System.out.println("         ESTADO DE LOS HEROES");
    System.out.println("========================================");

    leo.info();
    System.out.println("Tipo de armadura: " + leo.tipoDeArmadura);
    System.out.println("Valor de armadura: " + leo.armadura);

    System.out.println();

    as.info();
    System.out.println("Maná: " + as.mana);
    System.out.println("Hechizo favorito: " + as.hechizoFav);

    // Primer combate: Viktor
    System.out.println("\n========================================");
    System.out.println("       PRIMER COMBATE: VIKTOR");
    System.out.println("========================================");

    vik.info();
    System.out.println("Nivel de maldad: " + vik.nivelDeMaldad);
    System.out.println("¿Es el jefe final?: " + vik.jefeFinal);

    System.out.println("\nViktor: ¡Nadie atravesará este camino!");
    System.out.println(leo.nombre + ": ¡Astrea, prepárate!");
    System.out.println(as.nombre + ": ¡Vamos a terminar con esto!");

    System.out.println("\n--- Turno de Leonidas ---");
    leo.atacar(vik);

    System.out.println("\n--- Turno de Astrea ---");
    as.lanzarHechizo(vik);

    System.out.println("\n--- Viktor contraataca ---");
    vik.atacar(leo);

    System.out.println("\n--- Astrea vuelve a atacar ---");
    as.lanzarHechizo(vik);

    System.out.println("\n--- Leonidas ataca nuevamente ---");
    leo.atacar(vik);

    System.out.println("\n--- Estado después del combate ---");
    System.out.println("Vida de Leonidas: " + leo.getVida());
    System.out.println("Vida de Astrea: " + as.getVida());
    System.out.println("Vida de Viktor: " + vik.getVida());

    // Recuperación del mago
    System.out.println("\n=== RECUPERACIÓN ===");

    as.meditar();

    System.out.println(as.nombre + ": Necesito recuperar maná antes de entrar al castillo.");

    // Segundo combate: Malakor
    if (vik.getVida() <= 0) {
        System.out.println("\n========================================");
        System.out.println("       SEGUNDO COMBATE: MALAKOR");
        System.out.println("========================================");

        System.out.println(leo.nombre + ": ¡Viktor ha caído! Ahora vamos por su amo.");
        System.out.println(as.nombre + ": Puedo sentir su poder desde aquí.");

        mal.info();
        System.out.println("Nivel de maldad: " + mal.nivelDeMaldad);
        System.out.println("¿Es el jefe final?: " + mal.jefeFinal);

        System.out.println("\nMALAKOR: ¡Insensatos! ¡Jamás podrán derrotarme!");

        System.out.println("\n--- Leonidas ataca a Malakor ---");
        leo.atacar(mal);

        System.out.println("\n--- Astrea lanza un hechizo ---");
        as.lanzarHechizo(mal);

        System.out.println("\n--- Malakor contraataca a Leonidas ---");
        mal.atacar(leo);

        System.out.println("\n--- Leonidas vuelve a atacar ---");
        leo.atacar(mal);

        System.out.println("\n--- Astrea lanza otro hechizo ---");
        as.lanzarHechizo(mal);

        System.out.println("\n--- Estado del combate final ---");
        System.out.println("Vida de Leonidas: " + leo.getVida());
        System.out.println("Vida de Astrea: " + as.getVida());
        System.out.println("Vida de Malakor: " + mal.getVida());

        if (mal.getVida() <= 0) {
            System.out.println("\nMALAKOR: ¡No puede ser...!");
            System.out.println("\n¡VICTORIA! Los héroes han salvado al pueblo.");
            System.out.println(leo.nombre + ": Lo conseguimos.");
            System.out.println(as.nombre + ": Juntos somos más fuertes.");
        } else {
            System.out.println("\nMALAKOR sigue en pie. La batalla todavía no termina.");
        }

    } else {
        System.out.println("\nViktor sigue vivo. Los héroes no pueden avanzar al castillo.");
    }

    // Demostración de defensa y métodos heredados
    System.out.println("\n========================================");
    System.out.println("       FIN DE LA SIMULACIÓN");
    System.out.println("========================================");

    System.out.println("\nEstado final de los personajes:");

    leo.info();
    as.info();
    vik.info();
    mal.info();
    aldeanoM.info();
    aldeanoS.info();

    System.out.println("\nManá final de Astrea: " + as.mana);
    System.out.println("Armadura de Leonidas: " + leo.armadura);

    System.out.println("\n=== FIN DE LA AVENTURA ===");
}


}