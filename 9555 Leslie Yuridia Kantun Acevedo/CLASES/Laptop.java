public class Laptop{
    private String marca;
    private String color;
    private int pantalla;
    private String modelo;
    private boolean estado;
    private Mouse mouse;
    private Audifono audifono;


    public Laptop (String marca, String modelo, Mouse mouse, Audifono audifono){
        setColor(color);
        setEstado(estado);
        setMarca(marca);
        setModelo(modelo);
        setPantalla(pantalla);
        setMouse(mouse);
        setAudifono(audifono);

    }

    public Laptop(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
        setColor("Negro"); 
        setEstado(false); 
        setPantalla(15);  
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
        this.color = color.equals("")?"Negro":color;
    }
    public int getPantalla(){
        return pantalla;
    }
    public void setPantalla(int pantalla){
        this.pantalla = pantalla;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado( boolean estado){
        this.estado = estado;
    }

    public Mouse getMouse(){
        return mouse;
    }

    public void setMouse(Mouse mouse){
        this.mouse = mouse;
    }

    public Audifono getAudifono(){
        return audifono;
    }

    public void setAudifono(Audifono audifono){
        this.audifono = audifono;
    }

    public void conectarWifi(String red, String contraseña){
        if(estado){
            System.out.println("Conectando a la red Wifi: "+red);
        }else{
            System.out.println("Enciende la laptop para conectarte.");
        }
    }

    public void ajustarVolumen(int nuevoVolumen){
        System.out.println("El volumen se ajusto a: "+nuevoVolumen+"%");
    }

    public void abrirPrograma(String nombrePrograma){
        if(estado){
            System.out.println("Abriendo el programa: "+nombrePrograma);
        }else{
            System.out.println("Encienda la laptop");
        }
    }

    public void encender(){
        System.out.println("Laptop"+marca+""+modelo+" encendida");
    }

    public void usarMouse(){
        mouse.conectar();
    }

    public void usarAudifonos(){
        audifono.reproducirSonido();
    }

    public String toString(){
        return "Laptop [Marca=" + marca + ", Modelo=" + modelo + ", Color=" + color + ", Pantalla=" + pantalla + " pulgadas, Estado=" + (estado ? "Encendida" : "Apagada") + "]\n"+mouse.toString()+"\n"+audifono.toString();
    }

}