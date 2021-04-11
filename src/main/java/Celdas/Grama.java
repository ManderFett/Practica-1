package Celdas;

import javax.swing.ImageIcon;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class Grama extends TipoDeCelda {

    private boolean plantarSemilla;
    private boolean colocarAnimal;
    ImageIcon imagenCelda = new ImageIcon(getClass().getResource("/Imagenes/CeldaGrama.png"));

    public Grama(boolean plantarSemilla, boolean colocarAnimal, String nombre) {
        super(nombre);
        this.plantarSemilla = plantarSemilla;
        this.colocarAnimal = colocarAnimal;
    }

    public ImageIcon getImagenCelda() {
        return imagenCelda;
    }
    
    public ImageIcon setImagenCelda(){
        return imagenCelda;
    }

    public boolean isPlantarSemilla() {
        return plantarSemilla;
    }

    public void setPlantarSemilla(boolean plantarSemilla) {
        this.plantarSemilla = plantarSemilla;
    }

    public boolean isColocarAnimal() {
        return colocarAnimal;
    }

    public void setColocarAnimal(boolean colocarAnimal) {
        this.colocarAnimal = colocarAnimal;
    }

    @Override
    public String toString() {
        return "Grama";
    }

}
