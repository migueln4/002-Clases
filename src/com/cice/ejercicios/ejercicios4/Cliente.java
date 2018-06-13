package com.cice.ejercicios.ejercicios4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Cliente {
    static Scanner leerConsola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Por favor, introduce el radio del círculo que quieres generar ");
        double r = leerDouble();
        while(!moreThanZero(r)) {
            System.out.print("El número debe ser mayor que 0. Por favor, introduce otro: ");
            r = leerDouble();
        }
        Circulo c = new Circulo(r);
        System.out.println("Elige si quieres los resultados redondeados o no.\n(1) Para redondeo\n(2) Sin redondeo.");
        System.out.println("Estos son los datos de tu círculo:");
        int respuesta = leerEntero();
        if (respuesta == 2) {
            mostrarResultados(c);
        } else {
            mostrarRedondeos(c);
        }


    }

    private static boolean moreThanZero(double radio) {
        return radio <= 0 ? false : true;
    }

    private static void mostrarResultados(Circulo c) {
        System.out.println("Radio = "+c.getRadio());
        System.out.println("Perímetro = "+c.getPerimetro());
        System.out.println("Diámetro = "+c.getDiametro());
        System.out.println("Área = "+c.getArea());
    }

    private static void mostrarRedondeos(Circulo c) {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Radio = "+df.format(c.getRadio()));
        System.out.println("Perímetro = "+df.format(c.getPerimetro()));
        System.out.println("Diámetro = "+df.format(c.getDiametro()));
        System.out.println("Área = "+df.format(c.getArea()));
    }

    private static double leerDouble() {
        return leerConsola.nextDouble();
    }

    private static int leerEntero() {
        return leerConsola.nextInt();
    }

}