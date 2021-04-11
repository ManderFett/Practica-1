/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadoresControladores;

import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import InterfazGrafica.OpcionesAgua;
import InterfazGrafica.OpcionesDesierto;
import InterfazGrafica.OpcionesGrama;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorOpciones {

    OpcionesGrama opcionesGrama = new OpcionesGrama();
    OpcionesAgua opcionesAgua = new OpcionesAgua();
    OpcionesDesierto opcionesDesierto = new OpcionesDesierto();

    private CeldaJButton celdaCliqueada;

    public ManejadorOpciones() {

    }

    public JFrame opcionesDeCelda(CeldaJButton celdaCliqueada) {
        if (celdaCliqueada.getTipoCelda().equals("Grama")) {
            opcionesGrama.setVisible(true);
            return opcionesGrama;
        } else if (celdaCliqueada.getTipoCelda().equals("Agua")) {
            opcionesAgua.setVisible(true);
            return opcionesAgua;
        } else {
            opcionesDesierto.setVisible(true);
            return opcionesDesierto;
        }
    }

}
