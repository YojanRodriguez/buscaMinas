/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoUltimo;
// Creacion de importes
import java.util.Random;
/**
 **
 ** @author Yojan Rodríguez
 ** @date 24-07-2016
 **/
public class tablero {
    /**
     *creacion de la variable columnas como pública estatica
     */
    // Creacion de de variables estaticas 
   public static int columnas = 0;
   public static char[][] matriz = new char[10][10];
   public static char[][] matriz2 = new char[10][10];
    /**
     *creacion de la variable filas como pública estatica
     */
    public static int filas= 0; 
     /**
     * @param length
     * @param length0
     * @param matriz
     * @see intrMinas Introduce las minas en el tablero de juego de manera
     * aleatoria y de manera que no coincida.
     */
    public static void tablero(int length, int length0, char[][] matriz) {
        System.out.println("Tablero de juego");
        for (int t = 1; t < length; t++) {
            if (t == 1) {
                System.out.println("---------------------------------");
            }
            System.out.printf("%4s", t + " ");
            for (int c = 1; c < length0; c++) {
                System.out.printf("%s", "|" + matriz[t][c] + "|");
            }
            if (t == length - 1) {
                System.out.println("");
                for (int c = 1; c < columnas; c++) {
                    if (c == 1) {
                        System.out.print("    ");
                    }
                    System.out.printf("%3s", c + " ");
                }
            }
            System.out.println("");
        }
    }
      /**
     * @see randNumero Crea un numero aleatorio para disponer las minas
     * @param sup Limite del rango númerico
     * @return Devuelve el número aleatorio
     */
    public static int randNumero(int sup) {
        Random rnd = new Random();
        int num = (int) (Math.random() * sup);
        return num;
    }
     /**
     * @see iniciaTablero Inicia la matriz del tablero con guiones
     */
    public static void iniciaTablero() {
            for (int f = 1; f < filas; f++) {
            for (int c = 1; c < columnas; c++) {
                matriz2[f][c] = '-';
            }
        }
        for (int f = 1; f < filas; f++) {
            for (int c = 1; c < columnas; c++) {
                matriz[f][c] = '-';
            }
        }
    }
}