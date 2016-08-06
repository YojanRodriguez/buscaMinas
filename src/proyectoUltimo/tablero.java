/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoUltimo;
/**
 *
 * @author Yojan Rodríguez
 * @date 24-07-2016
 **/
public class tablero {
    /**
     *creacion de la variable columnas como pública estatica
     */
    public static int columnas = 0;
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
        for (int i = 1; i < length; i++) {
            if (i == 1) {
                System.out.println("---------------------------------");
            }
            System.out.printf("%4s", i + " ");
            for (int j = 1; j < length0; j++) {
                System.out.printf("%s", "|" + matriz[i][j] + "|");
            }
            if (i == length - 1) {
                System.out.println("");
                for (int j = 1; j < columnas; j++) {
                    if (j == 1) {
                        System.out.print("    ");
                    }
                    System.out.printf("%3s", j + " ");
                }
            }
            System.out.println("");
        }
    }
     /**
     * @see iniciaTablero Inicia la matriz del tablero con guiones
     */
    public static void iniciaTablero() {
        char[][] matriz = new char[1][1];
        char[][] matriz2 = new char[1][1];
        for (int l = 1; l < filas; l++) {
            for (int m = 1; m < columnas; m++) {
                matriz2[l][m] = '-';
            }
        }
        for (int l = 1; l < filas; l++) {
            for (int m = 1; m < columnas; m++) {
                matriz[l][m] = '-';
            }
        }
    }
}