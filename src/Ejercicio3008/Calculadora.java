package Ejercicio3008;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saludo y captura del nombre
        System.out.println("Bienvenido a la Calculadora. Por favor, ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");

        while (true) {
            // Menú de opciones
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción (1-5): ");

            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                break;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                continue;
            }

            // Captura de números para la operación
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            // Realizar la operación seleccionada
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("El resultado de la suma es: %.2f\n", resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.printf("El resultado de la resta es: %.2f\n", resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.printf("El resultado de la multiplicación es: %.2f\n", resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("El resultado de la división es: %.2f\n", resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
            }
        }

        scanner.close();
    }
}










