package Ejercicio0309;

// Subclase Moto que hereda de Vehiculo
public class Moto extends Vehiculo {
    private boolean tieneCasco;

    // Constructor de Moto
    public Moto(String color, String marca, boolean tieneCasco) {
        // Llamamos al constructor de la clase padre (Vehiculo)
        super(2, color, marca); // Las motos típicamente tienen 2 ruedas
        this.tieneCasco = tieneCasco;
    }

    // Getter y setter para el atributo específico de Moto
    public boolean getTieneCasco() {
        return tieneCasco;
    }

    public void setTieneCasco(boolean tieneCasco) {
        this.tieneCasco = tieneCasco;
    }

    // Implementación del método abstracto acelerar
    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando.");
    }

    // Método específico de Moto
    public void hacerCaballito() {
        System.out.println("La moto está haciendo un caballito. ¡Cuidado!");
    }
}

