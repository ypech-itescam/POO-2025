public class Audifonos {
         private String marca;
        private String color;
        private boolean estado; // en caso de estar encendido o apagado
    
        public Audifonos (String marca, String color, boolean estado){
            this.marca = marca;
            this.color = color;
            this.estado = false;
        }
    
        //Gets-Sets
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
            this.color = color;
        }
    
        public boolean getEstado(){
            return estado;
        }
    
        public void setEstado(boolean estado){
            this.estado = estado;
        }
    
        //Metodos
        public void encender(){
            estado = true;
            System.out.println(" el audifono esta encendido");
        }
    
        public void apagar(){
            estado = false;
            System.out.println("el audifono esta apagado");
        }
    
        public void pausarMusica(){
            System.out.println("la musica ha sido pausada");
        }
    
        //informacion
        public void mostrarInfo(){
            System.out.println("Marca:" + marca);
            System.out.println("Color:" + color);
            System.out.println("Estado:" + (estado? "Encendido" : "Apagado"));
        }
    }
    

