package ManejadoresControladores;

import Celdas.Celda;
import javax.swing.JPanel;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorDeCeldas {

    private JPanel terrenoPanel;
    private Celda[][] distribucionTerreno;

    public ManejadorDeCeldas(JPanel terrenoPanel, Celda[][] distribucionTerreno) {
        this.terrenoPanel = terrenoPanel;
        this.distribucionTerreno = distribucionTerreno;
        imprimirTerreno();
    }

    public void imprimirTerreno() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Celda nuevaCelda = this.distribucionTerreno[i][j];
                this.terrenoPanel.add(nuevaCelda.getCeldaJButton());
            }
        }
    }

}
