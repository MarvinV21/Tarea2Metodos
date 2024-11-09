/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2_marvinr_4metodosdiferentes;

/**
 *
 * @author marvi
 */

public class Recursos4MetodosDiferentes {
    public static void main(String[] args) {
        // Instanciar la clase Recursos
        Metodos recursos = new Metodos();

        // Llamar al primer método
        System.out.println(recursos.mostrarMensaje());

        // Llamar al segundo método con una edad
        System.out.println(recursos.verificarEdad(20));  // Ejemplo: 20 años

        // Llamar al tercer método con dos números
        System.out.println("Multiplicacion: " + recursos.multiplicar(5, 3));  // Ejemplo: 5 * 3

        // Llamar al cuarto método con un número X
        System.out.println("Lista de numeros: " + recursos.listarNumeros(10));  // Ejemplo: 1 al 10
    }
}
