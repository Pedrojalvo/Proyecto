/**
 * La clase Partido representa un partido de fútbol entre dos equipos.
 * Registra los goles anotados durante el partido y proporciona métodos para manipular esta información.
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Partido implements Serializable {
    private static final long serialVersionUID = 1L;

    private Equipo local;
    private Equipo visitante;
    private List<Gol> goles;

    /**
     * Constructor de la clase Partido.
     * @param local Equipo local que participa en el partido.
     * @param visitante Equipo visitante que participa en el partido.
     */
    public Partido(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
        this.goles = new ArrayList<>();
    }

    /**
     * Registra un gol anotado por un jugador durante el partido.
     * @param jugador Jugador que anotó el gol.
     */
    public void registrarGol(Jugador jugador) {
        goles.add(new Gol(jugador));
        jugador.marcarGol();
    }

    /**
     * Obtiene la lista de goles registrados durante el partido.
     * @return Lista de goles.
     */
    public List<Gol> getGoles() {
        return goles;
    }

    /**
     * Representación en cadena del objeto Partido.
     * @return Cadena que muestra los nombres de los equipos participantes y la cantidad de goles registrados.
     */
    @Override
    public String toString() {
        return "Partido: " + local.getNombre() + " vs " + visitante.getNombre() + " - Goles: " + goles.size();
    }
}
