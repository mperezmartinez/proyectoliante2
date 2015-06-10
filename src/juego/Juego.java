package juego;

import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;

public class Juego {

    static CargarMapa map = new CargarMapa();

    public static void main(String[] args) throws JavaLayerException, FileNotFoundException, InterruptedException {
        int opc=1;
        Escenario esc = new Escenario(opc);
        esc.setVisible(true);

    }

}
