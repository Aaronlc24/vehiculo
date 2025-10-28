package com.Aaron.vehiculo;

/*
 * autor: Aaròn Lòpez
 * fecha: 26/10/2025 version: 1.0
 * descripcion: Clase Terrestre que hereda de Vehículo e implementa la
 * interfaz Motor.
 * */


public class Terrestre extends Vehiculo implements Motor {
    /**
     *Constructor de la clase Terreste
     * @param velocidadActual Parámetro que define la velocidad actual de un vehículo terrestre
     * @param velocidadMaxima Parámetro que define la velocidad máxima permitida para un
     * vehículo terrestre
     */
    public Terrestre(int velocidadActual, int velocidadMaxima){
//Invoca al constructor de la clase padre
        super(velocidadActual, velocidadMaxima);
    }
    /*
    * Implementación del método abstracto acelerar heredado de un vehículo que permite incrementar la velocidad de un vehículo
    terrestre
    * @param velocidad Parámetro que define el incremento de la velocidad de un vehículo terrestre
    */
    public void acelerar(int velocidad){
        int vel = velocidadActual+velocidad;
        if (vel > velocidadMaxima) {
            System.out.println("Supera la velocidad máxima peraitida");
        }else{
            velocidadActual=vel;
        }
    }
    /*
* Implementación del mpetodo abstracto frenar heredado de Vehículo que permite
* decrementar la velocidad de un vehículo terrestre
@param velocidad Parámetro que define el decremento de la
*velocidad de un vehículo terrestre
*
*/
    public void frenar(int velocidad){
        int vel = velocidadActual-velocidad;
        if (vel <0){
            System.out.println("La velocidad no puede ser negativa");
        }else{
            velocidadActual=vel;
        }
    }
    /**
     Implementación del método abstracto calcularRevolucionesMotor
     heredado de Vehículo que calcula las revoluciones de un motor
     como la multiplicación de su fuerza por su radio
     * @param fuerza Parámetro que define la fuerza del motor de un vehículo
     * @param radio Parámetro que define el radio del motor de un vehículo
     */
    public int calcularRevolucionMotor(int fuerza, int radio){
        return (fuerza*radio);
    }
}