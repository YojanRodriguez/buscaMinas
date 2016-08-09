/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoUltimo;
import static proyectoUltimo.menu.mostrarMenu;
import static proyectoUltimo.minas.colocandoMinas;
import static proyectoUltimo.minas.minas;
import static proyectoUltimo.movidas.aumento;
import static proyectoUltimo.movidas.finPartida;
import static proyectoUltimo.movidas.mov1;
import static proyectoUltimo.movidas.mov2;
import static proyectoUltimo.movidas.movidas;
import static proyectoUltimo.movidas.movimiento;
import static proyectoUltimo.tablero.columnas;
import static proyectoUltimo.tablero.filas;
import static proyectoUltimo.tablero.iniciaTablero;
import static proyectoUltimo.tablero.matriz;
import static proyectoUltimo.tablero.matriz2;
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
        boolean devolucion = false;
            while (!x) {
            aumento = 0;
            finPartida = false;
            mostrarMenu();
            iniciaTablero();
            tablero(filas, columnas, matriz2);
            System.out.println("");
            movimiento();
            minas();
            colocandoMinas();
            movidas(mov1,mov2);
             while (!finPartida) {
                if (devolucion) {
                    tablero(filas, columnas, matriz);
                    System.out.println("");
                    }
                tablero(filas, columnas, matriz2);
                System.out.println("");
                movimiento();
                movidas(mov1, mov2);
            }
        }
    }
}