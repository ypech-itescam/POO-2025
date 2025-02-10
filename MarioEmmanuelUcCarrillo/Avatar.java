public class Avatar {
    private String nombre;
    private int vida;
    private int exp;
    private int energia;
    private int armadura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public static void main(String[] args) {
        Avatar avatar = new Avatar();
        avatar.setNombre("Avat");
        avatar.setVida(100);
        avatar.setExp(0);
        avatar.setEnergia(100);
        avatar.setArmadura(0);

        System.out.println("Nombre: " + avatar.getNombre());
        System.out.println("Vida: " + avatar.getVida());
        System.out.println("Experiencia: " + avatar.getExp());
        System.out.println("Energía: " + avatar.getEnergia());
        System.out.println("Armadura: " + avatar.getArmadura());
    }
}