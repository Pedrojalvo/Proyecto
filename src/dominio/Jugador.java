package dominio;
import java.io.Serializable;

public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private int numero;
    private int goles;

    public Jugador(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.goles = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public int getGoles() {
        return goles;
    }

    public void marcarGol() {
        goles++;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + " (Número: " + numero + ") - Goles: " + goles;
    }
}
