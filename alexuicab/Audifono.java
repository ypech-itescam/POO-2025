public class Audifono {
    private String marca;
    private String color;
    private int volumen;

    public Audifono(String color){
        setMarca("SONY");
        setColor(color);
        setVolumen(50);
    }

    public void setMarca(String marca){
        this.marca = (marca.equals(""))?"SONY":marca;
    }
    public void setColor(String color){
        this.color = (color.equals(""))?"Blanco":color;
    }
    public void setVolumen(int volumen){
        this.volumen = (volumen<0 || volumen>100)?75:volumen;
    }

    public String getMarca() {
        return marca;
    }
    public String getColor() {
        return color;
    }
    public int getVolumen() {
        return volumen;
    }

    public void subirVolumen(int volumen){
        if (this.volumen <= volumen && volumen<=99) {
           setVolumen(volumen); 
        }
        else if(volumen>=100){
            System.out.println("El volumen está al maximo");
            volumen = 100;
            setVolumen(volumen);
        }
    }

    public void bajarVolumen(int volumen){
        if (this.volumen >= volumen && volumen >=1) {
            setVolumen(volumen);
        }
        else if (volumen<=0) {
            System.out.println("El volumen está al minimo");
            volumen = 0;
            setVolumen(volumen);
        }
    }

    public String mostrarMarca(){
        return getMarca();
    }
    public String mostrarColor(){
        return getColor();
    }
    public int mostrarVolumen(){
        return getVolumen();
    }
    
}
