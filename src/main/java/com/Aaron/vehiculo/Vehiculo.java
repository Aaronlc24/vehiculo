package com.Aaron.vehiculo;

/*
 * autor: Aaròn Lòpez
 * fecha: 25/10/2025 version: 1.0
 * descripcion: clase abstracta Vehículo que sirve como
 * plantilla para las clases Terrestre y Acuático
 * */




/*
* clase abstracta es una clase que no puede ser instanciada directamente,
es decir no se pueden crear objetos a partir de ella. Su principal
propósito es servir como modelo o plantilla para que otras clases
* hereden sus caracteristicas.
* Las clases abstractas se utilizan cuando se quiere definir un comportamiento
* común para un conjunto de clases relacionadas, pero dejando ciertos detalles
sin implementar, para que las subclases los definan según sus propias necesidades
*/
public abstract class Vehiculo {
    int velocidadActual;
    int velocidadMaxima;
    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void imprimir(){
        System.out.println("Velocidad Actual: " + velocidadActual);
        System.out.println("Velocidad Maxima: "+ velocidadMaxima);
    }
    /*
     * Método abstrato que permite incrementar la velocidad de un
     * vehículo
     * @param velocidad Parámetro que define el incremento de la
     * velocidad de un vehículo
     **/
    /*
     * Un método abstracto es aquel que se declara pero no se implementa dentro
     * de una clase abstracta. Su cuerpo es reemplazado por una declaración
     *vacia, y las clases hijas (subclases) son las responsables
     * de proporcionar la implementación concreta del método*/
    abstract void acelerar(int velocidad);
    /*
     * Método abstarcto que pemite decrementar la velocidad de un vehículo
     * @param velocidad Parámetro que define el decremento de la velocidad de un vehiculo
     *
     **/
    abstract void frenar(int velocidad);
}


