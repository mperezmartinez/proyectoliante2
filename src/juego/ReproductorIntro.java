package juego;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class ReproductorIntro {

 static boolean pausa = false;
 
   public void sonido() throws FileNotFoundException,
         JavaLayerException, InterruptedException {
      final Player pl = new Player(new FileInputStream(
            "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/fondo.mp3"));
      
      
 
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
   
   public void pararSonido(){
     
}
}

