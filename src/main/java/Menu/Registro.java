package Menu;

import Obojetos.Jugador;
import Obojetos.Carrito;
import static Obojetos.Carrito.colorAmarillo;
import static puntoJAR.Principal.scanner;

public class Registro {

    public void iniciandoRegistro(Jugador jugadorUno) {
        jugadorUno = new Jugador();
        jugadorUno.cambioMenu();
        //Declaramos variables para luego utilizarlas en los ciclos y condiciones del regstro del usuario
        boolean opcionT = false;
        int opcionTerminos = 2;
        //Iniciamos el registro del usuario
        while (!opcionT) {
            System.out.println("Desea aceptar los terminos y condiciones? 1)Si 2)No");
            opcionTerminos = Integer.parseInt(scanner.nextLine());
            if (opcionTerminos == 1) {
                System.out.println("\t\t¿Cual es tu nombre?");
                var nombreJugador = scanner.nextLine();
                System.out.println("Correcto " + nombreJugador + ", ingresa tu nickname");
                jugadorUno.setNicknameJugador(scanner.nextLine());
                System.out.println(jugadorUno.getNicknameJugador() + " ,es un muy buen apodo. ¿Cuantos años tienes?");
                var edadJugador = scanner.nextLine();
                System.out.println("Felicidades " + jugadorUno.getNicknameJugador() + ", haz recibido un bonus de 30 gemas y 50 monedas por comletar el registro");
                jugadorUno.setMonedasJugador((int) (jugadorUno.getMonedasJugador() + 50));
                jugadorUno.setGemasJugador(jugadorUno.getGemasJugador() + 30);
                jugadorUno.cambioMenu();
                boolean opcion = false;
                //Iniciamos la seleccion del auto principal del jugador una vez completado el registro
                while (!opcion) {
                    System.out.println("Debes escojer un carro inicial apra poder jugar\nOpcion 1)Batmovil 2)Delorean 3)Mach5");
                    Carrito carroBatmovil = new Carrito("Batmovil", ":◊:", colorAmarillo, 2, 100, 1);
                    System.out.println(carroBatmovil.datosGarajeAutos());
                    jugadorUno.separador();
                    Carrito carroDelorean = new Carrito("Delorean", ":▤=:", colorAmarillo, 2, 100, 1);
                    System.out.println(carroDelorean.datosGarajeAutos());
                    jugadorUno.separador();
                    Carrito carroMach5 = new Carrito("Mach5", ":►:", colorAmarillo, 2, 100, 1);
                    System.out.println(carroMach5.datosGarajeAutos());
                    jugadorUno.separador();
                    var opcionCarroPredeterminado = scanner.nextInt();
                    //Leemos la opcion del auto y la guardamos en el garaje del jugador
                    switch (opcionCarroPredeterminado) {
                        case 1:
                            jugadorUno.agregarAutos(carroBatmovil);
                            opcion = true;
                            break;
                        case 2:
                            jugadorUno.agregarAutos(carroDelorean);
                            opcion = true;
                            break;
                        case 3:
                            jugadorUno.agregarAutos(carroMach5);
                            opcion = true;
                            break;
                        default:
                            jugadorUno.cambioMenu();
                            System.out.println("Escoje uno de los autos brindados :D");
                    }
                }
                //Llamamos al menu principal para que el jugador comience a disfrutar del juego
                jugadorUno.cambioMenu();
                MenuPrincipal Menu = new MenuPrincipal();
                Menu.menuPrincipal(jugadorUno);
                opcionT = true;
            } else {
                System.out.println("Debes aceptar los terminos y condiciones para jugar :D");
            }
        }

    }
}
