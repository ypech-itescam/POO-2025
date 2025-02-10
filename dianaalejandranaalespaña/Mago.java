public class Mago {
    private String nombre;
    private int nivel;
    private int salud;
    private int mana;
    private int armadura;
    private Hechizo hechizoEquipado;

    public Mago(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.salud = 100;
        this.mana = 100;
        this.armadura = 50;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public Hechizo getHechizoEquipado() {
        return hechizoEquipado;
    }

    public void setHechizoEquipado(Hechizo hechizoEquipado) {
        this.hechizoEquipado = hechizoEquipado;
    }

    public void subirNivel() {
        nivel++;
        salud += 10; // Aumentar la salud al subir de nivel, por ejemplo
        mana += 20; // Aumentar el mana al subir de nivel, por ejemplo
    }

    public void lanzarHechizo() {
        if (hechizoEquipado != null) {
            // Implementación para lanzar el hechizo equipado
            System.out.println(nombre + " lanza el hechizo " + hechizoEquipado.getNombre() + ".");
        } else {
            System.out.println(nombre + " no tiene un hechizo equipado.");
        }
    }

    public void defender() {
        System.out.println(nombre + " se defiende y reduce el daño recibido.");
    }

    // Clase Hechizo definida dentro de la clase Mago
    private static class Hechizo {
        private String nombre;
        private int danio;

        public Hechizo(String nombre, int danio) {
            this.nombre = nombre;
            this.danio = danio;
        }

        public String getNombre() {
            return nombre;
        }

        public int getDanio() {
            return danio;
        }
    }

    public static void main(String[] args) {
        Mago miMago = new Mago("MiMago");
        miMago.subirNivel();
        miMago.setHechizoEquipado(new Hechizo("Bola de Fuego", 30));
        miMago.lanzarHechizo();
        miMago.defender();
    }
}
