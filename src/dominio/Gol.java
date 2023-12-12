/**
 * La clase Gol representa un gol anotado por un jugador en un partido.
 * Almacena la información del jugador que anotó el gol.
 */
package dominio;

import java.io.Serializable;

public class Gol implements Serializable {
    private static final long serialVersionUID = 1L;

    private Jugador jugador;

    /**
     * Constructor de la clase Gol.
     * @param jugador Jugador que anotó el gol.
     */
    public Gol(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Obtiene el jugador que anotó el gol.
     * @return Jugador que anotó el gol.
     */
    public Jugador getJugador() {
        return jugador;
    }
}



