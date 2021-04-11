package ManejadoresControladores;

import Celdas.Agua;
import Celdas.Desierto;
import Celdas.Grama;
import Celdas.TipoDeCelda;
import javax.swing.Icon;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ProbabilidadCeldas {

    private Agua agua;
    private Grama grama;
    private Desierto desierto;
    private Icon Imagen;

    public TipoDeCelda dibujarRandom() {
        double probabilidadCelda = (double) (Math.random());
        if (probabilidadCelda <= 0.25) {
            desierto = new Desierto("Desierto");
            this.Imagen = desierto.getImagenCelda();
            return desierto;
        } else if ((probabilidadCelda > 0.25) && (probabilidadCelda <= 0.60)) {
            agua = new Agua(true, "Agua", "Agua");
            this.Imagen = agua.getImagenCelda();
            return agua;
        } else {
            grama = new Grama(true, true, "Grama");
            this.Imagen = grama.getImagenCelda();
            return grama;
        }
    }

    public Icon getImagen() {
        return Imagen;
    }

}
