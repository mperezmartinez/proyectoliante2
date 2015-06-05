package juego;

public class Juego {

    static CargarMapa map = new CargarMapa();

    public static void main(String[] args) {
        int opc=1;
        Escenario esc = new Escenario(opc);
        esc.setVisible(true);

    }

}
