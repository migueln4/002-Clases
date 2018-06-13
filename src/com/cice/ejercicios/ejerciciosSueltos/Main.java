package com.cice.ejercicios.ejerciciosSueltos;
import java.util.Scanner;

public class Main {

    static Scanner leerConsola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("¿Cuántos enteros vas a introducir?");
        System.out.println("El mayor de los números introducidos es: "+maxNum(leerArrayEnteros(leerEntero())));
    }

    public static int maxNum(int[] arrayEnteros) {
        int aux = arrayEnteros[0];
        for(int i=1;i<arrayEnteros.length;i++) {
//            System.out.println("Comparo "+aux+" con "+arrayEnteros[i]);
            if(aux < arrayEnteros[i]) {
                aux = arrayEnteros[i];
            }
        }
        return aux;
    }

    public static int minNum(int[] arrayEnteros) {
        int aux = arrayEnteros[0];
        for(int i=1;i<arrayEnteros.length;i++) {
            if(aux > arrayEnteros[i]) {
                aux = arrayEnteros[i];
            }
        }
        return aux;
    }

    public static int posicionArray(int[] arrayEnteros, int n) {
        int respuesta=-1;
        for (int i=0;i<arrayEnteros.length-1;i++) {
            if (arrayEnteros[i] == n) {
                respuesta = i;
            }
        }
        return respuesta;
    }

    public static int leerEntero() {
        return leerConsola.nextInt();
    }

    public static int[] leerArrayEnteros(int tamano) {
        int[] arrayEnteros = new int[tamano];
        for(int i=0; i<tamano; i++) {
            System.out.print("Por favor, introduce el valor de la posición "+i+": ");
            arrayEnteros[i] = leerEntero();
            System.out.println();
        }
        return arrayEnteros;
    }
}
