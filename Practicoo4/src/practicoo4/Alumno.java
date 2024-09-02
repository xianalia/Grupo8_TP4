package practicoo4;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.swing.JOptionPane;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private Set<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }
    
    
    public void agregarMateria(Materia materia) {
        if (materias.add(materia)){
            JOptionPane.showMessageDialog(null,"El alumno se inscribió correctamente.");
        }else{
            JOptionPane.showMessageDialog(null,"El alumno ya está inscrito en esa materia.");
        }
    }
    public int cantidadMaterias() {
        return materias.size();
    }
    @Override
    public String toString() {
        return apellido + ", "+ nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + this.legajo;
        hash = 67 * hash + Objects.hashCode(this.materias);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.materias, other.materias)) {
            return false;
        }
        return true;
    }
    
    
}

