package com.cice.loestatico;

public class Main {

    public static void main(String[] args) {

        Test prueba = new Test(); //Aquí sí que se usa el constructor por defecto

        System.out.println(prueba.toString()); //Test{numeroEntero=0, numeroReal=0.0, esCierto=false, caracter= , nombre='null'}

        //llamo a un método estático de una clase. No requiere instanciar el objeto para poder utilizarlo
        ClaseEstatica.nombreCompuesto("Miguel","Negrillo"); //Puedo acceder a un método de la clase sin hacer un objeto porque es estático

        //creo un objeto y modifico el valor de su variable estática
        ClaseEstatica estatico1 = new ClaseEstatica();
        estatico1.numeroEstatico = 10;

        //Genero un nuevo objeto
        ClaseEstatica estatico2 = new ClaseEstatica();

        //pinto el valor de la variable estática del nuevo objeto.
        System.out.println(estatico2.numeroEstatico);

    }

}
