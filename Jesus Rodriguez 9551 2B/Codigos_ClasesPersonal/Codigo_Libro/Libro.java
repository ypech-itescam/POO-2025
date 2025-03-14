public class Libro{
    private String titulo;
    private String autor;
    private String color;
    private int paginas;
 
           //constructor 

    public Libro(String titulo, String autor, String color, int paginas){
        setTitulo(titulo);
        setAutor(autor);
        setColor(color);
        setPaginas(paginas);
    }

    //getter
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getColor(){
        return color;
    }
    public int getPaginas(){
        return paginas;
    }

    //setter
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public String toString(){
        return "Titulo:" + getTitulo() + " \n\r  Autor: " + getAutor() + " \n\r Color:" + getColor()  + " \n\r Paginas:" + getPaginas();
        }

}