public class Celular {
    
        private String marca;
        private String color;
        private int estado; //1:apagado  2:encendido
        private String modelo;
        private int funcion; //1: mensaje  2:llamadas
    
        public Celular (String marca, String color, int estado, String modelo, int funcion){
            setMarca(marca);
            setColor(color);
            setEstado(estado);
            setModelo(modelo);
            setFuncion(funcion);
        }

        //segundo constructor

        public Celular(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            this.color = "Negro"; // Valor por defecto
            this.estado = 1; // Apagado por defecto
            this.funcion = 1;// Mensaje por defecto
        }
        public String getMarca(){
            return marca;
    
        }
        public void setMarca(String marca){
            this.marca=marca;
    
        }
        public String getColor(){
            return color;
    
        }
        public void setColor(String color){
            this.color=color;
        }
        public int getEstado(){
            return estado;
    
        }
        public void setEstado(int estado){
            if (estado == 1 || estado == 2) {
                this.estado = estado; // Validación añadida
            } else {
                System.out.println("Estado no válido. Use 1 para apagado o 2 para encendido.");
            }
        }

        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public int getFuncion() {
            return funcion;
        }
        public void setFuncion(int funcion) {
            this.funcion = funcion;
    
    
    }

    public String toString() {
        return "Celular: " + marca + "\r\n " +"Color:" + color + "\r\n " + (estado == 1 ? "Apagado" : "Encendido") + ",\r\n" + "Modelo:" + modelo + 
        "\r\n Función: " + (funcion == 1 ? "Mensaje" : "Llamadas" + "\r\n");
    }
}


    
    
