/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import javax.swing.JLabel;

/**
 *
 * @author Miguel
 */
public class Zombies {

    CrearEscenario crea = new CrearEscenario();

    private int zombieX;
    private int zombieY;

    public void poszombie() {

        zombieX = (int) Math.floor(Math.random() * 18 + 1);
        zombieY = (int) Math.floor(Math.random() * 18 + 1);

    }

    public void genzombie(JLabel[][] escenario, int[][] escMatriz) {

        this.poszombie();

        
        if (escMatriz[zombieX][zombieY] != Contenedor.muro) {
           if (escMatriz[zombieX][zombieY] != Contenedor.moneda) { 
               if (escMatriz[zombieX][zombieY] != Contenedor.municion) { 
             escenario[zombieX][zombieY].setIcon(crea.obtenerImagen(Contenedor.zombieI));
           
            escMatriz[zombieX][zombieY] = Contenedor.zombieI;
            

            escenario[zombieX][zombieY].setIcon(crea.obtenerImagen(Contenedor.zombieI));
               }
           }
        }

    }

}
