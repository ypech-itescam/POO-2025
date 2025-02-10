public class Gato {
    private String nombre;
    private String raza;
    private boolean estado;

    public Gato(String nombre, String raza, boolean estado) {
        this.nombre = nombre;
        this.raza = raza;
        this.estado = estado;
    }
    public void comer(){
        if (estado){
            System.out.println(nombre+" esta comiendo");
        }
        else {
            System.out.println(nombre+" ya esta morido");
        }
    }
    public void respirar(){
        if (estado){
            System.out.println(nombre+" esta respirando");
        }
        else {
            System.out.println(nombre+" ya esta tieso");
        }
    }
    public void dormir(){
        if (estado){
            System.out.println(nombre+" anda durmiendo");
        }
        else{
            System.out.println(nombre+" igual anda durmiendo, pero nunca va a despertar");
        }
    }
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public static void main(String[] args) {
        Gato elGato = new Gato("Gato", "Persa", false);

        System.out.println("La raza del gato es "+elGato.getRaza());
        System.out.println("El nombre del gato es "+elGato.getNombre());

        elGato.comer();
        elGato.respirar();
        elGato.dormir();
    }

}
