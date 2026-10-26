public class Mago extends Personaje {
    public int mana;
    public String hechizoFav;

    public Mago(String nombre, int nivel, int ataque, int defensa, int mana, String hechizoFav) {
        super(nombre, 100, nivel, ataque, defensa);
        this.mana = Math.max(0, mana);
        this.hechizoFav = hechizoFav;
    }

    public void lanzarHechizo(int hechizo) {
        lanzarHechizo(this, hechizo);
    }

    public void lanzarHechizo(Personaje objetivo, int hechizo) {
        if (vida <= 10) {
            System.out.println(nombre + " no tiene suficiente vida para lanzar un hechizo.");
            return;
        }

        if (objetivo == null) {
            System.out.println("No hay un objetivo válido.");
            return;
        }

        if (objetivo.getVida() <= 0) {
            System.out.println(objetivo.nombre + " ya ha sido derrotado.");
            return;
        }

        int costeVida = 10;
        int danioHechizo = hechizo == 1 ? 35 : 25;

        setVida(getVida() - costeVida);
        System.out.println(nombre + " sacrifica " + costeVida + " puntos de vida para lanzar " + hechizoFav + ".");

        if (vida == 0) {
            muerte();
            return;
        }

        System.out.println(nombre + " lanza el hechizo contra " + objetivo.nombre + ".");
        objetivo.recibirDanio(danioHechizo);
    }

    public void meditar() {
        mana = Math.min(100, mana + 20);
        System.out.println(nombre + " recupera maná. Maná actual: " + mana);
    }
}
