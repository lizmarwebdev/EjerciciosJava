package Ejercicio0309;

// Clase base Vehiculo
public abstract class Vehiculo {
    // Atributos protegidos para que las subclases puedan acceder
    protected int numeroRuedas;
    protected String color;
    protected String marca;

    // Constructor de la clase base
    public Vehiculo(int numeroRuedas, String color, String marca) {
        this.numeroRuedas = numeroRuedas;
        this.color = color;
        this.marca = marca;
    }

    // Getters y setters
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método abstracto que deben implementar las subclases
    public abstract void acelerar();

    // Método común para todos los vehículos
    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }

}