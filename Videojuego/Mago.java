public class Mago extends Personaje {
    public int mana;
    public String hechizoFav;

    public Mago(String nombre, int nivel, int ataque, int defensa, int mana, String hechizoFav) {
        super(nombre, 100, nivel, ataque, defensa);
        setMana(mana);
        this.hechizoFav = hechizoFav;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            mana = 0;
        }
        if (mana > 100) {
            mana = 100;
        }
        this.mana = mana;
    }   

    public void lanzarHechizo(Personaje objetivo) {
        if (getVida() <= 0) {
            System.out.println(nombre + " no puede lanzar hechizos porque ha sido derrotado.");
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

        if (mana >= 20) {
            setMana(mana - 20);

            System.out.println(nombre + " utiliza " + hechizoFav + ". Maná restante: " + mana);
        } 
        else {
            int costeVida = 30;

            System.out.println(nombre + " no tiene suficiente maná.");

            setVida(getVida() - costeVida);

            System.out.println(nombre + " sacrifica " + costeVida + " puntos de vida para lanzar el hechizo.");

            if (getVida() <= 0) {
                muerte();
                return;
            }
        }

        super.atacar(objetivo);
    }

    public void meditar() {
        if (getVida() <= 0) {
            System.out.println(nombre + " no puede meditar porque ha sido derrotado.");
            return;
        }

        setMana(mana + 20);

        System.out.println(nombre + " recupera maná. Maná actual: " + mana);
    }


}
