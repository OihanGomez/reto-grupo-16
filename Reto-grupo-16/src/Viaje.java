class Viaje {
    private String origen;
    private String destino;
    private String tiempoEstimado;
    private int ocupacion;
    private boolean puntualidad;

    public Viaje(String origen, String destino, String tiempoEstimado, int ocupacion) {
        this.origen = origen;
        this.destino = destino;
        this.tiempoEstimado = tiempoEstimado;
        this.ocupacion = ocupacion;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getTiempoEstimado() {
        return tiempoEstimado;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public boolean getPuntualidad() {
        return puntualidad;
    }

    public void setPuntualidad(boolean puntualidad) {
        this.puntualidad = puntualidad;
    }
}
