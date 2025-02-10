import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Nota {
    private String texto;
    private String tipo;
    private String fechaLimite;
    private String autor;
    private int num;
    private String nombreDoc;
    private Color color;
    
    public Nota(String aut, String c, int num, String nombre, String t,String text) {
        color = new Color(c);
        setNombreDoc(nombre);
        setAutor(aut);
        setTexto(text, false);
        setTipo(t);
        setFechaLimite("");
    }
    // getters
    public int getNum(){
        return num;
    }
    public String getNombreDoc(){
        return nombreDoc;
    }
    public String getAutor() {
        return autor;
    }
    public String getTexto() {
        return texto;
    }
    public String getTipo() {
        return tipo;
    }
    public String getFechaLimite() {
       return fechaLimite;
    }
    public Color getColor(){
        return color;
    }
    
    // setters
    public void setNum(int n){
        this.num = n<0?0:n;
    }
    public void setNombreDoc(String nombre){
        this.nombreDoc=nombre.equals("")?"Nota 1": nombre;
    }
    public void setAutor(String aut) {
        this.autor=aut.equals("") ? "Manuel Orlando Keb Ortiz":aut;
    }
    public void setTexto(String text, boolean concatenar) {
        if (concatenar) {
            this.texto += text;
        } else {
            this.texto = text.equals("")?"No se puso nada de información":text;
        }
    }
    public void setTipo(String tip) {
        this.tipo=tip.equals("") ? "Urgente":tip;
    }

    public void setFechaLimite(String fecha) {
        this.fechaLimite=fecha.equals("")?"00/00/00":fecha;
    }  
    public void setColor(String color) {
        this.color.setColor(color);
    }

    //Metodos
    //contador de letras
    public int contadorLetras(String dato){
        if (dato == null) {
            return 0;
        }
        //Contador de  letras 
        char[] text = dato.toCharArray();
        int contador = 0;
        for(int i = 0; i < text.length; i++){
            contador++;
        } 
        return contador;
    }

    //Imprimir lineas del contenido inicio
    public void impLineas(String text, String cont){
        System.out.print("° " + text+cont);
        for(int i = contadorLetras(text)+contadorLetras(cont)+2; i < 82; i++){
            if(i<81){
                System.out.print(" ");
            }
            else if(i==81){
                System.out.print("°");
            }
        }
        System.out.println();
    }

    //imprimir la fecha
    public void fecha(){
        LocalDate tiempoLocal = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String tiempo = tiempoLocal.format(formato);
        System.out.print("° ");
        for(int i = 0; i < 82; i++){
            if(i<68){
                System.out.print(" ");
            }
            else if(i==68){
                System.out.print(tiempo + " °");
            }
        }
        System.out.println();
    }

    //imprimir lineas del inicio
    public void linea(){
        for(int i = 0; i < 82; i++){
            System.out.print("+");
        }
        System.out.println();
    }

    //imprimir el titulo
    public void titulo(){
        for(int i = 0; i < 82; i++){
            System.out.print("+");
        }
        System.out.println();
        String total = getNombreDoc() + " y de numero " + String.valueOf(getNum());
        int numTotal = (82-contadorLetras(total))/2;
        System.out.print("° ");
        for(int i = 0; i < numTotal; i++){
            System.out.print(" ");
        }
        System.out.print(total);
        for(int i = numTotal+contadorLetras(total); i < 81; i++){
            if(i<79){
                System.out.print(" ");
            }
            else if(i==79){
                System.out.print("°");
            }
        }
        System.out.println();
        for(int i = 0; i < 82; i++){
            System.out.print("+");
        }
        System.out.println();
    }

    //Darle formato al texto
    public void acomodarTexto(String texto){
        StringBuilder builder = new StringBuilder();
        String[] cantTexto = new String[contadorLetras(texto)];
        if(contadorLetras(texto)>80){
            String[] palabras = texto.split(" ");
            List<String> lineas = new ArrayList<>();
            //metodo for-each
        for (String palabra : palabras) {
            if (contadorLetras(builder.toString() + palabra + " ") > 79) {
                    lineas.add(builder.toString().trim()); 
                    builder = new StringBuilder(palabra + " ");
            } else {
                builder.append(palabra).append(" ");
            }
        }
        lineas.add(builder.toString().trim());
        cantTexto = lineas.toArray(new String[0]);
        int numLineas = cantTexto.length;
        for (int i = 0; i < numLineas; i++) {
            System.out.print("° " + cantTexto[i]);
            for(int c = contadorLetras(cantTexto[i])+2; c < 82; c++){
                if(c<81){
                    System.out.print(" ");
                }
                else if(c==81){
                    System.out.print("°");
                }
            }
            System.out.println();
        }
        }
        else if(contadorLetras(texto)<80){
            System.out.print("° " + texto);
            for(int i = contadorLetras(texto)+2; i < 82; i++){
                if(i<81){
                    System.out.print(" ");
                }
                else if(i==81){
                    System.out.print("°");
                }
            }
            System.out.println();
        }
    }
}
