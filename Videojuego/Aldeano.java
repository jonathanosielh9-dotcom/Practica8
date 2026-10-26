public class Aldeano extends Personaje {
    public String oficio;
    public boolean mision;

    public Aldeano(String nombre, String oficio, boolean mision) {
        super(nombre, 100, 0, 5, 0);
        this.oficio = oficio;
        this.mision = mision;
    }

    public void darMision() {
        if (mision) System.out.println("Derroten al villano, por favor. Les ofrezco 30 monedas.");
        else System.out.println("Buen día.");
    }

    public void comerciar() {
        System.out.println("¿Qué me ofreces?");
    }
}