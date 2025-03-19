public class Mouse{
    private String marca;
    private String color;
    private boolean inalambrico;
    private boolean estado;

    public Mouse(String marca, boolean inalambrico){
        setMarca(marca);
        setColor("Negro");
        setInalambrico(inalambrico);
        setEstado(estado);
    }

    public Mouse(String marca) {
        setMarca(marca);
     
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

    public boolean getInalambrico(){
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico){
        this.inalambrico = inalambrico;
    }

    public boolean getEstado(){
        return estado;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public void conectarBluetooth(String dispositivo){
        if(estado && inalambrico){
            System.out.println("Conectando mouse a: "+dispositivo+" por bluetooth");
        }else if(!inalambrico){
            System.out.println("El mouse no es inalambrico");
        }else{
            System.out.println("Enciende el mouse");
        }
    }

    public void hacerClick(){
        if(estado){
            System.out.println("click");
        }else{
            System.out.println("Enciende el mouse");
        }
    }

    public void conectar(){
        System.out.println("Mouse "+marca+" conectado");
    }

    public String toString(){
        return "Mouse[Marca ="+marca+", Color ="+color+", Inalambrico ="+(inalambrico?"Si":"No")+", Estado ="+(estado?"Encendido":"Apagado")+"]";
    }

}