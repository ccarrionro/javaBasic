package obc.clases;

public class Coche {


        // 1. Atributos
        String fabricante;
        String modelo;
        String matricula;
        float cc;

        // 2. Constructor


    public Coche() {
    }

    public Coche(String fabricante, String modelo, String matricula, float cc) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cc = cc;
    }

    // 3 . métodos


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getCc() {
        return cc;
    }

    public void setCc(float cc) {
        this.cc = cc;
    }
}
