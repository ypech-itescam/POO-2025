public class Celular1 {
    
    public static void main(String[] args) {
        //Instanciamos los objetos
        Celular celular1 = new Celular("Samsung", "Galaxy", false);
        celular1.setColor("Azul");
        celular1.setCant_camara(5);
        celular1.setPixeles(64);
        celular1.setAlmacenamiento(0);
        celular1.setEstado(true);
    
        //Mostramos los datos
        System.out.println("Marca y modelo "+ celular1.toString());
        System.out.println("Color = "+celular1.getColor());
        System.out.println("Cantidad de camaras = "+celular1.getCant_camara());
        System.out.println("Pixeles = "+celular1.getPixeles());
        System.out.println("Almacenamiento = "+celular1.getAlmacenamiento());
    
    }

}
