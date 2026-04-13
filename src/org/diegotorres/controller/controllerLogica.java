/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.diegotorres.controller;


/**
 *
 * @author informatica
 */
import java.util.Scanner;

public class ControllerLogica {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // El primer valor indica qué ejercicio ejecutar (21-30)
        if (!sc.hasNextInt()) return;
        int opcion = sc.nextInt();
        
switch (opcion) {
            case 21: verificarEdad(sc.nextInt()); break;
            case 22: esPar(sc.nextInt()); break;
            case 23: controlSemaforo(sc.next()); break;
            case 24: estaEnRango(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()); break;
            case 25: login(sc.next(), sc.next()); break;
            case 26: obtenerMayor(sc.nextDouble(), sc.nextDouble()); break;
            case 27: esBisiesto(sc.nextInt()); break;
            case 28: estaAprobado(sc.nextDouble()); break;
            case 29: esTriangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()); break;
            case 30: compararCadenas(sc.next(), sc.next()); break;
        }
        sc.close();
    }

//              --- MÉTODOS ---

    public static void verificarEdad(int edad) {
        System.out.println(edad >= 18);
    }
    public static void esPar(int numero) {
        System.out.println(numero % 2 == 0);
    }
    public static void controlSemaforo(String color) {
        String c = color.toLowerCase();
        if (c.equals("verde")) System.out.println("Avanzar");
        else if (c.equals("amarillo")) System.out.println("Precaución");
        else if (c.equals("rojo")) System.out.println("Detenerse");
    }