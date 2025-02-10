package CharlyKeb.EjerciciosDeClase;

public class JugadorFutbol {
    private String nombre;
    private String posicion;
    private int numero;
    private String nacionalidad;
    private int condicionFisica; // 1.estado fisico bueno 2.estadofisico malo

    public JugadorFutbol(String nombre, String posicion, int numero, String nacionalidad) {
        setNombre(nombre);
        setPosicion(posicion);
        setNumero(numero);
        setNacionalidad(nacionalidad);
        this.condicionFisica = 1;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Sin registrar Nombre" : nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion.equals("") ? "Sin registrar Posicion" : posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero == 0 ? 1 : numero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad.equals("") ? "Sin registrar Nacionalidad" : nacionalidad;
    }

    public int getCondicionFisica() {
        return condicionFisica;
    }

    private void changeCondicionFisica(int valor) {
        this.condicionFisica = this.condicionFisica > 0 ? 1 : valor;
    }

    /*
     * public void setCondicionFisica(int condicionFisica) {
     * this.condicionFisica = condicionFisica == 0 ? 1 : condicionFisica;
     * }
     */

    public void correr() {
        System.out.println("El jugador está corriendo");
    }

    public void defender() {

        System.out.println("El jugador está defendiendo");
    }

    public void patear() {

        System.out.println("El jugador está pateando");
    }

    public void entrenar(int acc) {
        switch (acc) {
            case 1:
                System.out.println("El jugador está entrenando");
                break;
            case 2:
                System.out.println("EL jugador está defendiendo");
                break;
            case 3:
                System.out.println("El jugador está correindo");
                break;
            case 4:
                System.out.println("El jugador está haciendo abdominales");
                break;
            case 5:
                System.out.println("El jugador está sentadillas");
                break;

            default:
                System.out.println("El jugador está descansando");
                break;
        }

    }
}
