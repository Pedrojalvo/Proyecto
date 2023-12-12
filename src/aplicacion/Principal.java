/**
 * La clase Principal es el punto de entrada de la aplicación.
 * Aquí se crea la interfaz y se simula un escenario de fútbol.
 * Se crean equipos, jugadores y se registra un partido entre ellos.
 */
package aplicacion;

import presentacion.Interfaz;
import dominio.Equipo;
import dominio.Partido;
import dominio.Jugador;

public class Principal {

    /**
     * Método principal que inicia la aplicación.
     * Se crean equipos, jugadores, se registra un partido entre ellos
     * y se muestra la información relevante en la interfaz.
     * @param args Argumentos de línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();

        // Crear equipos y jugadores
        Equipo equipo1 = new Equipo("Equipo 1");
        equipo1.agregarJugador(new Jugador("Jugador A", 10));
        equipo1.agregarJugador(new Jugador("Jugador B", 7));

        Equipo equipo2 = new Equipo("Equipo 2");
        equipo2.agregarJugador(new Jugador("Jugador C", 9));
        equipo2.agregarJugador(new Jugador("Jugador D", 5));

        // Agregar equipos a la interfaz
        interfaz.agregarEquipo(equipo1);
        interfaz.agregarEquipo(equipo2);

        // Crear partido entre los equipos
        Partido partido = new Partido(equipo1, equipo2);
        partido.registrarGol(equipo1.getJugadores().get(0)); // Gol del primer jugador del equipo 1
        partido.registrarGol(equipo2.getJugadores().get(1)); // Gol del segundo jugador del equipo 2

        // Agregar partido a la interfaz
        interfaz.agregarPartido(partido);

        // Mostrar información de equipos y partidos
        interfaz.mostrarInfoEquipos();
        interfaz.mostrarInfoPartidos();
    }
}

