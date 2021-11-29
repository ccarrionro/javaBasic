package obc.clases;

/**
 * Clase SmartDevice
 */

public class SmartDevice {

    // 1. Atributos

    private String procesador = "";
    private int nucleo = 0;
    private String fabricante = "";
    private String marca = "";
    private String modelo = "";
    private boolean gps;
    private boolean bluetooth;
    private boolean wifi;
    private int year;
    private float precio=0;


    // 2. Constructores

    public SmartDevice() {

    }

    public SmartDevice(String procesador, int nucleo, String fabricante, String marca, String modelo, boolean gps, boolean bluetooth, boolean wifi, int year, float precio) {
        this.procesador = procesador;
        this.nucleo = nucleo;
        this.fabricante = fabricante;
        this.marca = marca;
        this.modelo = modelo;
        this.gps = gps;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.year = year;
        this.precio = precio;
    }

    // 3. Métodos


    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getNucleo() {
        return nucleo;
    }

    public void setNucleo(int nucleo) {
        this.nucleo = nucleo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}


