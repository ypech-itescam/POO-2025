package Principal;

public class Main {
    public static void main(String[] args) {
        
    Panadero baker = new Panadero(null, 0, 0);

        //  ATRIBUTOS MODIFICADOS (PANADERO)
        baker.setNombre("Juan");
        baker.setEdad(32);
        baker.setEstado(1);

        
        //INICIAR TOSTRING
        System.out.println(baker);

        baker.cambiarEstadoTrabajo();
        baker.disponibilidad();
        
        

        

    Pan bread = new Pan(null, false, 0);

        //ATRIBUTOS MODIFICADOS (PAN)
        bread.setTipo("Frances");
        bread.setEstado(true);
        bread.setPeso(250);

        //METODO TOSTRING
        System.out.println(bread);

        bread.hornear();
        bread.ajustarPeso(0);
        
        

    Horno oven = new Horno(false, 0);

        //ATRIBUTOS MODIFICADOS
        oven.setEstado(true);
        oven.setTemperatura(220.0);

        //METODO TOSTRING
        System.out.println(oven);

        oven.cambiarEstadoHorno();
        oven.ajustarTemperatura(0);
    }
}
