public class Bocina{

        //Atributos
        private String marca; 
        private int volumen;
        private String tamano;
    
     // Método constructor
    
        public Bocina(String Marca,String tamano,int volumen){
            setMarca(marca);
            setTamano(tamano);
            setVolumen(volumen);
        } 
    // Metodos get
        public String getMarca(){
            return marca;
        }
        public int getVolumen(){
            return volumen;
        }
        public String getTamano(){
            return tamano;
        }
        // Método set
        public void setMarca(String marca){
            this.marca= marca;
        }
        public void setEstado(int estado){
            this.estado=estado;
        }
        public void setColor(String color){
            this.color=color;
        }
        public void onRgb(int estado){
            if (estado <= 0 && estado>=1){
                System.out.println("EL RGB SE ENCUENTRA APAGADO");
    
            }else{
                System.out.println("EL RGB SE ENCUENTRA ENCENDIDO");
            }
        }
        @Override
        public String toString() {
            return ("Marca :" + getMarca()+ "\n"+ "Estado :" + getEstado()+"\n" + "Color :" + getColor()+"\n");
            }
    }
