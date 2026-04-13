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
    
    public static void estaEnRango(double num, double min, double max){
        System.out.println(num >= min && num <= max);
        
    }
    
    public static void login(String user, String pass) {
        System.out.println(user.equals("admin") && pass.equals("1234"));
    }
    
public static void obtenerMayor(double n1, double n2) {
        System.out.println(Math.max(n1, n2));
 }

public static void esBisiesto(int anio) {
        System.out.println((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0));
    }

    public static void estaAprobado(double nota) {
        System.out.println(nota >= 60);
    }
    
public static void esTriangulo(double a, double b, double c) {
        System.out.println((a + b > c) && (a + c > b) && (b + c > a));
    }

    public static void compararCadenas(String s1, String s2) {
        System.out.println(s1.equals(s2));
    }
}
