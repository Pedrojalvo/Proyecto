package presentacion;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import dominio.*;
public class Interfaz {
    private List<Equipo> equipos;
    private List<Partido> partidos;

    public Interfaz() {
        this.equipos = cargarEquipos();
        this.partidos = cargarPartidos();
    }

    private List<Equipo> cargarEquipos() {
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream("equipos.dat"))) {
            return (ArrayList<Equipo>) obj.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de equipos no encontrado. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo de equipos. Se creará una nueva lista.");
        }
        return new ArrayList<>();
    }

    private List<Partido> cargarPartidos() {
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream("partidos.dat"))) {
            return (ArrayList<Partido>) obj.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de partidos no encontrado. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo de partidos. Se creará una nueva lista.");
        }
        return new ArrayList<>();
    }

    private void guardarEquipos() {
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("equipos.dat"))) {
            obj.writeObject(equipos);
            System.out.println("Equipos guardados.");
        } catch (IOException e) {
            System.out.println("Error al guardar equipos.");
            e.printStackTrace();
        }
    }

    private void guardarPartidos() {
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("partidos.dat"))) {
            obj.writeObject(partidos);
            System.out.println("Partidos guardados.");
        } catch (IOException e) {
            System.out.println("Error al guardar partidos.");
            e.printStackTrace();
        }
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
        guardarEquipos();
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
        guardarPartidos();
    }

    public void mostrarInfoEquipos() {
        System.out.println("----- Equipos -----");
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
            System.out.println("Total de goles: " + equipo.getTotalGolesEquipo());
            System.out.println("Jugadores:");
            for (Jugador jugador : equipo.getJugadores()) {
                System.out.println(jugador);
            }
            System.out.println("--------------------");
        }
    }

    public void mostrarInfoPartidos() {
        System.out.println("----- Partidos -----");
        for (Partido partido : partidos) {
            System.out.println(partido);
            System.out.println("Goles registrados:");
            for (Gol gol : partido.getGoles()) {
                System.out.println(gol.getJugador().getNombre() + " marcó un gol.");
            }
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();

        Equipo nuevoEquipo = new Equipo("Nuevo Equipo");
        nuevoEquipo.agregarJugador(new Jugador("Jugador 1", 7));
        interfaz.agregarEquipo(nuevoEquipo);

        Equipo equipoLocal = new Equipo("Equipo Local");
        equipoLocal.agregarJugador(new Jugador("Jugador A", 10));
        Equipo equipoVisitante = new Equipo("Equipo Visitante");
        equipoVisitante.agregarJugador(new Jugador("Jugador B", 5));
        Partido nuevoPartido = new Partido(equipoLocal, equipoVisitante);
        nuevoPartido.registrarGol(equipoLocal.getJugadores().get(0));
        nuevoPartido.registrarGol(equipoVisitante.getJugadores().get(0));
        interfaz.agregarPartido(nuevoPartido);

        interfaz.mostrarInfoEquipos();
        interfaz.mostrarInfoPartidos();
    }
}
