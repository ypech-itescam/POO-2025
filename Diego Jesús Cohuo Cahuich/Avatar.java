public class Avatar {
    private String nombre;
    private int nivel;
    private int salud;
    private int vida;

    public Avatar(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.salud = 100;
        this.vida = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getSalud() {
        return salud;
    }

    public int getVida() {
        return vida;
    }

    public void aumentarNivel() {
        nivel++;
        salud += 20;
        vida += 10;
    }

    public void recibirDano(int dano) {
        salud -= dano;
        if (salud < 0) {
            salud = 0;
        }
    }

    public void usarHabilidad(String habilidad) {
        if (vida >= 20) {
            System.out.println(nombre + " utiliza la habilidad: " + habilidad);
            vida -= 20;
        }
        else {
            System.out.println("No hay suficiente energía para usar la habilidad.");
        }
    }

    public static void main(String[] args) {

        Avatar miAvatar = new Avatar("MiAvatar");
        System.out.println("Nombre: " + miAvatar.getNombre());
        System.out.println("Nivel: " + miAvatar.getNivel());
        System.out.println("Salud: " + miAvatar.getSalud());
        System.out.println("Vida: " + miAvatar.getVida());

        miAvatar.aumentarNivel();
        System.out.println("Después de subir de nivel:");
        System.out.println("Nivel: " + miAvatar.getNivel());
        System.out.println("Salud: " + miAvatar.getSalud());
        System.out.println("Vida: " + miAvatar.getVida());

        miAvatar.recibirDano(30);
        System.out.println("Después de recibir daño:");
        System.out.println("Salud: " + miAvatar.getSalud());

        miAvatar.usarHabilidad("Ataque especial");
        System.out.println("Después de usar habilidad:");
        System.out.println("Vida: " + miAvatar.getVida());
    }
}