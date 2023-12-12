/**
 * La clase Equipo representa un equipo de fútbol.
 * Contiene métodos para gestionar los jugadores y obtener información del equipo.
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private List<Jugador> jugadores;

    /**
     * Constructor de la clase Equipo.
     * @param nombre Nombre del equipo.
     */
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del equipo.
     * @return Nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Agrega un jugador al equipo.
     * @param jugador Jugador a agregar.
     */
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    /**
     * Obtiene la lista de jugadores del equipo.
     * @return Lista de jugadores.
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Obtiene el total de goles anotados por el equipo.
     * @return Total de goles del equipo.
     */
    public int getTotalGolesEquipo() {
        int totalGoles = 0;
        for (Jugador jugador : jugadores) {
            totalGoles += jugador.getGoles();
        }
        return totalGoles;
    }

    /**
     * Representación en cadena del objeto Equipo.
     * @return Cadena que muestra el nombre del equipo y la cantidad de jugadores.
     */
    @Override
    public String toString() {
        return "Equipo: " + nombre + " - Jugadores: " + jugadores.size();
    }
}


