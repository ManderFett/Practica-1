/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celdas;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class Celda {

    private TipoDeCelda tipoDeCelda;
    private CeldaJButton celdaJButton;

    public Celda(TipoDeCelda tipoDeCelda, CeldaJButton celdaJButton) {
        this.tipoDeCelda = tipoDeCelda;
        this.celdaJButton = celdaJButton;
    }

    public TipoDeCelda getTipoDeCelda() {
        return tipoDeCelda;
    }

    public void setTipoDeCelda(TipoDeCelda tipoDeCelda) {
        this.tipoDeCelda = tipoDeCelda;
    }

    public CeldaJButton getCeldaJButton() {
        return celdaJButton;
    }

    public void setCeldaJButton(CeldaJButton celdaJButton) {
        this.celdaJButton = celdaJButton;
    }

}
