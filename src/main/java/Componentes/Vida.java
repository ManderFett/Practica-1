/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import Jugador.Granjero;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class Vida<T> extends Thread {

    private T objeto;
    private JLabel vidaGranjeroLabel;
    private int vidaObjeto;
    private int vidaRestar;

    public Vida(T granjero, JLabel vidaGranjeroLabel, int vidaObjeto, int vidaRestar) {
        this.objeto = objeto;
        this.vidaGranjeroLabel = vidaGranjeroLabel;
        this.vidaObjeto = vidaObjeto;
        this.vidaRestar = vidaRestar;
    }

    @Override
    public void run() {
        while ((vidaObjeto <= 100) && (vidaObjeto != 0)) {
            try {
                Vida.sleep(20000);
                vidaObjeto -= vidaRestar;
                vidaGranjeroLabel.setText(Integer.toString(vidaObjeto));
            } catch (InterruptedException ex) {
                Logger.getLogger(Vida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
