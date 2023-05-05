/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_nahimhilsaca;

import java.util.Scanner;

/**
 *
 * @author nahim
 */
public class Lab3P1_NahimHilsaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 1;
        while (opcion != 4) {
            System.out.println(" Menu");
            System.out.println("1. Serie Euclidiana ");
            System.out.println("2. Pokebola");
            System.out.println("3. Ok Boomer!");
            System.out.println("4.Salir");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println(" Puntos a ingresar: ");
                    int puntos = leer.nextInt();
                    double euclidiano = 1;
                    int resta;
                    double respuesta = 0;

                    for (int i = 1; i <= puntos; i++) {
                        System.out.println("Ingrese x:");
                        int x = leer.nextInt();
                        System.out.println(" Ingrese y:");
                        int y = leer.nextInt();
                        resta = (x - y);
                        euclidiano = Math.pow(resta, 2);

                        respuesta = respuesta + euclidiano;
                    }

                    System.out.println("La distancia euclidiana es:" + Math.sqrt(respuesta));

                    break;

                case 2: {
                    System.out.println("Ingrese la magnitud de su pokebola(N): ");
                    int N = leer.nextInt();

                    while (N <= 0) {
                        System.out.println("Su numero debe ser positivo y que no sea 0");
                        N = leer.nextInt();
                    }
                    int mitad = N / 2;

                    for (int x = 1; x <= N; x++) { // x es Filas
                        for (int y = 1; y <= (N * 2) - 1; y++) { // Y es columnas

                            if (x == 1 || x == N || y == 1 || y == (N * 2) - 1) {
                                System.out.print("*");//borde
                            } else {
                                if (x < (N / 2) - 1) {
                                    System.out.print("*");
                                }
                                System.out.print(" ");
                                if ((x == mitad - 1 ||x== mitad + 1) && (y > N / 3 && y == (N * 2) / 3)) {
                                    System.out.println(" #");
                                }

                            }
                        }
                        System.out.println(" ");
                    }
                    System.out.println(" ");
                    break;
                }

                // Fin del Case 2
                case 3:
                    System.out.println(" Ingrese cuando nacio: ");
                    int edad = leer.nextInt();

                    while (edad <= 0) {
                        System.out.println("Su edad debe de ser positiva y que no sea 0");
                        edad = leer.nextInt();

                    }

                    if (edad >= 2013 && edad <= 2025) {
                        System.out.println("¡ Felicidades, usted es de la Generacion Gen Alpha");

                    } else if (edad >= 1990 && edad <= 2012) {

                        System.out.println(" ¡ Felicidades, usted es de la Generacion Gen Z! ");

                    } else if (edad >= 1980 && edad <= 1994) {

                        System.out.println("¡Felicidades, usted es de la Generacion Millenials!");
                    } else if (edad >= 1975 && edad <= 1985) {
                        System.out.println(" ¡Felicidades, usted es de la Generacion Xennials!");

                    } else if (edad >= 1960 && edad <= 1979) {

                        System.out.println("¡Felicidades, usted es de la Generacion  X ");
                    } else if (edad >= 1946 && edad <= 1964) {

                        System.out.println(" ¡Felicidades, ustes es de la Generacion Baby Boomer");

                    } else {
                        System.out.println(" Su edad no aparece en estos rangos");
                    }

                default:
                    System.out.println("Ingrese de las opciones dadas");
                    break;
            }// Fin del switch
            System.out.println("Desea continuar? Presione 4 si no desea");
            opcion = leer.nextInt();
        }// Fin del while

    }// Fin del main

}// Fin de la clase
