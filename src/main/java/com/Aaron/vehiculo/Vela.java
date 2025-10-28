package com.Aaron.vehiculo;

/*
 * autor: Aaròn Lòpez
 * fecha: 25/10/2025 version: 1.0
 * descripcion: Interfaz Vela que modela una superfice utilizada para
 * propulsar una embarcación mediante la acción del viento sobre ella.
 * */


/*
* Esta interfaz denominada Vela modela una superfice utilizada para
propulsar una embarcación mediante la acción del viento sobre ella.
* La interfaz sera implementada por la clase Acuatico*/
public interface Vela {
    /*
     * Método abstracto que recomienda una determinada velocidad del cehpiculo de
     * acuerdo a la velocidad del viento
     * @param velocidadViento Parámetro que define la velocidad del
     * viento que influenciará en la velocidad actual del vehículo
     *
     */
    void recomedarVelocidad(int velocidadViento);
}
