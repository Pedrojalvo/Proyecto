package dominio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private List<Jugador> jugadores;

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

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public int getTotalGolesEquipo() {
        int totalGoles = 0;
        for (Jugador jugador : jugadores) {
            totalGoles += jugador.getGoles();
        }
        return totalGoles;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + " - Jugadores: " + jugadores.size();
    }
}


