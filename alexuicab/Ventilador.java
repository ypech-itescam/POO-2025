public class Ventilador{
    private String marca;
    private String color;
    private boolean estado;
    private int botonVelocidad;

    public Ventilador(String marca, String color){
        setMarca(marca);
        setColor(color);
        setEstado(false);
        setBotonVelocidad(0);
    }

    public void setMarca(String marca){
        this.marca = (marca.equals(" "))?"MAN":marca;
    }

    public void setColor(String color){
        this.color  = (color.equals(""))?"Gray":color;
    }

    public void setEstado(boolean estado){
        this.estado = (estado)?true:estado;
    }

    public void setBotonVelocidad(int botonVelocidad){
        if (getEstado() == true) {
            this.botonVelocidad = (botonVelocidad <=0 || botonVelocidad >=4)?1:botonVelocidad;
        }
        else if (getEstado() == false) {
            this.botonVelocidad = 0;
        }
    }

    public String getMarca(){
        return marca;
    }

    public String getColor(){
        return color;
    }

    public boolean getEstado(){
        return estado;
    }

    public int getBotonVelocidad(){
        return botonVelocidad;
    }
    
    public void encender(){
        estado= true;
        botonVelocidad = 1;
    }

    public void cambiarVelocidad(int botonVelocidad){
        setBotonVelocidad(botonVelocidad);
    }

    public void apagar(){
        estado= false;
        botonVelocidad = 0;
    }

    public String mostrarMarca(){
        return getMarca();
    }

    public String mostrarColor(){
        return getColor();
    }

    public int mostrarVelocidad(){
        return getBotonVelocidad();
    }

    public double mostrarEstado(){
        return getEstado();
    }

}