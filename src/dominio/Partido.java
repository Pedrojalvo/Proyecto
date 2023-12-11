package dominio;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Partido implements Serializable {
    private static final long serialVersionUID = 1L;

    private Equipo local;
    private Equipo visitante;
    private List<Gol> goles;

    public Partido(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
        this.goles = new ArrayList<>();
    }

    public void registrarGol(Jugador jugador) {
        goles.add(new Gol(jugador));
        jugador.marcarGol();
    }

    public List<Gol> getGoles() {
        return goles;
    }

    @Override
    public String toString() {
        return "Partido: " + local.getNombre() + " vs " + visitante.getNombre() + " - Goles: " + goles.size();
    }
}


