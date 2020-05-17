package javaapplication24;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.TreeMap;
public class Equipo {
private TreeMap<String, Futbolista> equipo = new TreeMap<String, Futbolista>();
    public void añadirJugador(String nombre,Futbolista Futbolista){
        equipo.put(nombre, Futbolista);
    }
    public void eliminarJugador(String nombre){
        equipo.remove(nombre);
    }
    public void mostrarJugadoresEquipo(Equipo Equipo){
       Iterator itr = equipo.keySet().iterator();
       while(itr.hasNext()){
            Object key = itr.next();
            System.out.println(key);
        }
    }
    public void contarJugadores(Equipo Equipo){
        System.out.println("En el equipo hay: "+ equipo.size()+" jugadores");
    }
    public void eliminarEquipo(){
        equipo.clear();
    }
}
