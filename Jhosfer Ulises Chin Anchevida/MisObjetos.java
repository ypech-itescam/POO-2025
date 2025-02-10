public class MisObjetos {
    public static class Libreta {
        String forma = "rectangular";
        int numHojas = 100;
        String tipoHojas = "cuadriculadas";
        String tamaño = "grande";
        String materialPasta = "cartón";
        String peso = "ligero";
        String marca = "Wow";
    }

    public static class CajaCarton {
        String peso = "ligero";
        String tamaño = "pequeño";
        boolean esFragil = true;
        String material = "cartón";
        String forma = "prisma rectangular";
        Libreta contieneLibreta = new Libreta();

        public String contenido() {
            return "Libreta de marca " + contieneLibreta.marca;
        }
    }

    public static void main(String[] args) {
        Libreta libreta = new Libreta();
        CajaCarton cajaCarton = new CajaCarton();

        System.out.println("Libreta: " + libreta.marca);
        System.out.println("Caja de cartón: " + cajaCarton.material + " que contiene una " + cajaCarton.contenido());
    }
}



