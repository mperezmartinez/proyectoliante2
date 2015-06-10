package juego;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author aquinoacordero
 */
public class Disparo {

    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    int contBalas;

    public Disparo(int personajeX, int personajeY) {

        JLabel balita = new JLabel();

        this.x = personajeX;
        this.y = personajeY;

        balita.setIcon(new ImageIcon(getClass().getResource("/Imagenes/bala.png")));

    }

    public void movedisp(boolean arriba, boolean abajo, boolean derecha, boolean izquierda) {
        if (arriba == true) {

        }
        if (abajo == true) {

        }
        if (derecha == true) {

        }
        if (izquierda == true) {

        }
    }

    public int cargador(int contBalas) {

        if (contBalas > 0) {
            contBalas--;

        } else {
            /*while(label_bala!=null){
             //label_bala.setBounds(escenario[personajeX][personajeY]+40,escenario[personajeX][personajeY]+20 10, 10);
             }*/
            JOptionPane.showMessageDialog(null, "NO HAY MUNICION");
        }
        System.out.println(contBalas);
        return contBalas;
    }

}
