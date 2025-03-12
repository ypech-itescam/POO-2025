class Materia {
    private String nombre;
    private int creditos;

    public Materia(String nombre, int creditos) {
        setNombre(nombre);
        setCreditos(creditos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Materia" : nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = (creditos <= 0 || creditos > 10) ? 4 : creditos;
    }

    @Override
    public String toString() {
        return "Materia:\n Nombre: " + getNombre() + "\n Créditos: " + getCreditos();
    }
}
