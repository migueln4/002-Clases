package com.cice;

import com.cice.vehiculos.Coche; //Esto lo importa porque no están a la altura.

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
    }
}