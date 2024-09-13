import Ejercicio0309.Vehiculo;
import Ejercicio0309.Carro;
import Ejercicio0309.Moto;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Carro y Moto
        Carro miCarro = new Carro("Rojo", "Toyota", true);
        Moto miMoto = new Moto("Negro", "Honda", true);

        System.out.println("\nInformación del carro:");
        System.out.println("Color: " + miCarro.getColor());
        System.out.println("Marca: " + miCarro.getMarca());
        miCarro.acelerar();

        System.out.println("\nInformación de la moto:");
        System.out.println("Color: " + miMoto.getColor());
        System.out.println("Marca: " + miMoto.getMarca());
        miMoto.acelerar();

        // Ejemplo de uso de Vehiculo (polimorfismo)
        Vehiculo[] vehiculos = {miCarro, miMoto};
        System.out.println("\nUsando polimorfismo:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Vehículo de marca: " + vehiculo.getMarca());
            vehiculo.acelerar();
            // Aquí podríamos llamar a otros métodos comunes definidos en Vehiculo
        }
    }
}