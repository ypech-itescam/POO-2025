public class HolaMundoOO {
    private String texto;
    private Color co;


    public HolaMundoOO(String texto, Color co){
        setTexto(texto);
        this.co = co;
    }

    public void setTexto(String texto){
        this.texto = (texto.equals(" "))?"Hola Mundo OO": texto;
    }

    public String getTexto(){
        return texto;
    }
    
    public String mostrarTexto(){
        return (co.getColor()+getTexto());
    }
    
}
