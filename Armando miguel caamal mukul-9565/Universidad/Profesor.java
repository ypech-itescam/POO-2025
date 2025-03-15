package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private Universidad universidad;
    private List<Materia> materias;
    
    
    public Profesor(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public void asignarUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    
    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Universidad getUniversidad() {
        return universidad;
    }
    
    public List<Materia> getMaterias() {
        return materias;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor: ").append(nombre).append("\n");
        
        if (universidad != null) {
            sb.append("Universidad: ").append(universidad.getNombre()).append("\n");
        } else {
            sb.append("Universidad: No asignada\n");
        }
        
        sb.append("Materias impartidas: ").append(materias.size()).append("\n");
        for (Materia materia : materias) {
            sb.append("- ").append(materia.getNombre())
              .append(" (").append(materia.getCreditos()).append(" créditos)\n");
        }
        
        return sb.toString();
    }
}
    

