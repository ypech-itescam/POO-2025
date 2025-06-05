package Cine;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String nombre;
    private List<Sala> salas;

    public Cine(String nombre) {
        this.nombre = nombre;
        this.salas = new ArrayList<>();
    }

    public void agregarSala(Sala sala) {
        salas.add(sala);
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void mostrarSalas() {
        System.out.println("Salas del cine " + nombre + ":");
        for (Sala sala : salas) {
            System.out.println("- " + sala.getNombre());
        }
    }
}
