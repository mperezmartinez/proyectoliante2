package juego;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CargarMapa {

    File fichero = new File("mapa1.txt");
    Scanner scan = null;

    int[][] mapaNum = new int[20][22];

    public CargarMapa() {

    }


    public int[][] devMapa() {
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
