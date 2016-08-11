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
import static proyectoUltimo.tablero.matriz2;
import static proyectoUltimo.tablero.tablero;
/**
 **
 ** @author Yojan Rodríguez
 ** @date 10-08-2016
 **/
public class subMenu {
    public static void subMenu(){
    boolean x = false;        
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
            movidas(mov1, mov2);            
             while (!finPartida) { 
                tablero(filas, columnas, matriz2);
                System.out.println("");
                movimiento();
                movidas(mov1, mov2);
                if(finPartida){
                    
                }
                }
             
            }
    }
}
    