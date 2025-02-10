public class Avatar {
    private String nombre;
    private String raza;
    private String superpoder;
    private String arma;
    private int edad;
    private boolean pCorrer;
    private boolean pCaminar;
    private boolean pVolar;

    public Avatar (String nombre, String raza, String superpoder, String arma, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.superpoder = superpoder;
        this.arma = arma;
        this.edad = edad;
        this.pCaminar = false;
        this.pCorrer = false;
        this.pVolar = false;
    }

    public void caminar(){
        if (pCaminar){
            System.out.println(nombre+" esta caminando");
        }
        else {
            System.out.println(nombre+" no puede camina");
        }
    }
    public void correr(){
        if (pCorrer) {
            System.out.println(nombre+" esta corriendo");           
        }
        else{
            System.out.println(nombre+" no puede correr");
        }
    }
    public void volar(){
        if (pVolar) {
            System.out.println(nombre+" esta volando");
        }
        else{
            System.out.println(nombre+" no puede volar");
        }
    }
    public void setPCaminar(boolean pCaminar) {
        this.pCaminar = pCaminar;
        if (pCaminar) {
            this.pCorrer = false;
            this.pVolar = false;
        }
    }

    public void setPCorrer(boolean pCorrer) {
        this.pCorrer = pCorrer;
        if (pCorrer) {
            this.pCaminar = false;
            this.pVolar = false;
        }
    }

    public void setPVolar(boolean pVolar) {
        this.pVolar = pVolar;
        if (pVolar) {
            this.pCaminar = false;
            this.pCorrer = false;
        }
    }

    
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public String getSuperpoder(){
        return superpoder;
    }
    public int getEdad(){
        return edad;
    }
    public String getArma(){
        return arma;
    }

    public static void main(String[] args) {
        Avatar AvatarC = new Avatar("Carlos","Alienigena","Volar","Lanza bombas nucleares",18);
        System.out.println("El nombre es "+AvatarC.getNombre());
        System.out.println("La raza es "+AvatarC.getRaza());
        System.out.println("El superpoder es "+AvatarC.getSuperpoder());
        System.out.println("El arma que tiene es "+AvatarC.getArma());
        System.out.println("Tiene "+AvatarC.getEdad()+" años");

        AvatarC.setPCaminar(true);
        AvatarC.caminar();
        AvatarC.setPCorrer(false);
        AvatarC.correr();
        AvatarC.setPVolar(false);
        AvatarC.volar();
    }

}
