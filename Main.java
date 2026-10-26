public class Main {
    public static void main(String[] args) {
        Guerrero leo = new Guerrero("Leonidas de acero", 30, 30, 25, "Acero", 28);
        Mago as = new Mago("Astrea", 30, 30, 25, 30, "bola de fuego");

        Aldeano aldeanoM = new Aldeano("Friguil", "Carpintero", true);
        Aldeano aldeanoS = new Aldeano("Aldeano", "Herrero", false);

        Villano vik = new Villano("Viktor", 60, 60, 60, false, 30);
        Villano mal = new Villano("MALAKOR", true);

        System.out.println("=== INICIO DE LA AVENTURA ===");

        System.out.println("\n=== LOS HEROES LLEGAN AL PUEBLO ===");

        System.out.println("\nLeonidas: Buenos días. ¿Qué está pasando en este pueblo?");
        System.out.println(aldeanoM.nombre + ": ¡Necesitamos su ayuda!");
        aldeanoM.darMision();

        System.out.println("\nAstrea: ¿Hay alguien que pueda ayudarnos a prepararnos?");
        System.out.println(aldeanoS.nombre + ": Soy " + aldeanoS.oficio );
        aldeanoS.comerciar();

        System.out.println("\nLeonidas: Nos encargaremos de derrotar al villano.");
        System.out.println("Astrea: ¡Vamos a terminar con esta amenaza!");

        System.out.println("\n=== COMIENZA LA BATALLA ===");
        System.out.println("Equipo de heroes: Leonidas y Astrea");
        System.out.println("Enemigos: Viktor y MALAKOR");

        System.out.println("\n=== RONDA 1 ===");
        leo.atacar(vik);
        as.lanzarHechizo(mal, 1);

        System.out.println("\n=== TURNO DE LOS ENEMIGOS ===");
        if (vik.getVida() > 0) {
            vik.atacar(leo);
        }

        if (mal.getVida() > 0) {
            mal.atacar(as);
        }

        System.out.println("\n=== RONDA 2 ===");
        if (vik.getVida() > 0) {
            as.lanzarHechizo(vik, 2);
        } else {
            System.out.println("Viktor ya fue derrotado.");
        }

        if (mal.getVida() > 0) {
            leo.atacar(mal);
        } else {
            System.out.println("MALAKOR ya fue derrotado.");
        }

        System.out.println("\n=== TURNO DE LOS ENEMIGOS ===");
        if (vik.getVida() > 0) {
            vik.atacar(as);
        }

        if (mal.getVida() > 0) {
            mal.atacar(leo);
        }

        System.out.println("\n=== RONDA 3 ===");
        if (vik.getVida() > 0) {
            leo.atacar(vik);
        }

        if (mal.getVida() > 0) {
            as.lanzarHechizo(mal, 1);
        }

        System.out.println("\n=== ESTADO FINAL ===");
        mostrarEstado(leo, as, vik, mal, aldeanoM, aldeanoS);

        if (vik.getVida() == 0 && mal.getVida() == 0) {
            System.out.println("¡Leonidas y Astrea han ganado la partida!");
        } else if (leo.getVida() == 0 && as.getVida() == 0) {
            System.out.println("Viktor y MALAKOR han ganado la partida.");
        } else {
            System.out.println("La partida terminó con supervivientes de ambos equipos.");
        }
    }

    public static void mostrarEstado(Personaje... personajes) {
        for (Personaje personaje : personajes) {
            personaje.info();
            System.out.println();
        }
    }
}