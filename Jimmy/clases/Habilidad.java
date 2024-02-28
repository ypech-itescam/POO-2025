package Jimmy.clases;

public class Habilidad {
  private String nombre;
  private String descripcion;

  public Habilidad(String nombre, String descripcion) {
    setNombre(nombre);
    setDescripcion(descripcion);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}
