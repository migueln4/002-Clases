package com.cice;

import com.cice.vehiculos.Coche; //Esto lo importa porque no están a la altura.
import com.cice.fauna.Animal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Coche coche1 = new Coche();

        coche1.setPotencia(100);
        coche1.acelerar();

        //se pueden crear todos los objetos que se desee en función a la plantilla. Solo se pueden diferenciar entre unos y otros en la potencia, que es el único atributo modificable que se ha hecho a través de un set. También, a través del nombre de la variable, pero eso no es propio de él.
        Coche coche2 = new Coche();
        coche2.setPotencia(40);
        Coche coche3 = new Coche();
        coche2.setPotencia(65);

        //Los nombres de las variables, por muy objetos que sean, solo son punteros a memoria. En definitiva, números que reflejan el espacio en memoria que se está ocupando.

        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);

        coche2.acelerar();

        //Solo se diferencian entre sí en que cada uno tiene una potencia diferente.

        Coche coche4 = new Coche();
        coche4.setPotencia(525);
        coche4.acelerar();

        Animal animal0 = new Animal();
        Animal animal1 = new Animal("Felino");
        Animal animal2 = new Animal("Podenco",7);
        System.out.println(animal0.getRaza());
        System.out.println("La raza del animal 1 es "+animal1.getRaza());
        System.out.println("El animal 2 tiene una raza de "+animal2.getRaza()+" y tiene "+animal2.getNumeroPatas()+" patas.");
        animal0.setRaza("Dragón");
        animal1.setRaza("Bichete");
        System.out.println("Ojo, que ahora el animal 0 es un "+animal0.getRaza()+" y el animal 2 ha digievolucionado en "+animal1.getRaza()+".");

        System.out.println("---------------EJEMPLOS DE COPIA VALOR Y REFERENCIA VALOR----------------");

        //COPIA VALOR
        int a = 1;
        int b = a;
        a = 2;
        System.out.println("a = "+a+"\tb = "+b);

        //REFERENCIA VALOR
        String nombre ="Miguel";
        String nombre2 = nombre;
        nombre = "Plastidécor";

        System.out.println("nombre = "+nombre+"\tnombre2 = "+nombre2); //En realidad, aquí se actúa como un copia-valor

        Coche c = new Coche();
        c.setPotencia(20);
        Coche c2 = c;

        c.setPotencia(500);

        System.out.println(c.getPotencia());
        System.out.println(c2.getPotencia());

        System.out.println(c);
        System.out.println(c2);


    }
}