/**
 * La clase EstadisticasEquipo registra las estadísticas de un equipo en términos de partidos jugados, victorias y derrotas.
 * Proporciona métodos para obtener y actualizar estas estadísticas.
 */
package dominio;

import java.io.Serializable;

class EstadisticasEquipo implements Serializable {
    private static final long serialVersionUID = 1L;

    private int partidosJugados;
    private int victorias;
    private int derrotas;

    /**
     * Constructor de la clase EstadisticasEquipo.
     * Inicializa las estadísticas (partidos jugados, victorias y derrotas) en cero.
     */
    public EstadisticasEquipo() {
        this.partidosJugados = 0;
        this.victorias = 0;
        this.derrotas = 0;
    }

    /**
     * Obtiene la cantidad de partidos jugados por el equipo.
     * @return Cantidad de partidos jugados.
     */
    public int getPartidosJugados() {
        return partidosJugados;
    }

    /**
     * Obtiene la cantidad de victorias del equipo.
     * @return Cantidad de victorias.
     */
    public int getVictorias() {
        return victorias;
    }

    /**
     * Obtiene la cantidad de derrotas del equipo.
     * @return Cantidad de derrotas.
     */
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * Incrementa el contador de partidos jugados.
     */
    public void incrementarPartidosJugados() {
        partidosJugados++;
    }

    /**
     * Incrementa el contador de victorias del equipo.
     */
    public void incrementarVictorias() {
        victorias++;
    }

    /**
     * Incrementa el contador de derrotas del equipo.
     */
    public void incrementarDerrotas() {
        derrotas++;
    }
}
