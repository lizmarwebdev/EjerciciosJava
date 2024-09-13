package Ejercicio0309;

// Subclase Carro que hereda de Vehiculo
public class Carro extends Vehiculo {
    private boolean tieneAireAcondicionado;

    // Constructor de Carro
    public Carro(String color, String marca, boolean tieneAireAcondicionado) {
        // Llamamos al constructor de la clase padre (Vehiculo)
        super(4, color, marca); // Los carros típicamente tienen 4 ruedas
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    // Getter y setter para el atributo específico de Carro
    public boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    // Implementación del método abstracto acelerar
    @Override
    public void acelerar() {
        System.out.println("El carro está acelerando.");
    }

    // Método específico de Carro
    public void encenderAireAcondicionado() {
        if (tieneAireAcondicionado) {
            System.out.println("Aire acondicionado encendido.");
        } else {
            System.out.println("Este carro no tiene aire acondicionado.");
        }
    }
}

