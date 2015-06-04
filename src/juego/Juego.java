package juego;

public class Juego {

    static CargarMapa map = new CargarMapa();

    public static void main(String[] args) {
        int opc=2;
        Escenario esc = new Escenario(opc);
        esc.setVisible(true);

    }

}
