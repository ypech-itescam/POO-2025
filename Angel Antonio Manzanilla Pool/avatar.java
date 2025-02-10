public void recibirDano(int dano) {
        vida -= dano;
        if (vida <= 0) {
            vida = 0;
            System.out.println("Game Over");
        } else {
            System.out.println("Tienes " + dano + " de daño. Vida restante: " + vida);
        }
    }

    public void habilidad() {
        if (energia >= 30) {
            System.out.println("¡Habilidad especial!");
            energia -= 30;
        } else {
            System.out.println("No tienes suficiente vida para usar la habilidad especial.");
        }
    }

    public String toString() {
        return "Avatar{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + vida +
                ", energia=" + energia +
                '}';
    }

    public static void main(String[] args) {
        Avatar miAvatar = new Avatar("Usuario1");
        System.out.println(miAvatar);

        miAvatar.subirNivel();
        miAvatar.recibirDano(25);
        miAvatar.usarHabilidad();

        System.out.println(miAvatar);
    }
}
