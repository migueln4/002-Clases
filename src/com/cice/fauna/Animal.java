package com.cice.fauna;

public class Animal {

    private String raza;
    private Integer numeroPatas;

/*    Un constructor igual que el que sale por defecto es:*/
    public Animal(){    }

    /* Aunque este no es exactamente el que hay por defecto, pero si se quiere crear uno sin parámetros y otro con parámetros, hay que hacer algo como esto.
*/

    public Animal(String animal) {
        super();
        this.raza = animal;
    } //otro constructor diferente.

    public Animal(String animal, Integer patas) {
        super();
        this.raza = animal;
        this.numeroPatas = patas;
    }//un tercer constructor.

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }



}
