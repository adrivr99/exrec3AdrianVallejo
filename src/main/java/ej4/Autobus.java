package ej4;

public class Autobus {
    //Clase autobus con constructores, getters y setters y toString

    private int codLinea;
    private String nombreLinea;
    private String observaciones;
    private String cabeceraIda;
    private String cabeceraVuelta;
    private int sentido;
    private int orden;
    private int codParada;
    private String nombreParada;
    private String direccion;

    public Autobus() {
    }

    public Autobus(int codLinea, String nombreLinea, String observaciones,
                   String cabeceraIda, String cabeceraVuelta, int sentido,
                   int orden, int codParada, String nombreParada, String direccion) {
        this.codLinea = codLinea;
        this.nombreLinea = nombreLinea;
        this.observaciones = observaciones;
        this.cabeceraIda = cabeceraIda;
        this.cabeceraVuelta = cabeceraVuelta;
        this.sentido = sentido;
        this.orden = orden;
        this.codParada = codParada;
        this.nombreParada = nombreParada;
        this.direccion = direccion;
    }

    public int getCodLinea() {
        return codLinea;
    }

    public void setCodLinea(int codLinea) {
        this.codLinea = codLinea;
    }

    public String getNombreLinea() {
        return nombreLinea;
    }

    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCabeceraIda() {
        return cabeceraIda;
    }

    public void setCabeceraIda(String cabeceraIda) {
        this.cabeceraIda = cabeceraIda;
    }

    public String getCabeceraVuelta() {
        return cabeceraVuelta;
    }

    public void setCabeceraVuelta(String cabeceraVuelta) {
        this.cabeceraVuelta = cabeceraVuelta;
    }

    public int getSentido() {
        return sentido;
    }

    public void setSentido(int sentido) {
        this.sentido = sentido;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getCodParada() {
        return codParada;
    }

    public void setCodParada(int codParada) {
        this.codParada = codParada;
    }

    public String getNombreParada() {
        return nombreParada;
    }

    public void setNombreParada(String nombreParada) {
        this.nombreParada = nombreParada;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "codLinea=" + codLinea +
                ", nombreLinea='" + nombreLinea + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", cabeceraIda='" + cabeceraIda + '\'' +
                ", cabeceraVuelta='" + cabeceraVuelta + '\'' +
                ", sentido=" + sentido +
                ", orden=" + orden +
                ", codParada=" + codParada +
                ", nombreParada='" + nombreParada + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
