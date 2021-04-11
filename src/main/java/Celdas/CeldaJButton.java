/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celdas;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class CeldaJButton extends JButton {

    private int numeroFila;
    private int numeroColumna;
    private String tipoCelda;
    private JFrame ventanaOpciones;
    private Icon icon;

    public CeldaJButton(int numeroFila, int numeroColumna, String tipoCelda, Icon icon) {
        super(icon);
        this.numeroFila = numeroFila;
        this.numeroColumna = numeroColumna;
        this.tipoCelda = tipoCelda;
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }

    public int getNumeroColumna() {
        return numeroColumna;
    }

    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = numeroColumna;
    }

    public String getTipoCelda() {
        return tipoCelda;
    }

    public void setTipoCelda(String tipoCelda) {
        this.tipoCelda = tipoCelda;
    }

}
