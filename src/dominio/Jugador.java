/**
 * La clase Jugador representa a un jugador de fútbol.
 * Contiene información como nombre, número de camiseta y cantidad de goles marcados.
 */
package dominio;

import java.io.Serializable;

public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private int numero;
    private int goles;

    /**
     * Constructor de la clase Jugador.
     * @param nombre Nombre del jugador.
     * @param numero Número de camiseta del jugador.
     */
    public Jugador(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.goles = 0;
    }

    /**
     * Obtiene el nombre del jugador.
     * @return Nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de camiseta del jugador.
     * @return Número de camiseta.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Obtiene la cantidad de goles marcados por el jugador.
     * @return Cantidad de goles marcados.
     */
    public int getGoles() {
        return goles;
    }

    /**
     * Incrementa el contador de goles marcados por el jugador.
     */
    public void marcarGol() {
        goles++;
    }

    /**
     * Representación en cadena del objeto Jugador.
     * @return Cadena que muestra el nombre del jugador, su número de camiseta y la cantidad de goles marcados.
     */
    @Override
    public String toString() {
        return "Jugador: " + nombre + " (Número: " + numero + ") - Goles: " + goles;
    }
}
