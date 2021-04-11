package Celdas;

import javax.swing.ImageIcon;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class Desierto extends TipoDeCelda {

    private String nombre;
    ImageIcon imagenCelda = new ImageIcon(getClass().getResource("/Imagenes/CeldaDesierto.png"));

    public Desierto(String nombre) {
        super(nombre);
    }

    public ImageIcon getImagenCelda() {
        return imagenCelda;
    }

    @Override
    public String toString() {
        return "Desierto";
    }

}
