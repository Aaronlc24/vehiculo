package com.Aaron.vehiculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE VEHÍCULOS ===");
            System.out.println("1. Vehículo Terrestre");
            System.out.println("2. Vehículo Acuático");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\n--- Vehículo Terrestre ---");
                    Terrestre camioneta = new Terrestre(100, 250);
                    camioneta.imprimir();
                    camioneta.acelerar(50);
                    System.out.println("Nueva velocidad actual = " + camioneta.velocidadActual);
                }

                case 2 -> {
                    System.out.println("\n--- Vehículo Acuático ---");
                    Acuatico motoAcuatica = new Acuatico(50, 110);
                    motoAcuatica.imprimir();
                    System.out.println("Revoluciones del motor = " +
                            motoAcuatica.calcularRevolucionMotor(1200, 2));
                    motoAcuatica.recomedarVelocidad(20);
                }

                case 3 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opción no válida, intenta nuevamente.");
            }

        } while (opcion != 3);

        sc.close();
    }
}

