/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
    Crear un programa que permita ingresar una calificación por teclado,
    Si la calificación ingresada es mayor o igual 5 y la calificación es menor
    a 10, se debe presentar un mensaje que diga "Usted está en supletorios".
    De lo contrario se presenta un mensaje con el valor de calificación divido 
    para dos.
*/
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjemploSeleccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese su calificación");
        calificacion = entrada.nextDouble();
        
        // python se usa "and"
        if(calificacion >= 5 && calificacion<10){
            System.out.printf("Usted está en supletorio");
        }else{
            // System.out.printf("%d", calificacion/2);
            double resultado = calificacion/2;
            System.out.printf("%f", resultado);
        }
        
    }

}


























