import java.util.PropertyPermission;

    public class Propietario{
    
    //ATRIBUTOS
    private String nombre;
    private Vehiculo carro;


    //CONSTRUCTOR
    public Propietario(){
        setNombre("Pablo");
        setCarro(new Vehiculo("GTR","Rojo"));

    }

    

    //METODO GET
    public String getNombre(){
        return nombre;
    }

    public Vehiculo getCarro(){
        return carro;
    }


    //METODO SET
    public void setNombre(String nombre){
        this.nombre = (nombre.equals("")) ? "Frank" : nombre;
    }

    public void setCarro(Vehiculo carro){
        this.carro = carro;
    }


    public String toString(){

        return ("\n" + "// DATOS DEL PROPIETARIO //" + "\n" + "Nombre: " + getNombre() + "\n" + getCarro());
    }

}

    class Vehiculo {

        //ATRIBUTOS DE LA CLASE//
        private String modelo;
        private String color;
        private Motor motor;
    
    
        //CONSTRUCTOR 
        public Vehiculo (String modelo, String color){
            setModelo(modelo);
            setColor(color);
            setMotor(new Motor ("BMW M-2", "DISEL", 280));
    
    
    
        }
    
        public Vehiculo (String color){
            setColor(color);
            setModelo(modelo);
            setMotor(new Motor ("ALM Z5", "HIBRIDO", 210));
        }
    
    
        //METODOS GET
        public String getModelo(){
            return modelo;
        }
    
        public String getColor(){
            return color;
        }
    
        public Motor getMotor(){
            return motor;
        }
    
    
        //METODO SET
        public void setModelo(String modelo){
            this.modelo = (modelo.equals("")) ? "Audi RS" : modelo;
        }
    
        public void setColor(String color){
            this.color = (color.equals("")) ? "Blanco" : color;
        }
    
        public void setMotor(Motor motor){
            this.motor = motor;
        }
    
    
        public String toString(){
            
            return ("\n\n" + "// DATOS DEL VEHICULO //" + "\n" + "MODELO: "+ getModelo() + "\n" + "COLOR: " + getColor() + "\n" + getMotor());
        }
    }

    class  Motor {

        //ATRIBUTOS DE LA CLASE
        private String tipo;            //GASOLINA - DISEL - HIBRIDO
        private String marca;
        private int hp;
    
        //CONSTRUCTOR 1
        public Motor (String marca,String tipo, int hp) {
            setTipo(tipo);
            setMarca(marca);
            setHp(hp);
        }
    
        //CONSTRUCTOR 2
        public Motor (int hp){
            setTipo(tipo);
            setMarca(marca);
            setHp(hp);
        }
    
        //METODOS GET
        public String getTipo(){
            return tipo;
        }
    
        public String getMarca(){
            return marca;
        }
    
        public int getHp(){
            return hp;
        }
    
    
        //METODOS SET
        public void setTipo(String tipo){
            this.tipo = (tipo.equals("")) ? "Hibrido" : tipo;
        }
    
        public void setMarca(String marca){
            this.marca = (marca.equals("")) ? "Toyota" : marca;
        }
    
        public void setHp(int hp){
            this.hp = (hp >= 0 && hp <= 1000) ? hp : 350;
        }
    
    
        //METODO TOSTRING
        public String toString(){
            
    
        return ("\n" + "//MOTOR//" + "\n" + "Marca: " + getMarca() + "\n" + "Tipo de motor: " + getTipo() + "\n" + "Hp (Caballos de Fuerza): " + getHp() + "\n" );
        }
       
    }


    class Main{
        public static void main(String[] args) {
            //PROPIETARIO PRINCIPAL
        Propietario owner = new Propietario();
        System.out.println(owner.toString());

       
    

        //VEHICULO DEL SEGUNDO PROPIETARIO 
        Motor m1 = new Motor("BMW", "Hibrido", 350);

        Vehiculo v1 = new Vehiculo("G500", "AMARILLO");
        v1.setMotor(m1);

        //SEGUNDO PROPIETARIO 
        Propietario owner2 = new Propietario();
        owner2.setNombre("CARLOS");
        owner2.setCarro(v1);
        System.out.println(owner2);


        //VEHICULO DEL TERCER PROPIETARIO 

        Motor m2 = new Motor("SKS", "GASOLINA", 210);

        Vehiculo v2 = new Vehiculo("SUSUKI", "NEGRO");
        v2.setMotor(m2);


        Propietario owner3 = new Propietario();
        owner3.setNombre("MARCOS");
        owner3.setCarro(v2);
        System.out.println(owner3);
        




 //METODOS INDIVIDUALES 

        //String colorCarro = owner.getCarro().getColor();
        //System.out.println("Color del carro:  " + colorCarro);

        //System.out.println("\nInformación actualizada:");
        //System.out.println(owner.toString());

        //String tipoMotor = owner.getCarro().getMotor().getTipo();
        //System.out.println("Tipo de motor : " + tipoMotor);


        }
    }
    


    
    
    

    