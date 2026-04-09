
package org.diegotorres.view;
import java.util.Scanner;

public class ViewMenuPrincipal {
    //global
    int opcionMenu = 0;
    Scanner leer = new Scanner (System.in);
    
    public void mostrarMenu(){
            //local
            while (opcionMenu ==0){
                System.out.println("bienvenido,seleccione una opcion");
                System.out.println("1. operaciones matematicas ");
                System.out.println("2. operaciones de texto ");
                System.out.println("3. operaciones de logica ");
                System.out.println("4. Salir del sistema");
                opcionMenu = Integer.parseInt(leer.nextLine());
            }
    }
    public void mostrarMenuMatematica(){
        System.out.println("menu de operaciones matematicas");
    }
}
