package Ejercicios07;

import java.util.Scanner;

public class Eje03 {

    static int suma;
    static int divisores;

    public static void main(String[] args) {
        int n;
        n = numeroTerminosI();
        System.out.println("--------Reporte--------");
        mostrarSerie(n);
        imprimir();
        System.out.println("-----------------------");
    }

    private static int numeroTerminosI() {
        int n;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Ingrese número de términos (n): ");
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero válido.");
                teclado.next();
            }
            n = teclado.nextInt();
            if (n <= 0) {
                System.out.println("Por favor, ingrese un número natural (mayor que cero).");
            }
        } while (n <= 0);
        return n;
    }

    private static void mostrarSerie(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                divisores++;
                suma += i;
            }
        }
        System.out.println("");
    }

    private static void imprimir() {
        System.out.println("Divisores: " + divisores);
        System.out.println("Suma: " + suma);

    }
}
