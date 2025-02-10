public class Elfo{
    private String nombre;
    private String colordeojos;
    private String colordecabello;
    private double altura;
    private String vestuario;
    private boolean genero;
    private String clasificacion;
    private boolean magia;
    private String arma;
    
    public Elfo (String nombre){
        setNombre (nombre);
        setColordecabello ("Gris");
        setColordeojos ("Verdes");
        setAltura (1.5);
        setVestuario ("Vestidoverde");
        setGenero (true);
        setClasificacion ("Realeza");
        setMagia (false);
        setArma ("Arco");
    }    

    public String getNombre (){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre=nombre.equals("")?nombre:"Trixie";
    }

    public String getColordecabello (){
        return colordecabello;
    }

    public void setColordecabello (String colordecabello){
        this.colordecabello=colordecabello.equals("")?colordecabello:"Gris";
    }

    public String getColordeojos (){
        return colordeojos;
    }

    public void setColordeojos (String colordeojos){
        this.colordeojos=colordeojos.equals("")?colordeojos:"Verdes";
    }

    public double getAltura (){
        return altura;
    }

    public void setAltura (double altura){
        this.altura = altura;
    }

    public String getVestuario (){
        return vestuario;
    }

    public void setVestuario (String vestuario){
        this.vestuario=vestuario.equals("")?vestuario:"Vestidoverde";
    }

    public boolean getGenero(){
        return  genero;
    }

    public void setGenero(boolean genero){
        this.genero = genero;
    }

    public String getClasificacion(){
        return clasificacion;
    }

    public void setClasificacion (String clasificacion){
        this.clasificacion=clasificacion.equals("")?clasificacion:"Realeza"; 
    }

    public boolean getMagia (){
        return magia;
    }

    public void setMagia (boolean magia){
        this.magia = magia;
    }

    public String getArma(){
        return arma;
    }

    public void setArma (String arma){
        this.arma=arma.equals("")?arma:"Arco";
    }

    public String Habla(){
        return ("Bienvenido al bosque encantado" + "Mi nombre es " + getNombre());
    }

    public void Comer (String comida){
        System.out.println ("comiendo" + comida );
    }

    public void Corre(){
        System.out.println("Estoy corriendo");
    }

    public void lanzarHechizos (String hechizo){
        System.out.println("Lanzando un hechizo" + hechizo);
    }

    public void usarelArco (String arco){
        System.out.println("Usando el arco" + arco);
    }

    public void curarAnimales ( String curar){
        System.out.println("Curando un animal" + curar);
    }

    public void comunicarseporTelepatia (String comunicarse){
        System.out.println("Comunicandose con otro elfo");
    }

    public void oir(String sonido){
        System.out.println ("Escuchando un trino de ave" + sonido);
    }

    public void MostrarInfo (){
        
        System.out.println ("Nombre:" + getNombre ());
        System.out.println ("Colordecabello:" + getColordecabello());
        System.out.println ("Colordeojos:" + getColordeojos ());
        System.out.println ("Altura:" + getAltura ());
        System.out.println ("Vestuario" + getVestuario());
        System.out.println ("Genero:" + getGenero());
        System.out.println ("Clasificacion:" + getClasificacion());
        System.out.println ("Magia:"+ getMagia());
        System.out.println ("Arma:" + getArma ());
        
    }

}