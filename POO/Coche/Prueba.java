public class Prueba {
    public static void main(String [] args){
        Motor m = new Motor("Honda", "Full Ingentyon", 17);
        Vehiculo v = new Vehiculo("Cb190r", "Negro");
        Propietario p = new Propietario("Cristhian");
        Propietario p1 = new Propietario("Garrido");
        v.setMotor(m);
        p.setVehiculo(v);
        v.agregarPropietario(p);
        v.agregarPropietario(p1);
        v.mostrarPropietarios();
        System.out.println(v);
    }
}
