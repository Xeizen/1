package javaapplication24;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
public class Futbolista {

private String Apodo;
private String Nombre;
private LocalDate Fecha_Nac;

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFecha_Nac() {
        return Fecha_Nac;
    }

    public void setFecha_Nac(LocalDate Fecha_Nac) {
        this.Fecha_Nac = Fecha_Nac;
    }
    
     @Override
    public String toString() {
        return "Futbolista{" + "Apodo=" + Apodo + ", Nombre=" + Nombre + ", Fecha_Nac=" + Fecha_Nac + '}';
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
        final Futbolista other = (Futbolista) obj;
        if (!Objects.equals(this.Apodo, other.Apodo)) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Fecha_Nac, other.Fecha_Nac)) {
            return false;
        }
        return true;
    }


}