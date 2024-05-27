package Ejercicios007;

import java.util.Scanner;

public class Ejemplo002 {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Menu de Opciones:");
            System.out.println("[1] Suma");
            System.out.println("[2] Resta");
            System.out.println("[3] Multiplicacion");
            System.out.println("[4] Division");
            System.out.println("[5] Salir");
            System.out.print("Ingrese la opcion que desea: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> realizarSuma();
                case 2 -> realizarResta();
                case 3 -> realizarMultiplicacion();
                case 4 -> realizarDivision();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no valida. Por favor, ingrese una opción valida.");
            }
        } while (opcion != 5);
        scanner.close();
    }

    public static void realizarSuma() {
        System.out.println("Ingrese el primer numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }

    public static void realizarResta() {
        System.out.println("Ingrese el primer numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("La resta es: " + resultado);
    }

    public static void realizarMultiplicacion() {
        System.out.println("Ingrese el primer numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("La multiplicacion es: " + resultado);
    }

    public static void realizarDivision() {
        System.out.println("Ingrese el dividendo:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el divisor:");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("La division es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
