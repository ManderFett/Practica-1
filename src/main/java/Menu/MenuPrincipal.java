package Menu;

import static Obojetos.Carrito.colorAmarillo;
import static Obojetos.Carrito.colorVerde;
import static Obojetos.Carrito.resetColor;
import static puntoJAR.Principal.scanner;
import Obojetos.Jugador;

public class MenuPrincipal {

    public void menuPrincipal(Jugador jugadorUno) {
        int opcionMenu;
        boolean salir = false;
        //Iniciamos el menu principal del juego
        while (!salir) {
            jugadorUno.datosJugador(jugadorUno);
            System.out.println("Ingresa el numero que se indica en cada opcion(Presiona 6. para salir del juego)");
            System.out.println("1)Competir \n2)Ruleta \n3)Pistas \n4)Estadisticas y Reportes \n5)Garaje");
            opcionMenu = scanner.nextInt();
            //Leemos la opcion que escoje el jugador e invocamos a las clases
            switch (opcionMenu) {
                case 1:
                    //Llamamos a la clase MenuCompetir que permite al jugador jugar
                    jugadorUno.cambioMenu();
                    MenuCompetir menuC = new MenuCompetir();
                    menuC.principalCompetir(jugadorUno);
                    break;
                case 2:
                    //Llamamos a la clase MenuRuleta que permite al jugador ganar gemas y monedas
                    jugadorUno.cambioMenu();
                    MenuRuleta menuR = new MenuRuleta();
                    menuR.tiroRuleta(jugadorUno);
                    break;
                case 3:
                    //Llamamos a la calse MenuPistas que permite al jugador visualizar las pistas del juego
                    jugadorUno.cambioMenu();
                    MenuPistas menuP = new MenuPistas();
                    menuP.entrarPistas(jugadorUno);
                    break;
                case 4:
                    //Llamamos a la clase MenuEstadisticasReportes que permite al jugador visualizar reportes generales y estadisticas de sus autos
                    jugadorUno.cambioMenu();
                    MenuEstadisticasReportes menuER = new MenuEstadisticasReportes();
                    menuER.entrarEstadisticasReportes(jugadorUno);
                    break;
                case 5:
                    //Llamamos a la clase MenuGaraje que permite al jugador visualizar y personalizar sus autos
                    jugadorUno.cambioMenu();
                    MenuGaraje menuG = new MenuGaraje();
                    menuG.entrarGaraje(jugadorUno);
                    break;
                case 6:
                    //Despide al jugador cuando decide finalizar el juego
                    jugadorUno.cambioMenu();
                    System.out.println(colorAmarillo + "Hasta la proxima!, gracias por jugar y que la fuerza de acompañe " + resetColor + colorVerde + jugadorUno.getNicknameJugador() + resetColor);
                    salir = true;
                    break;
                default:
                    System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");
            }
        }
    }
}
