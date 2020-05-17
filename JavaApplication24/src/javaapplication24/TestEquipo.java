package javaapplication24;
public class TestEquipo {
    public static void main(String[] args) {  
        Equipo e = new Equipo();
        e.setFutbolista();
        e.borrarFutbolista();
        System.out.println("--- Futbolistas ---");
        e.mostarFutbolistas();
        System.out.println("--- Consulta Futbolista ---");
        e.comprobarFutbolistas();
        System.out.println("--- Menor ---");
        e.Menor();
        System.out.println("--- Mayor ---");
        e.Mayor();

    }
}
