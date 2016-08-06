/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoUltimo;
import static proyectoUltimo.menu.mostrarMenu;
import static proyectoUltimo.tablero.columnas;
import static proyectoUltimo.tablero.filas;
import static proyectoUltimo.tablero.iniciaTablero;
import static proyectoUltimo.tablero.tablero;

/**
 *
 * @author Yojan Rodríguez
 * @date 23-07-2016
 **/
public class buscaMinas {
  
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean x = false;
        boolean fipartida = false;
        boolean devolucion = false;
        char[][] matriz = new char[1][1];
        char[][] matriz2 = new char[1][1];
        while (!x) {
        mostrarMenu();
            iniciaTablero();
            tablero(filas, columnas, matriz2);
            System.out.println("");
             while (!fipartida) {
                if (devolucion) {
                    tablero(filas, columnas, matriz);
                    System.out.println("");
                }
                tablero(filas, columnas, matriz2);
                System.out.println("");
            }
        }
    }
}