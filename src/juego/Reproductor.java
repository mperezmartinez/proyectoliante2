package juego;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Reproductor {

 
   public void Sonido() throws JavaLayerException, FileNotFoundException{
 
      Player apl = new Player(new FileInputStream(
              "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/ambiente.mp3"));
 
      apl.play();
   }
}

