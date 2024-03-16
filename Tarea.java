/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tarea;


/**
 *
 * @author ruthm
 */
public class Tarea {

    public static void main(String[] args) {
        //Declaracion e inicializacion de variables para las edades
        int [] edades ={19,21,15,18,20};
      
        // Clasificar por mayor y menor de edad
        int sumaMayores = 0;
        int cantidadMayores = 0;
        int sumaMenores = 0;
        int cantidadMenores = 0;
          for (int i=0; i< edades.length; i++) { 
              switch (edades[i]>=18 ? 1 :0) {
                  case 1: 
                      sumaMayores += edades [i];
                      cantidadMayores++;
                      break;
                  default:
                      sumaMenores += edades[i];
                      cantidadMenores++;
                      break;
              }
              
          }
          // Calcular el promedio de edades de mayores y menores 
    double promedioMayores = (double) sumaMayores / cantidadMayores; 
    double promedioMenores = (double) sumaMenores / cantidadMenores; 
    
    // Motrar resultados
    System.out.println("Promedio de edades de mayores de edad: " + promedioMayores);
    System.out.println("Promedio de edades de menores de edad: " + promedioMenores);  
            }
    

}
 