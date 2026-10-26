public class Guerrero extends Personaje {
    public String tipoDeArmadura;
    public int armadura;

    public Guerrero(String nombre, int nivel, int ataque, int defensaBase, String tipoDeArmadura, int armadura) {
        super(nombre, 100, nivel, ataque, defensaBase);
        this.tipoDeArmadura = tipoDeArmadura;
        this.armadura = Math.max(0, armadura);
    }

    @Override
    public int getDefensa() {
        return super.getDefensa() + armadura;
    }

    @Override
    public void atacar(Personaje objetivo) {
        super.atacar(objetivo);
    }   

    public void defenderse() {
        System.out.println(nombre + " utiliza su defensa y armadura para reducir el daño recibido.");
    }

    @Override
    public void recibirDanio(int danioRecibido) {
    if (getVida() <= 0) {
        return;
    }
    defenderse();
        super.recibirDanio(danioRecibido);
    }

}