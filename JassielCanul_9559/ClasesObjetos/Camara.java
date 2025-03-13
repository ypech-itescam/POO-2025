package ClasesObjetos;
public class Camara {

    private String marca;
    private String modelo;
    private String color;
    private int estado; // 0 = Apagado  1 = Encendido
    private String resolucion;
    private int funcion; // 0 = Tomar Foto  1 = Grabar video
    private MicroSD microSD;

    public Camara (String marc, String mod, MicroSD microSD){
        setMarca(marc);
        setModelo(mod);
        setColor("");
        setEstado(0);
        setFuncion(0);
        setResolucion("");
        this.microSD = microSD;
    }

    public Camara(String marc, String mod, MicroSD microSD, String col, int estado, String resol, int fun){
        setMarca(marc);
        setModelo(mod);
        setColor(col);
        this.microSD = microSD;
        setEstado(estado);
        setResolucion(resol);
        setFuncion(fun);

    }

    public MicroSD getMicroSD(){
        return microSD;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marc) {
        this.marca = marc.equals("")?"Desconocido":marc;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String mod) {
        this.modelo = mod.equals("")?"Genérico":mod;
    }

    public void insertarMicroSD(MicroSD microSD) {
        this.microSD = microSD;
    }

    public void removerMicroSD() {
        this.microSD = null;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String col) {
        this.color = col.equals("")?"Negro":col;
    }

    public String getResolucion() {
        return resolucion;
    }
    public void setResolucion(String res) {
        this.resolucion = res.equals("")?"144p":res;
    }

    public int getFuncion() {
        return funcion;
    }
    public void setFuncion(int fun) {
        this.funcion = (fun <3 && fun>=0)?fun:0;
    }

    public int getEstado(){
        return estado;
    }
    public void setEstado(int est) {
        this.estado = (est <2 && est>=0)?est:0;
    }

    public String toString(){
        return "Marca:"+ marca + " \n\r    - Modelo: " + modelo + " \n\r    - Color: "+color + "\n\r    - Resolución: " 
        + resolucion + "\n\r    - Función: " + (funcion == 0 ? "Tomando Foto" : "Grabando") + "\n\r    - Estado: " 
        + (estado == 0 ? "Apagado" : "Encendido")+" \n\r    - " + (getMicroSD() != null ? microSD.toString() : "No Insertada");
    }

}
