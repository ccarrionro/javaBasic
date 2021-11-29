package obc.clases;

/**
 * Clase SmartPhone
 */

public class SmartPhone extends SmartDevice {

    // 1. Atributos

    private float sizeScreen;
    private float resolucion;
    private boolean dualSim;
    private String sistemaOperativo;


    // 2. Constructores

    public SmartPhone() {
    }

    public SmartPhone(String procesador, float sizeScreen, float resolucion, boolean dualSim, String sistemaOperativo) {
        this.setProcesador(procesador);
        this.sizeScreen = sizeScreen;
        this.resolucion = resolucion;
        this.dualSim = dualSim;
        this.sistemaOperativo = sistemaOperativo;
    }

    // 3. Métodos


    public float getSizeScreen() {
        return sizeScreen;
    }

    public void setSizeScreen(float sizeScreen) {
        this.sizeScreen = sizeScreen;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}
