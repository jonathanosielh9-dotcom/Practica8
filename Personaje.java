public class Personaje {
    public String nombre;
    public int vida;
    public int nivel;
    public int ataque;
    public int defensa;

    public Personaje(String nombre, int vida, int nivel, int ataque, int defensa) {
        this.nombre = nombre;
        setVida(vida);
        setNivel(nivel);
        this.ataque = Math.max(0, ataque);
        setDefensa(defensa);
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        if (defensa < 0) defensa = 0;
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) vida = 0;
        if (vida > 100) vida = 100;
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 0) nivel = 0;
        this.nivel = nivel;
    }

    public void info() {
        System.out.println("Nombre: " + nombre + "\nVida: " + vida + "\nNivel: " + nivel + "\nAtaque: " + ataque + "\nDefensa: " + getDefensa());
    }

    public void atacar(Personaje objetivo) {
        if (vida <= 0) {
            System.out.println(nombre + " no puede atacar porque ha sido derrotado.");
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

        System.out.println(nombre + " ataca a " + objetivo.nombre + " con " + ataque + " puntos de ataque.");
        objetivo.recibirDanio(ataque);
    }

    public void recibirDanio(int danioRecibido) {
        if (vida <= 0) return;
        if (danioRecibido < 0) danioRecibido = 0;

        int danioEfectivo = 0;
        if (danioRecibido > 0) {
            danioEfectivo = Math.max(1, danioRecibido - getDefensa());
        }

        System.out.println(nombre + " recibe " + danioEfectivo + " puntos de daño.");
        setVida(vida - danioEfectivo);

        if (vida == 0) muerte();
    }

    public void muerte() {
        System.out.println(nombre + " ha sido derrotado.");
    }
}
