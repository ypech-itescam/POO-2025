package mariaisabeltrejomoo;
public class Computadora {
    private String marca;
    private String color;
    private String modelo;
    private int memoriaRAM;
    private String tipoSistema;

    public Computadora(String marca, String color, String modelo, int memoriaRAM, String tipoSistema){
        setMarca(marca);
        setColor(color);
        setModelo(modelo);
        setMemoriaRAM(memoriaRAM);
        setTipoSistema(tipoSistema);
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca.equals("")?"LENOVO":marca;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color.equals("")?"azul":color;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo.equals("")?"82KU003XLM":modelo;
    }
    public int getMemoriaRAM(){
        return memoriaRAM;
    }
    public void setMemoriaRAM(int memoriaRAM){
        this.memoriaRAM=memoriaRAM==0?memoriaRAM:8;
    }
    public String getTipoSistema(){
        return tipoSistema;
    }
    public void setTipoSistema(String tipoSistema){
        this.tipoSistema=tipoSistema.equals("")?"Windows":tipoSistema;
    }
    public void encender(){
        System.out.println("Iniciando sesion...");
    }
    public void suspender(){
        System.out.println("...Suspendiendo...");
    }
    public void reiniciar(){
        System.out.println("Reiniciando...");
    }
    public void apagar() {
        System.out.println("Apagando...");
    }
}