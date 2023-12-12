package dominio;
import java.io.Serializable;

public class Gol implements Serializable {
    private static final long serialVersionUID = 1L;

    private Jugador jugador;

    public Gol(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }


}