package ClasesObjetos;

public class Main {
    public static void main(String[] args) {
        
        MicroSD MyMicro = new MicroSD("Samsung", 124);
        MicroSD MyMicro2 = new MicroSD();
        MyMicro2.setMarca("Kingston");
        MyMicro2.setCapacidad(1024);
        Camara MyCamara = new Camara("Canon", "EOS RS", MyMicro);
        MyCamara.setColor("Negro");
        MyCamara.setResolucion("45Mp");
        MyCamara.setFuncion(0);
        MyCamara.setEstado(1);
        Camara myCamara2 = new Camara("Nikon", "Z6 II", MyMicro2, "Negro", 1, "24Mp", 0);
        Mochila MyMochila = new Mochila("Azul", "Chenson");
        MyMochila.agregarCamara(MyCamara);
        MyMochila.agregarCamara(myCamara2);
        Mochila MyMochila2 = new Mochila();
        MyMochila2.setMarca("Nike");
        MyMochila2.setColor("Roja");
        MyMochila2.agregarCamara(myCamara2);

        System.out.println(MyMochila);
        System.out.println(MyMochila2);

    }
}
