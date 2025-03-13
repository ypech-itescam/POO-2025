package Pruebas;


import java.util.Vector;

public class Cliente {

    private String nombre;
    private Vector <Venta> compras;



    public Cliente(String nombre){
        setNombre(nombre);
        this.compras = new Vector<>();
    }



    public String getNombre(){
        return nombre;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
