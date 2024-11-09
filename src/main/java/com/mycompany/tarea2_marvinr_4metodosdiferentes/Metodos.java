/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea2_marvinr_4metodosdiferentes;

/**
 *
 * @author marvi
 */

public class Metodos {
    public String mostrarMensaje() {
        return "Programacion Orientada a Objetos";
    }

    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public String listarNumeros(int x) {
        StringBuilder lista = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            lista.append(i).append(" ");
        }
        return lista.toString();
    }
}