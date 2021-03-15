package puntoJAR;

import Menu.Registro;
import java.util.Scanner;
import Obojetos.Jugador;

public class Principal {

    public static Scanner scanner = new Scanner(System.in);
    public static Jugador jugadorUno;

    public static void main(String[] args) {
        //Llamamos a la clase Registro, para iniciar el juego
        Registro Inicio = new Registro();
        Inicio.iniciandoRegistro(jugadorUno);

    }
}
