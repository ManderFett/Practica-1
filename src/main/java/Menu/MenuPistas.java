package Menu;

import Obojetos.Jugador;
import static Obojetos.Carrito.colorAmarillo;
import static Obojetos.Carrito.colorGris;
import static Obojetos.Carrito.colorRojo;
import static Obojetos.Carrito.resetColor;
import static puntoJAR.Principal.scanner;

public class MenuPistas {

    /**
     * Este metodo nos imprime las pistas en general dependiendo de la opcion
     * escojida por el jugador
     *
     * @param jugadorUno
     */
    public void entrarPistas(Jugador jugadorUno) {
        boolean salirPistas = false;
        //Iniciamos el ciclo con el menu de pistas
        while (!salirPistas) {
            jugadorUno.datosJugador(jugadorUno);
            System.out.println("Aca puedes visualizar las pistas \n1)Pista de Tierra 2)Pista de Arena 3)Pista de Concreto 4)Regresar al menu principal");
            var opcionPistas = scanner.nextInt();
            jugadorUno.cambioMenu();
            switch (opcionPistas) {
                case 1:
                    //Este caso imprime la pista de tierra
                    dibujarPista(80, colorRojo, colorRojo, "", "", "", "", "", "");
                    brindarDatosPista(80, 4);
                    break;
                case 2:
                    //Este caso imprime la pista de arena
                    dibujarPista(90, colorAmarillo, colorAmarillo, "", "", "", "", "", "");
                    brindarDatosPista(90, 2);
                    break;
                case 3:
                    //Este caso imprime la pista de concreto
                    dibujarPista(100, colorGris, colorGris, "", "", "", "", "", "");
                    brindarDatosPista(100, 6);
                    break;
                case 4:
                    salirPistas = true;
                    break;
            }
        }
    }

    /**
     * Este metodo imprime en general cualquier pista dependiendo de los
     * parametros ingresados
     *
     * @param casillasPista
     * @param pistaColor
     * @param pistaMitad
     * @param espacioCarro1
     * @param espacioCarro2
     * @param espacioCarro3
     * @param espacioCarro4
     * @param espacioCarro5
     * @param espacioCarro6
     */
    public void dibujarPista(int casillasPista, String pistaColor, String pistaMitad, String espacioCarro1, String espacioCarro2, String espacioCarro3, String espacioCarro4, String espacioCarro5, String espacioCarro6) {
        for (int i = 0; i < casillasPista; i++) {
            System.out.print(pistaColor + "-" + resetColor);
        }
        System.out.println();
        System.out.println(espacioCarro1);
        System.out.println(espacioCarro2);
        System.out.println(espacioCarro3);
        for (int i = 0; i < casillasPista; i++) {
            System.out.print(pistaMitad + "=" + resetColor);
        }
        System.out.println();
        System.out.println(espacioCarro4);
        System.out.println(espacioCarro5);
        System.out.println(espacioCarro6);
        for (int i = 0; i < casillasPista; i++) {
            System.out.print(pistaColor + "-" + resetColor);
        }
        System.out.println();
    }

    /**
     * Este metodo imprime los datos de la pista que el jugador escoje para
     * visualizar
     *
     * @param casillasPista
     * @param coeficienteDePista
     */
    public void brindarDatosPista(int casillasPista, int coeficienteDePista) {
        System.out.println("Tamaño de la pista:" + casillasPista + " Coeficiente de la Pista:" + coeficienteDePista + " Gasolina requerida:" + casillasPista + " galones");

    }
}
