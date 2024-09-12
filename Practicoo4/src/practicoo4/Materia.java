package practicoo4;

import java.util.Objects;

public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria,String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return nombre + " " + anio ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.idMateria;
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
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }
    
    
    
}

