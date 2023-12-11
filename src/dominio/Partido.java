package dominio;
import java.io.*;
import java.util.ArrayList;

class Partido implements Serializable {
    private static final long serialVersionUID = 1L;

    private Equipo local;
    private Equipo visitante;
    private String resultado;

    public Partido(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
        this.resultado = "0 - 0"; // Resultado inicial
    }

    public String getResultado() {
        return resultado;
    }

    public void jugarPartido(int golesLocal, int golesVisitante) {
        this.resultado = golesLocal + " - " + golesVisitante;
    }
}
