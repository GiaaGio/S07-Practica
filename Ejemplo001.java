package Ejercicios007;

import java.util.Scanner;

public class Ejemplo001 {
    
    static Scanner teclado = new Scanner(System.in);
    static  int suma = 0;
    
    public static void main(String[] args) {
        int termino;
        termino = numeroTerminos();
        mostrarSerie(termino);
        sumaSerie();
    }
    
    public static int numeroTerminos(){
        int termino;
        do {            
            System.out.print("Ingrese numero de terminos: ");
            termino = teclado.nextInt();
        } while (termino < 0);
        return termino;
    }
    
    public static void mostrarSerie(int termino){
        int i = 1;
        do {            
            System.out.print(i + ", ");
            suma += i; 
            i++;
        } while (i <= termino);
        System.out.println("");
    }
    
    public static void sumaSerie(){
        System.out.println("La suma es: " + suma);
    }
}
