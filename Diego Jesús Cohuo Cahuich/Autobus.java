public class Autobus {
    private String marca;
    private String modelo;
    private int asientos;
    private int pasajeros;
    private String linea;
    private String destino;

    public Autobus(String marca, String modelo, int asientos, String linea, String destino) {
        this.marca = marca;
        this.modelo = modelo;
        this.asientos = asientos;
        this.pasajeros = 0;
        this.linea = linea;
        this.destino = destino;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAsientos() {
        return asientos;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public String getLinea() {
        return linea;
    }

    public String getDestino() {
        return destino;
    }

    public void subirPasajeros(int cantidad) {
        if (cantidad > 0 && pasajeros + cantidad <= asientos) {
            pasajeros += cantidad;
            System.out.println(cantidad + " pasajeros han subido al autobús");
        }
        else {
            System.out.println("No hay espacio suficiente para subir tantos pasajeros.");
        }
    }

    public void bajarPasajeros(int cantidad) {
        if (cantidad > 0 && cantidad <= pasajeros) {
            pasajeros -= cantidad;
            System.out.println(cantidad + " pasajeros han bajado del autobús.");
        }
        else {
            System.out.println("No hay tantos pasajeros en el autobús.");
        }
    }

    public static void main(String[] args) {
        Autobus miAutobus = new Autobus("Volvo", "9800", 40, "ADO", "Merida - Centro Historico");

        System.out.println("Autobús: " + miAutobus.getMarca() + " " + miAutobus.getModelo());
        System.out.println("Capacidad: " + miAutobus.getAsientos() + " pasajeros");
        System.out.println("Linea de autobuses " + miAutobus.getLinea() + " con destino a la ciudad de: " + miAutobus.getDestino());

        miAutobus.subirPasajeros(15);
        System.out.println("Pasajeros a bordo: " + miAutobus.getPasajeros());

        miAutobus.bajarPasajeros(5);
        System.out.println("Pasajeros a bordo: " + miAutobus.getPasajeros());
    }
}