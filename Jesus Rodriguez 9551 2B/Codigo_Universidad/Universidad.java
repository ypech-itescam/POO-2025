public class Universidad {
    private String nombreUniversidad;
    private String nombreMaestro;
    private String materia;

    
    public Universidad(String nombreUniversidad, String nombreMaestro, String materia) {
        setNombreUniversidad(nombreUniversidad);
        setNombreMaestro(nombreMaestro);
        setMateria(materia);

    }

    // Getters
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public String getNombreMaestro() {
        return nombreMaestro;
    }

    public String getMateria() {
        return materia;
    }

    // Setters
    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public void setNombreMaestro(String nombreMaestro) {
        this.nombreMaestro = nombreMaestro;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    
    public String toString() {
        return "Nombre de la Universidad: " + getNombreUniversidad() + " \n\r  Nombre del Maestro: " + getNombreMaestro() + " \n\r Materia:" + getMateria();
    }
}