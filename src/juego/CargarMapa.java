package juego;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CargarMapa {

    int[][] mapaNum = new int[20][22];

    public CargarMapa() {

    }

    public int[][] devMapa(int opc) {
        String mapaNombre="";
    if (opc==1)  {
        mapaNombre="mapa1.txt";
    } else if (opc==2){
        mapaNombre="mapa2.txt";
    }
        File fichero = new File(mapaNombre);
        Scanner scan = null;
        
        int pos = 1;
        try {
            scan = new Scanner(fichero);

            while (scan.hasNextLine()) {

                for (int c = 0; c < 20; c++) {
                    String linea = scan.nextLine();
                    String[] dividirLista = linea.split(" ");
                    for (int f = 0; f < 22; f++) {

                        mapaNum[c][f] = (Integer.parseInt(dividirLista[f]));
                        System.out.println(pos + ":" + mapaNum[c][f]);
                        pos++;

                    }

                }

            }
        } catch (Exception except1) {
            except1.printStackTrace();
        } finally {
            try {
                if (scan != null) {
                    scan.close();
                }
            } catch (Exception except2) {
                except2.printStackTrace();
            }
        }
        return mapaNum;
    }
}
