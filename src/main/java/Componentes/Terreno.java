/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Componentes;

import Celdas.Celda;
import ManejadoresControladores.CreadorTerrenoInicial;

/**
 * 
 * @author Marco Munguia <@markomannder>
 */
public class Terreno {
    private Celda[][] celda;

    public Terreno() {
        this.celda = CreadorTerrenoInicial.crearTerrenoInicial();
    }

    public Celda[][] getCelda() {
        return celda;
    }

    public void setCelda(Celda[][] celda) {
        this.celda = celda;
    }
    

}
