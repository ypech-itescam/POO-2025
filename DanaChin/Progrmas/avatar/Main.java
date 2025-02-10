package Examen;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Proyecto proyecto = new Proyecto("Caroeta", "20 de marxo del 2023", 30);
        System.out.println("Nombre del proyecto: " + proyecto.getNombre());
        System.out.println("Fecha de inicio: " + proyecto.getFechaInicio());
        System.out.println("Duración del proyecto (en días): " + proyecto.getDuracion());

    }
}
