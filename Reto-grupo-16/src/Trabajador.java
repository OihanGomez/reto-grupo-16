import java.util.ArrayList;

class Trabajador {
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String foto;
    private String puesto;
    private String localizacion;
    private String descripcion;
    private String[] idiomas = {"castellano", "euskera", "inglés"};
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Trabajador(String nombre, String apellidos, String fechaNacimiento, String foto,
                      String puesto, String localizacion, String descripcion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.foto = foto;
        this.puesto = puesto;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getFoto() {
        return foto;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void mostrarPerfil() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Puesto: " + puesto);
        System.out.println("Localización: " + localizacion);
    }

    public void modificarDatos(String nuevoNombre, String nuevosApellidos, String nuevaFechaNacimiento,
                               String nuevaFoto, String nuevoPuesto, String nuevaLocalizacion, String nuevaDescripcion) {
        this.nombre = nuevoNombre;
        this.apellidos = nuevosApellidos;
        this.fechaNacimiento = nuevaFechaNacimiento;
        this.foto = nuevaFoto;
        this.puesto = nuevoPuesto;
        this.localizacion = nuevaLocalizacion;
        this.descripcion = nuevaDescripcion;
    }

    public void visualizarCursos() {
        for (Curso curso : cursos) {
            System.out.println("Nombre del curso: " + curso.getNombre());
            System.out.println("Fechas de impartición: " + curso.getFechas());
            System.out.println("Situación: " + curso.getSituacion());
        }
    }

    public void anadirCurso(Curso curso) {
        cursos.add(curso);
    }

    public void borrarCurso(Curso curso) {
        cursos.remove(curso);
    }
}
