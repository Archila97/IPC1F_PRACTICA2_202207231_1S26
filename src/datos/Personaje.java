package datos;

public class Personaje {
    private String carnet;
    private String apodo;
    private String modeloEscoba; 
    private int retraso; // El tiempo de espera en s
    private int puntos;

    public Personaje(String carnet, String apodo, String modelo, int retraso) {
        this.carnet = carnet;
        this.apodo = apodo;
        this.modeloEscoba = modelo;
        this.retraso = retraso;
        this.puntos = 0;
    }

    // leer tabla
    public String getCarnet() { return carnet; }
    public String getApodo() { return apodo; }
    public String getModeloEscoba() { return modeloEscoba; }
    public int getRetraso() { return retraso; }
    public int getPuntos() { return puntos; }
    
    public void setPuntos(int puntos) { this.puntos = puntos; }
}