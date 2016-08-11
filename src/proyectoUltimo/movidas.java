/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoUltimo;
// Creacion de importes
import java.util.Scanner;
import static proyectoUltimo.menu.fin;
import static proyectoUltimo.tablero.columnas;
import static proyectoUltimo.tablero.filas;
import static proyectoUltimo.tablero.matriz;
import static proyectoUltimo.tablero.matriz2;
/**
 **
 ** @author Yojan Rodríguez
 ** @date 27-07-2016
 **/
public class movidas {
     // Creacion de de variables estaticas    
     public static int mov1=0;
     public static int mov2=0;
     public static boolean finPartida = false;
     public static int aumento = 0;  
     /**
     * @see introMovim Introduce el movimiento del jugador en el juego
     */
    public static void movimiento() {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            System.out.println("Introduce tu movimiento!");
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
    /**
     * @see recursivDestapa Destapa recursivamente las casillas de juego segun
     * se reunan las condiciones asi como comprueba si se gana o pierde el juego
     * @param casilla Casilla de fila
     * @param casilla2 Casilla de columna
     */
     public static void movidas(int casilla, int casilla2) {
       int casillorg = mov1;
        int casill2org = mov2;
        if (casilla > filas - 1 || casilla < 0 || casilla2 > columnas - 1 || casilla2 < 0) {
            return;
        }
        if (matriz[casillorg][casill2org] == '*') { 
            finPartida= true;
            System.out.println("BOOM!!");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("=======================================================================================================");
        } else if (matriz[casilla][casilla2] == '0') {
            if (matriz2[casilla][casilla2] != matriz[casilla][casilla2]) {
                matriz2[casilla][casilla2] = matriz[casilla][casilla2];
                ++aumento;
                movidas(casilla + 1, casilla2);
                movidas(casilla, casilla2 + 1);
                movidas(casilla + 1, casilla2 + 1);
            }
            if (casilla > filas - 1 || casilla < 0 || casilla2 > columnas - 1 || casilla2 < 0) {
                movidas(casilla, casilla2 - 1);
                movidas(casilla - 1, casilla2);
                movidas(casilla - 1, casilla2 - 1);
                movidas(casilla - 1, casilla2 + 1);
                movidas(casilla + 1, casilla2 - 1);
            }
        } else if ((matriz[casilla][casilla2] > '0')) {
            if (matriz2[casilla][casilla2] != matriz[casilla][casilla2]) {
                matriz2[casilla][casilla2] = matriz[casilla][casilla2];
                ++aumento;
            }
        }
        if (aumento == fin) {
            System.out.println("Has ganado!!!");
            finPartida = true;
        }
    }
}
