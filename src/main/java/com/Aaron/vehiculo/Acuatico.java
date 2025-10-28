package com.Aaron.vehiculo;
/*
 * autor: Aaròn Lòpez
 * fecha: 25/10/2025 version: 1.0
 * descripcion: Clase Acuático que hereda de Vehículo e implementa las
 * interfaces Motor y Vela
 * */

public class Acuatico extends Vehiculo implements Motor, Vela {
    /*Constructor de la calse Acuático
    * @param velocidadActual Parámeto que define la velocidad actual
    *
    de un vehiculo acuático
    * @param velocidad Maxima Parámetro que define la velocidad
    * máxima permitida para un vehículo acupatico
    *
    */
    public Acuatico(int velocidadActual, int velocidadMaxima) {
//Invoacmos al constructor de la clase padre
        super(velocidadActual, velocidadMaxima);
    }
/*
 *
 * Implementación del método abstracto acelerar heredado de
 * Vehículo que permite incrementar la velocidad de un vehículo
 * acuático
 * @param velocidad Parámetro que define el incremento de velocidad de un vehículo acuático
 *
 */
void acelerar(int velocidad) {
    int vel = velocidadActual + velocidad;
    if (vel > velocidadMaxima) {
        System.out.println("Supera la velocidad máxima permitida");
    } else {
        velocidadActual = vel;
    }
}
/*
 * Implementación del mé todo abstracto frenar heredado de Vehículo
 * que permite decrementar la velocidad de un vehículo acuático
 * @param velocidad Paraámetro que define el decremento de
 * celocidad de un vehículo acuático
 */
    void frenar(int velocidad) {
        int vel = velocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("La velocidad no pueede ser negativa");
        } else {
            velocidadActual = vel;
        }
    }
    /*
     * Implementación del método abstracto calcularRevolucionesMotor
     * heredado de Vehiculo que calcula las revoluciones de un motor como la multiplicación de su fuerza por su radio
     * @param fuerza Parámetro que define la fuerza que tiene el motor
     * de un vehículo acuático
     * @param radio Parámetro que define el radio de un motor de un vehpiculo acuático*/
    public int calcularRevolucionMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }
    /*
    * Implementación de método abstracto recomendarVelocidad
    * proveniente de la interfaz Vela que recomienda una determinada
    * velocidad del vehículo de acuerdo a la velocidad del viento
    * @param velocidadViento Parámetro que define la velocidad del
    * viento que influenciará la velocidad actual del vehículo*/

    public void recomedarVelocidad(int velocidadViento){
        if (velocidadViento > 80 || velocidadViento < 10){
            velocidadActual=0;
        }
    }
}
