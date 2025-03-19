public class Propietario {
        private String Nombre;
        private Vehiculo carro;
    
        public Propietario() {
            setNombre("Cliente General");
            setVehiculo(new Vehiculo("Cadillac", "negro"));
        }
    
        public String getNombre() {
            return Nombre;
        }
    
        public void setNombre(String nombre) {
            this.Nombre = nombre.equals("")?"stev uc" : nombre;
        }
    
        public Vehiculo getVehiculo() {
            return carro;
        }
    
        public void setVehiculo(Vehiculo carro) {
            this.carro = carro;
        }
    
       
    }
    
    

