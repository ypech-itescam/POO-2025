public class mains {
    public static void main(String[]args){
        //nombres
        Propietario Eduardo=new Propietario();
        Eduardo.setnombre("Eduardo");
        Propietario Jared=new Propietario();
        Jared.setnombre("Jared");
        Propietario Dylan=new Propietario();
        Dylan.setnombre("Dylaan");
        
        //moters
        Motor m=new Motor("nissan", "Gasolina", 250);
        Motor m2=new Motor("mtk4", "Gasolina", 90);
        Motor m3=new Motor("one v8", "Disel", 170);

        //vehiculos
        Vehiculo v2=new Vehiculo("supra", "verda");
        Vehiculo v3=new Vehiculo("mtk 4r", "gris");   
        Vehiculo v=new Vehiculo("nissan gtr", "rojo");
        
        //agregar a Eduardo
        Eduardo.setcarro(v);
        Eduardo.getcarro().setmotor(m);
        //agreagar a Jared
        Jared.setcarro(v2);
        Jared.getcarro().setmotor(m2);
        //agregar a dylan
        Dylan.setcarro(v3);
        Dylan.getcarro().setmotor(m3);

        //imprimir la ficha tecnica
        System.out.println(Eduardo);
        System.out.println(Jared);
        System.out.println(Dylan);
        

    }
    
}
