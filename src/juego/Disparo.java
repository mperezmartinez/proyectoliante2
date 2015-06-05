package juego;

import javax.swing.JOptionPane;

/**
 *
 * @author aquinoacordero
 */

public class Disparo{
    
    public Disparo(){
        
                
    }
    
    public void disparar(){
        
                if (contBalas > 0) {
                    contBalas--;
                } else {
                    /*while(label_bala!=null){
                     //label_bala.setBounds(escenario[personajeX][personajeY]+40,escenario[personajeX][personajeY]+20 10, 10);
                     }*/
                    JOptionPane.showMessageDialog(null, "NO HAY MUNICION");
                }
                System.out.println(contBalas);
                Cargador();
    }
    
    
}
