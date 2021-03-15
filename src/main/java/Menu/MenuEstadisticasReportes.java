package Menu;

import Obojetos.Carrito;
import static Obojetos.Carrito.colorAmarillo;
import static Obojetos.Carrito.colorCyan;
import static Obojetos.Carrito.resetColor;
import Obojetos.Jugador;
import Menu.MenuPistas;
import static Obojetos.Carrito.colorGris;
import static Obojetos.Carrito.colorRojo;
import static puntoJAR.Principal.scanner;

public class MenuEstadisticasReportes {

    private String pistaEscojida;
    private int opcionReporte;

    /**
     * Este metodo despliega el menu de las estadisticas de la ultima partida
     * jugada y reportes generales del inventario del jugador
     *
     * @param jugadorUno
     */
    public void entrarEstadisticasReportes(Jugador jugadorUno) {
        boolean opcion = false;
        int opcionEstRep;
        while (!opcion) {
            System.out.println("Ingrese la opcion que quiere visualizar");
            System.out.println("(1 para ver las estadisticas de la ultima partida)(2 para ver reportes de autos, gemas y monedas)(Ingrese 3 para regresar)");
            opcionEstRep = scanner.nextInt();
            switch (opcionEstRep) {
                case 1:
                    //Llamamos a las estadisticas de la ultima partida jugada
                    jugadorUno.cambioMenu();
                    estadisticasUltimoJuego(jugadorUno);
                    break;
                case 2:
                    jugadorUno.cambioMenu();
                    reportesGeneral(jugadorUno);
                    break;
                case 3:
                    jugadorUno.cambioMenu();
                    opcion = true;
                    break;
                default:

            }
        }

    }

    /**
     * Este metodo despliega los datos de la ultima carrera dependiendo de la
     * pista jugada en la ultima partida
     *
     * @param jugadorUno
     */
    public void estadisticasUltimoJuego(Jugador jugadorUno) {
        MenuPistas imprimirPista = new MenuPistas();
        switch (jugadorUno.getPistaEscojida()) {
            case 1:
                pistaEscojida = "Tierra";
                imprimirPista.dibujarPista(80, colorRojo, colorRojo, " ", " ", " ", " ", " ", " ");
                imprimirDatosCarrera(jugadorUno, pistaEscojida);
                break;
            case 2:
                pistaEscojida = "Arena";
                imprimirPista.dibujarPista(90, colorAmarillo, colorAmarillo, " ", " ", " ", " ", " ", " ");
                imprimirDatosCarrera(jugadorUno, pistaEscojida);
                break;
            case 3:
                pistaEscojida = "Concreto";
                imprimirPista.dibujarPista(100, colorGris, colorGris, " ", " ", " ", " ", " ", " ");
                imprimirDatosCarrera(jugadorUno, pistaEscojida);
                break;
        }
    }

    /**
     * Este metodo imprime los datos de los competidores de la ultima carrera
     *
     * @param jugadorUno
     * @param pistaEscojida
     */
    public void imprimirDatosCarrera(Jugador jugadorUno, String pistaEscojida) {
        System.out.println("Competidores de la ultima carrera en la pista de " + pistaEscojida);
        Carrito tmp = jugadorUno.getCarrosEnPropiedad(jugadorUno.getAutoPrincipal());
        System.out.println("1)" + tmp.getColorCarro() + jugadorUno.getNicknameJugador() + " " + tmp.getDisenoCarro() + resetColor + " Galones usados:" + jugadorUno.getCasillasRecorridas(0));
        //Usamos un contador para imprimir los datos de los rivales generados aleatoriamente
        for (int i = 1; i < jugadorUno.getCompetidoresCarrera(); i++) {
            System.out.println((i + 1) + ")" + jugadorUno.getColoresCompetidores(i) + jugadorUno.getNombreCompetidores(i) + " " + jugadorUno.getCarrosCompetidores(i) + resetColor + " Galones usados:" + jugadorUno.getCasillasRecorridas(i));
        }
    }

    /**
     * Este metodo despliega el menu para los reportes generales del inventario
     * del usuario
     *
     * @param jugadorUno
     */
    public void reportesGeneral(Jugador jugadorUno) {
        System.out.println("Ingrese el numero del auto para ver el reporte de gasolina");
        System.out.println("(Ingrese 6 para ver el reporte de gemas y monedas)(Ingrese 7 para regresar)");
        //Imprimimios el garaje del jugador para que el jugador escoja el auto y despliegue sus reportes de gasolina 
        jugadorUno.imprimirGaraje();
        opcionReporte = scanner.nextInt();
        switch (opcionReporte) {
            case 1:
                jugadorUno.cambioMenu();
                Carrito tmp = jugadorUno.getCarrosEnPropiedad(opcionReporte - 1);
                System.out.println(tmp.datosGarajeAutos());
                System.out.println("Ha gastado un total de " + tmp.getGasolinaUtilizada(opcionReporte - 1) + " galones de gasolina");
                break;
            case 2:
                jugadorUno.cambioMenu();
                Carrito tmp1 = jugadorUno.getCarrosEnPropiedad(opcionReporte - 1);
                System.out.println(tmp1.datosGarajeAutos());
                System.out.println("Ha gastado un total de " + tmp1.getGasolinaUtilizada(opcionReporte - 1) + " galones de gasolina");
                break;
            case 3:
                jugadorUno.cambioMenu();
                Carrito tmp2 = jugadorUno.getCarrosEnPropiedad(opcionReporte - 1);
                System.out.println(tmp2.datosGarajeAutos());
                System.out.println("Ha gastado un total de " + tmp2.getGasolinaUtilizada(opcionReporte - 1) + " galones de gasolina");
                break;
            case 4:
                jugadorUno.cambioMenu();
                Carrito tmp3 = jugadorUno.getCarrosEnPropiedad(opcionReporte - 1);
                System.out.println(tmp3.datosGarajeAutos());
                System.out.println("Ha gastado un total de " + tmp3.getGasolinaUtilizada(opcionReporte - 1) + " galones de gasolina");
                break;
            case 5:
                jugadorUno.cambioMenu();
                Carrito tmp4 = jugadorUno.getCarrosEnPropiedad(opcionReporte - 1);
                System.out.println(tmp4.datosGarajeAutos());
                System.out.println("Ha gastado un total de " + tmp4.getGasolinaUtilizada(opcionReporte - 1) + " galones de gasolina");
                break;
            case 6:
                //Imprime el total de gemas y de monedas gastadas a lo largo del juego por el jugador
                jugadorUno.cambioMenu();
                System.out.println(colorAmarillo + "Total de monedas gastadas ◇ " + jugadorUno.getMonedasGastadas() + resetColor);
                System.out.println(colorCyan + "Total de gemas gastadas ◎ " + jugadorUno.getGemasGastadas() + resetColor);
                break;
            case 7:
                break;
            default:
                jugadorUno.cambioMenu();
                System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");
        }
    }

}
