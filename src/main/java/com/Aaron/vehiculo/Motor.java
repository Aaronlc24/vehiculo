package com.Aaron.vehiculo;

/*
 * autor: Aaròn Lòpez
 * fecha: 25/10/2025 version: 1.0
 * descripcion: Interfaz Motor que modela un motor que sera implementado por lasclases Terrestre y
 * Acuatico
 * */


/*
Esta interfaz denominada Motor modela un motor que sera implementado por lasclases Terrestre y
Acuatico*/

public interface Motor {
    /*
    * Metodo que permite calcular las revoluciones de un motor a partit de la fuerza y el radio
    * del motor
    * @param fuerza Parámetro que define la fuerza del motor de un vehículo
    * @param radio Parámetro qye define el radio del motor de un vehículo
    */
    int calcularRevolucionMotor(int fuerza, int radio);
}
