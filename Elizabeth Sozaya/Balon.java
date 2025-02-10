public class Balon{
    private String tipo;
    private int diametro;
    private int peso;
    private int talla;

    public  Balon () {
        setTipo ("Baloncesto");
        setDiametro (61);
        setPeso (567);
        setTalla (7);
    }
        
        public String getTipo () {
            return tipo; 
        }

        public void setTipo (String tipo){
            this.tipo = tipo.isEmpty () ? "Baloncesto": tipo;
        }

        public int getDiametro (){
            return diametro;
        }

        public void setDiametro (int diametro){
             this.diametro = diametro;
        }

        public int getPeso (){
            return peso;
        }

        public void setPeso (int peso){
            this.peso = peso;
        }

        public int getTalla (){
            return talla;
        }

        public void setTalla (int talla){
            this.talla = talla;
        }

        public void Mostrarinfo(){

            System.out.println ("Tipo: " + getTipo ());
            System.out.println ("Diametro: " + getDiametro ());
            System.out.println ("Peso: " + getPeso ());
            System.out.println ("Talla: " + getTalla ());
        }
    
}