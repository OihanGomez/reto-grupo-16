import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    private String nombre;

    private ArrayList<Viaje> viajesRealizados = new ArrayList<>();
    private int puntos;
    private ArrayList<Integer> historialPuntosGastados = new ArrayList<>();

    public ArrayList<Integer> getHistorialPuntosGastados() {
        return historialPuntosGastados;
    }

    public void agregarPuntosGastados(int puntosGastados) {
        historialPuntosGastados.add(puntosGastados);
        puntos -= puntosGastados;
    }
    public Usuario() {
        this.puntos = 0;
    }

    public ArrayList<Viaje> getViajesRealizados() {
        return viajesRealizados;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPuntos() {
        return puntos;
    }

    public void verViajesRealizados() {
        for (Viaje viaje : viajesRealizados) {
            System.out.println("Viaje de " + viaje.getOrigen() + " a " + viaje.getDestino());
        }
    }

    public void recogerInformacionViaje(Viaje viaje) {
        System.out.println("Tiempo estimado: " + viaje.getTiempoEstimado());
        System.out.println("Ocupación: " + viaje.getOcupacion());
    }

    public void valorarViaje(Viaje viaje) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cómo valorarías el viaje de 1 a 5?");
        int valoracion = scanner.nextInt();

        if (valoracion >= 1 && valoracion <= 5) {
            System.out.println("¡Gracias por tu valoración!");
            puntos += valoracion * 2;
            System.out.println("Has ganado "+ valoracion * 2+" en total ahora tienes "+puntos+" puntos.");
        } else {
            System.out.println("Valoración no válida. Debe estar entre 1 y 5.");
        }
    }

    public void visualizarPuntos() {
        System.out.println("Puntos acumulados: " + puntos);
    }

    public void ganarPuntos(int cantidad) {
        puntos += cantidad;
    }

}
