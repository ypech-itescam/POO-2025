public class Mains {
    public static void main(String[]args){
        //nombres
        Propietario Janito=new Propietario();
        Janito.setnombre("Juanito");
        Propietario paquito=new Propietario();
        paquito.setnombre("Paquito");
        Propietario Pablo=new Propietario();
        Pablo.setnombre("Pablo");
        
        //moters
        Motor m=new Motor("nissan", "Gasolina", 250);
        Motor m2=new Motor("mtk4", "Gasolina", 90);
        Motor m3=new Motor("one v8", "Disel", 170);

        //vehiculos
        Vehiculo v2=new Vehiculo("supra", "verda");
        Vehiculo v3=new Vehiculo("mtk 4r", "gris");   
        Vehiculo v=new Vehiculo("nissan gtr", "rojo");
        
        //agregar a Janito
        Janito.setcarro(v);
        Janito.getcarro().setmotor(m);
        //agreagar a pablo
        Pablo.setcarro(v2);
        Pablo.getcarro().setmotor(m2);
        //agregar a paquito
        paquito.setcarro(v3);
        paquito.getcarro().setmotor(m3);

        //imprimir la ficha tecnica
        System.out.println(Janito);
        System.out.println(Pablo);
        System.out.println(paquito);
        

    }
    
}
