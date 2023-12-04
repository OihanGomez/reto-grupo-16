class Curso {
    private String nombre;
    private String fechas;
    private String situacion;

    public Curso(String nombre, String fechas) {
        this.nombre = nombre;
        this.fechas = fechas;
        this.situacion = "PENDIENTE";
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechas() {
        return fechas;
    }

    public String getSituacion() {
        return situacion;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.situacion = nuevoEstado;
    }
}
