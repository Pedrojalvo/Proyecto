package dominio;
import java.io.*;
import java.util.ArrayList;

class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private transient ArrayList<Jugador> jugadores; 

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
}
