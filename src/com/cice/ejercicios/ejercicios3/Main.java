package com.cice.ejercicios.ejercicios3;
import java.util.Scanner;
import com.cice.ejercicios.ejercicios3.Calculadora;

//Se va a hacer una calculadora que tome dos métodos y que los sume.

public class Main {
    static Scanner leerConsola = new Scanner(System.in);

    public static void main(String[] args) {
        int n,m,n2,m2;
        System.out.print("Introduce el primer número para sumar: ");
        n = leerEntero();
        System.out.print("Ahora, introduce el segundo número para sumar: ");
        m = leerEntero();
        System.out.println("El resultado de la suma es "+sumarEnteros(n,m));

        System.out.print("Introduce el primer número: ");
        n2 = leerEntero();
        System.out.print("Introduce el segundo número: ");
        m2 = leerEntero();
        System.out.println(n2+"+"+m2+"="+sumarEnteros(n2,m2));
        System.out.println(n2+"-"+m2+"="+restarEnteros(n2,m2));
        System.out.println(n2+"*"+m2+"="+multiplicarEnteros(n2,m2));
        System.out.println(n2+"/"+m2+"="+dividir(n2,m2));

        System.out.println("------------------------------------------------");

        Calculadora calculadora = new Calculadora();

        int a = 343;
        int b = 3552;
        int resultado = calculadora.sumarEnteros(a,b);
        calculadora.pintarResultado(resultado);

    }

    private static int leerEntero() {
        return leerConsola.nextInt();
    }

    private static int sumarEnteros(int n, int m) {return n+m;}

    private static int restarEnteros(int n, int m) {return n-m;}

    private static int multiplicarEnteros(int n, int m) {return n*m;}

    private static double dividir(int n, int m) {return (double)n/m;}
}
