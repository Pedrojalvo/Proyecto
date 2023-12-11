package dominio;
import java.io.*;
import java.util.ArrayList;


class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private int numero;

    public Jugador(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }
}
