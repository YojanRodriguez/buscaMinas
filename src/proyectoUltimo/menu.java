/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoUltimo;
import java.util.Scanner;
/**
 *
 * @author Yojan Rodríguez
 * @date 23-07-2016
 **/
public class menu {
   /**
     *
     */
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("BUSCAMINAS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Menu:");
        System.out.println("1.   Jugar Nivel  ");
        System.out.println("2.    Salir    ");
        System.out.println("");
        System.out.print("Selecciona una opción [1-2]: ");
        int opcion = sc.nextInt();
        System.out.println("");
        switch (opcion) {
            case 1:
                System.out.print("Escoje la longitud de tu juego: ");
                int x = sc.nextInt();
                
                break;           
            case 2:
               System.exit(0);
                break;
            default:
                System.out.println("Introduce una opción valida!!");
                break;
        }
    } 
}