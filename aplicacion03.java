package Ejercicios007;

import java.util.Scanner;

public class aplicacion03 {
    public static void main(String[] args) {
        int num;
        float suma;
        num = numeroTerminos();
        System.out.println("-------------REPORTE-------------");
        mostrarSerie(num);
        suma = calcularSumaSerie(num);
        imprimir(suma);
        System.out.println("----------------------------------");
    }

    private static int numeroTerminos() {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de terminos [n]: ");
        n = teclado.nextInt();
        return n;
    }

    private static void mostrarSerie(int n) {
        int i = 0;
        int numerador = 2;
        int denominador = 5;
        while (i < n) {
            System.out.print(numerador + "/" + denominador);
            if (i < n - 1) {
                System.out.print(" , ");
            }
            numerador += 3;
            denominador += 4;
            i++;
        }
        System.out.println(); // Nueva línea después de imprimir la serie
    }

    private static float calcularSumaSerie(int n) {
        int i = 0;
        int numerador = 2;
        int denominador = 5;
        float suma = 0;
        while (i < n) {
            suma += (float) numerador / denominador;
            numerador += 3;
            denominador += 4;
            i++;
        }
        return suma;
    }

    private static void imprimir(float suma) {
        String sumaFormateada = String.format("%.3f", suma);
        System.out.println("La suma es: " + sumaFormateada);
    }
}
