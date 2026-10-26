public class Villano extends Personaje {
    public int nivelDeMaldad;
    public boolean jefeFinal;

    public Villano(String nombre, int nivel, int ataque, int defensa, boolean jefeFinal, int nivelDeMaldad) {
        super(nombre, 100, jefeFinal ? 100 : nivel, jefeFinal ? 100 : ataque, jefeFinal ? 100 : defensa);
        this.jefeFinal = jefeFinal;

        if (jefeFinal) {
            this.nivelDeMaldad = 100;
        } else {
            this.nivelDeMaldad = Math.max(0, nivelDeMaldad);
        }
    }

    public Villano(String nombre, boolean jefeFinal) {
        this(nombre, 1, 10, 10, jefeFinal, 50);
    }
}
