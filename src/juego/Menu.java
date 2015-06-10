package juego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javazoom.jl.decoder.JavaLayerException;

public class Menu implements ActionListener{

    JFrame marco;
    JPanel panel, panelA, panelB, panelC;
    JButton jugar,salir;
    JComboBox mapa;
    JTable tabla;
    JScrollPane scroll;
    DefaultTableModel dtm;
    String[][] datos;
    String[] campos = {"NOMBRE", "APELLIDOS", "CURSO"};
    int opc;
    
    Juego juego = new Juego();

    public Menu(int opc) {
        
        this.opc=opc;
        marco = new JFrame();
        panel = new JPanel();
        panel.add(this.crearPanelA());
        marco.add(panel);
        marco.setSize(400, 400);
        marco.setResizable(false);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoG.png")).getImage());

    }

    public JPanel crearPanelA() {
        jugar = new JButton(" JUGAR ");
        salir= new JButton(" SALIR ");
        mapa = new JComboBox();
        panelA = new JPanel();
        panelA.setBackground(Color.red);
        panelA.setBounds(0, 0, 400, 400);
        mapa.addItem("Mapa 1");
        mapa.addItem("Mapa 2");
        mapa.addItem("Mapa 3");
        
        jugar.addActionListener(this);
        salir.addActionListener(this);
        
        panelA.add(jugar);
        panelA.add(mapa);
        panelA.add(salir);
        
        jugar.setBounds(20, 20, 50, 30);

        return panelA;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(mapa.getSelectedItem().equals("Mapa 1")){
            opc=1;
        }else if(mapa.getSelectedItem().equals("Mapa 2")){
            opc=2;
        }else{
            opc=3;
        }
        
        try {
            juego.ejecutar(opc);
            marco.setVisible(false);
        } catch (Exception ex) {
           
        }
    }



}
