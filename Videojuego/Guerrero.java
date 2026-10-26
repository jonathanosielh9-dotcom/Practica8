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

    public void atacar() {
        System.out.println("El ataque de " + nombre + " es de " + ataque + " puntos.");
    }

    public void defenderse() {
        System.out.println("La defensa de " + nombre + " reduce el daño recibido.");
    }
}
