public class Main {
    public static void main(String[] args) {
        // Crear un sistema de puntos
        SistemaPuntos sistemaPuntos = new SistemaPuntos();

        // Crear un usuario y agregarlo al sistema de puntos
        Usuario usuario = new Usuario();
        sistemaPuntos.agregarUsuario(usuario);

        // Hacer que el usuario gaste algunos puntos
        usuario.agregarPuntosGastados(20);
        usuario.agregarPuntosGastados(10);

        // Mostrar el historial de puntos gastados del usuario
        sistemaPuntos.mostrarHistoricoPuntos(usuario);
    }
}
