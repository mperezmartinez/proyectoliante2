package juego;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Reproductor {

 static boolean pausa = false;
 
   public void sonido() throws FileNotFoundException,
         JavaLayerException, InterruptedException {
       
      final Player pl = new Player(new FileInputStream(
            "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/Dragula.mp3"));
 
      new Thread() {
         public void run() {
            try {
               while (true) {
                  if (!pausa) {
                     if (!pl.play(2)) {
                        break;
                     }
                  }
               }
            } catch (JavaLayerException e) {
               e.printStackTrace();
            }
         }
      }.start();
 
      Thread.sleep(1000);
      pausa = true;
      System.out.println("pausado");
      Thread.sleep(500);
      pausa = false;
   }
}

