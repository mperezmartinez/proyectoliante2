package juego;

import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;

public class Juego {

    static int opc;
    CargarMapa map = new CargarMapa();

    public static void main(String[] args) {
        
        Menu menu = new Menu(opc);

    }

    public void ejecutar(int opc) throws JavaLayerException, FileNotFoundException, InterruptedException {

        Escenario esc = new Escenario(opc);
        esc.setVisible(true);

    }

}
