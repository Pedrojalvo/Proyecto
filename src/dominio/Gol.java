package dominio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import Jugador;

class Gol implements Serializable {
    private static final long serialVersionUID = 1L;

    private Jugador jugador;

    public Gol(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }
}
