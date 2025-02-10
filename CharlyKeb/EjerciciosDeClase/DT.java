package CharlyKeb.EjerciciosDeClase;

public class DT {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String campeonatos;

    public DT(String nombre, String apellido, String nacionalidad, String campeonatos) {
        setNombre(nombre);
        setApellido(apellido);
        setNacionalidad(nacionalidad);
        setCampeonatos(campeonatos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Sin registrar nombre" : nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido.equals("") ? "Sin registrar apellido" : apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad.equals("") ? "Sin registrar nacionalidad" : nacionalidad;
    }

    public String getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(String campeonatos) {
        this.campeonatos = campeonatos.equals("") ? "Sin registrar campeonatos" : campeonatos;
    }

    public void planear(int ac) {
        switch (ac) {
            case 1:
                System.out.println("Esta realizando el entrenamiento");
                break;
            case 2:
                System.out.println("Esta planeando el juego");
                break;
            case 3:
        }

    }

    public void dirigir(int accion) {
        switch (accion) {
            case 1:
                System.out.println("CORRE!");
                break;
            case 2:
                System.out.println("DEFIENDE!");
                break;
            case 3:
                System.out.println("10 VUELTAS!");
                break;
            case 4:
                System.out.println("20 SENTADILLAS!");
                break;
            case 5:
                System.out.println("20 ABDOMINALES !");
                break;

            default:
                System.out.println("DESCANSEN");
                break;
        }

    }

}
