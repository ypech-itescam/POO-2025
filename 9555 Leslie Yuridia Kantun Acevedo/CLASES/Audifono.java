public class Audifono{
    private String marca;
    private String color;
    private boolean estado;
    private int volumen;
    private boolean inalambrico;


    public Audifono (String marca, boolean inalambrico){
        setMarca(marca);
        setColor("Blanco");
        setEstado(estado);
        setVolumen(100);
        setInalambrico(inalambrico);
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color.equals("")?"Blanco":color;
    }

    public boolean getEstado(){
        return estado;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public int getVolumen(){
        return volumen;
    }

    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public boolean getInalambrico(){
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico){
        this.inalambrico = inalambrico;
    }

    public void ajustarVolumen(int nuevoVolumen){
        if(estado){
            this.volumen = nuevoVolumen;
            System.out.println("Volumen ajustado a: "+nuevoVolumen+"%");
        }else{
            System.out.println("Endiende los audifonos para ajustar el volumen");
        }
    }

    public void reproducirMusica(String cancion){
        if(estado){
            System.out.println("Reproduciendo: "+cancion);
        }else{
            System.out.println("Enciende los audifonos para escuchar musica");
        }
    }

    public void reproducirSonido(){
        System.out.println("Reproduciendo sonido en audifonos "+marca);
    }

    public String toString(){
        return "Audifono[Marca="+ marca +", Color="+ color +", Volumen ="+ volumen +"%, Estado ="+ (estado ? "Encendido":"Apagado") +", Inalambrico "+(inalambrico ? "Si":"No")+"]";
    }
}