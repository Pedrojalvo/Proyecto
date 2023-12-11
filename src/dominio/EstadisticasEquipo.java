package dominio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class EstadisticasEquipo implements Serializable {
    private static final long serialVersionUID = 1L;

    private int partidosJugados;
    private int victorias;
    private int derrotas;

    public EstadisticasEquipo() {
        this.partidosJugados = 0;
        this.victorias = 0;
        this.derrotas = 0;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void incrementarPartidosJugados() {
        partidosJugados++;
    }

    public void incrementarVictorias() {
        victorias++;
    }

    public void incrementarDerrotas() {
        derrotas++;
    }

}

