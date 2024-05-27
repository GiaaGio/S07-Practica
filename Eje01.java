package Ejercicios07;

import java.util.Scanner;

public class Eje01 {

    static int suma;

    public static void main(String[] args) {
        int num;
        num = numeroTerminos();
        System.out.println("--------Reporte--------");
        mostrarSerie(num);
        imprimir();
        System.out.println("-----------------------");
    }

    private static int numeroTerminos() {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese número de terminos (n): ");
        n = teclado.nextInt();
        return n;
    }

    private static void mostrarSerie(int n) { //no devuelve nada pero se ejecuta
        int j = 3, k = 5;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(k + " ");
                suma += k;
                k += 2;

            } else {
                System.out.print(j + " ");
                suma += j;
                j += 3;

            }

        }

    }

    private static void imprimir() {
        System.out.println("\nLa suma es : " + suma);
    }
}
