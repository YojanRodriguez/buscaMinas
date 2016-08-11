/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoUltimo;
// Creacion de importes
import java.util.Scanner;
import static proyectoUltimo.tablero.columnas;
import static proyectoUltimo.tablero.filas;
/**
 **
 ** @author Yojan Rodríguez
 ** @date 23-07-2016
 **/
public class menu {
     // Creacion de de variables estaticas
    public static int minas = 1;
    public static int fin = 0;
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
                System.out.println("Escoje la longitud mayor a 2: ");
                int x = sc.nextInt();
                if(x>=3){
                filas = x+1;
                columnas = x+1;
                minas = filas-1;
                fin = (filas * columnas) - x;
                }
                else{
                    System.out.println("Lo sentimos esta opcion no se puede realizar");
                    System.out.println("Vamos a darle un juego por defaut");
                filas = 4; // son 4 porque tiene que rellenar la primera fila con números
                columnas = 4; // son 4 porque tiene que rellenar la primera columna con numeros
                minas = 3;
                fin = (filas * columnas) - 3;
                }
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