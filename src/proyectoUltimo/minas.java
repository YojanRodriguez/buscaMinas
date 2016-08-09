/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoUltimo;

import java.util.Random;
import static proyectoUltimo.menu.minas;
import static proyectoUltimo.movidas.mov1;
import static proyectoUltimo.movidas.mov2;
import static proyectoUltimo.tablero.columnas;
import static proyectoUltimo.tablero.filas;
import static proyectoUltimo.tablero.matriz;
/**
 *
 * @author Yojan Rodríguez
 * @date 02-06-2016
 **/
public class minas {
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
     * @see intrMinas Introduce las minas en el tablero de juego de manera
     * aleatoria y de manera que no coincida con la primera casilla destapada
     */
    public static void minas() {
        boolean full = false;
        int i = 0;
        out:
        while (i <= minas) {
            for (int f = 1; f < filas; f++) {
                for (int c = 1; c < columnas; c++) {
                    int mina = randNumero(columnas);
                    if ((c == mina) && (matriz[f][c] == '-') && (f != mov1 && c != mov2)) {
                        matriz[f][c] = '*';
                        ++i;
                        if (i == minas) {
                            break out;
                        }
                    }
                }
            }
        }
    }
    public static void colocandoMinas() {
      int count = 0;
        for (int n = 2; n <= matriz.length - 2; ++n) {
            for (int o = 2; o <= matriz[0].length - 2; ++o) {
                count = 0;
                if ((matriz[n + 1][o + 1] == '*') && (matriz[n][o] == '-')) {
                    ++count;
                }
                if ((matriz[n - 1][o - 1] == '*') && (matriz[n][o] == '-')) {
                    ++count;
                }
                if ((matriz[n - 1][o + 1] == '*') && (matriz[n][o] == '-')) {
                    ++count;
                }
                if ((matriz[n + 1][o - 1] == '*') && (matriz[n][o] == '-')) {
                    ++count;
                }
                if ((matriz[n - 1][o] == '*') && (matriz[n][o] == '-')) {
                    ++count;
                }
                if ((matriz[n + 1][o] == '*') && (matriz[n][o] == '-')) {
                    ++count;
                }
                if ((matriz[n][o + 1] == '*') && (matriz[n][o] == '-')) {
                    ++count;
                }
                if ((matriz[n][o - 1] == '*') && (matriz[n][o] == '-')) {
                    ++count;
                }
                if (matriz[n][o] == '-') {
                    if (count > 0) {
                        matriz[n][o] = Integer.toString(count).charAt(0);
                    } else if (count == 0) {
                        matriz[n][o] = Integer.toString(count).charAt(0);
                    }
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == '-') {
                    matriz[i][j] = Integer.toString(0).charAt(0);
                }
            }
        }
    }
}