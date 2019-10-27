/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calificaciones;
import java.util.Arrays;

/**
 *
 * @author Armando
 */
import java.util.Scanner;

public class Calificaciones {
    
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("¿Cuantos alumnos tienes?:");
      int length = s.nextInt();
      Object [][] myArray = new Object[length][3];
      System.out.println("Introduce el primer nombre del alumno:");

      for(int i=0; i<length; i++ ) {
         myArray[i][0] = s.next();
      }
        for (int inicio = 0; inicio < length; inicio++) {
            System.out.println("Introduce la calificación del examen del alumno " + myArray[inicio][0] + ": ");
            Scanner valor = new Scanner(System.in);
            myArray[inicio][1] = valor.nextInt();
        }
        for (int inicio = 0; inicio < length; inicio++) {
            System.out.println("Introduce la calificación de las practicas del alumno " + myArray[inicio][0] + ": ");
            Scanner valor = new Scanner(System.in);
            myArray[inicio][2] = valor.nextInt();
        }
        System.out.println(Arrays.deepToString(myArray));
        System.out.println("Nombre  \tExamen  \tPracticas  \tStatus");
        for (int registros = 0; registros<length; registros++) {
            int examen = (Integer) myArray[registros][1];
            int practica = (Integer) myArray[registros][2];
            System.out.println((myArray[registros][0]) + "\t\t" + myArray[registros][1] + "\t\t" + myArray[registros][2] + "\t\t" + (((examen + practica)/2 > 6) ? "Aprobado" : "Reprobado"));
        }
   }
}