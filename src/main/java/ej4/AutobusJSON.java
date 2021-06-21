package ej4;

public class AutobusJSON {
    //Clase auxiliar para escribir en el archivo JSON los datos que queremos
    private int codigoParadaJSON;
    private String nombreParadaJSON;
    private String direccionJSON;

    public AutobusJSON() {
    }

    public AutobusJSON(int codigoParadaJSON, String nombreParadaJSON, String direccionJSON) {
        this.codigoParadaJSON = codigoParadaJSON;
        this.nombreParadaJSON = nombreParadaJSON;
        this.direccionJSON = direccionJSON;
    }

    public int getCodigoParadaJSON() {
        return codigoParadaJSON;
    }

    public void setCodigoParadaJSON(int codigoParadaJSON) {
        this.codigoParadaJSON = codigoParadaJSON;
    }

    public String getNombreParadaJSON() {
        return nombreParadaJSON;
    }

    public void setNombreParadaJSON(String nombreParadaJSON) {
        this.nombreParadaJSON = nombreParadaJSON;
    }

    public String getDireccionJSON() {
        return direccionJSON;
    }

    public void setDireccionJSON(String direccionJSON) {
        this.direccionJSON = direccionJSON;
    }

    @Override
    public String toString() {
        return "AutobusJSON{" +
                "codigoParadaJSON=" + codigoParadaJSON +
                ", nombreParadaJSON='" + nombreParadaJSON + '\'' +
                ", direccionJSON='" + direccionJSON + '\'' +
                '}';
    }
}
