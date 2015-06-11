package juego;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class ReproducirDisparo {

    static boolean pausa = false;

    public void sonidoDisp() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/disparo.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }

    public void sonidoDispM() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/dispM.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
