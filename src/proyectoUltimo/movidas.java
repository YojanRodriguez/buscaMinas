/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoUltimo;

import java.util.Scanner;
import static proyectoUltimo.tablero.columnas;
import static proyectoUltimo.tablero.filas;

/**
 *
 * @author Yojan Rodríguez
 * @date 27-07-2016
 **/
public class movidas {
     /**
     * @see introMovim Introduce el movimiento del jugador en el juego
     */
    public static void movidas() {
        int mov1=0;
        int mov2=0;
        
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            System.out.println("Introduce tu movida");
            System.out.println("  ");
            System.out.print("Introduce la columna ");
            mov1 = sc.nextInt();
            System.out.print("Introduce la fila ");
            mov2 = sc.nextInt();
            System.out.println("");
            if ((mov1 < filas && mov2 < columnas) && (mov1 > 0 && mov2 > 0)) {
                valid = true;
            } else {
                valid = false;
            }
        }
    }
}
