package Ejercicios07;

import java.util.Scanner;

public class Eje02 {

    static int suma;

    public static void main(String[] args) {
        int n, m;
        n = numeroTerminosI();
        m = numeroTerminosF(n);
        System.out.println("--------Reporte--------");
        mostrarSerie(n, m);
        imprimir();
        System.out.println("-----------------------");
    }

    private static int numeroTerminosI() {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese número de términos inicial (n): ");
        n = teclado.nextInt();
        return n;
    }

    private static int numeroTerminosF(int n) {
        int m;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Ingrese número de términos final (m): ");
            m = teclado.nextInt();
            if (m <= n) {
                System.out.println("El número de términos final debe ser mayor que el número de términos inicial.");
            }
        } while (m <= n);
        return m;
    }

    private static void mostrarSerie(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                suma += i;
            }
        }
    }

    private static void imprimir() {
        System.out.println("\nLa suma es: " + suma);
    }
}
