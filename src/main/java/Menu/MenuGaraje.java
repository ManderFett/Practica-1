package Menu;

import Obojetos.Jugador;
import Obojetos.Carrito;
import static Obojetos.Carrito.resetColor;
import static Obojetos.Carrito.colorAmarillo;
import static Obojetos.Carrito.colorAzul;
import static Obojetos.Carrito.colorRojo;
import static Obojetos.Carrito.colorVerde;
import static puntoJAR.Principal.scanner;

public class MenuGaraje {

    private int opcionGaraje;

    public MenuGaraje() {

    }

    /**
     * Este metodo imprime el garaje del jugador y las opciones varias dentro
     * del garaje
     *
     * @param jugadorUno
     */
    public void entrarGaraje(Jugador jugadorUno) {
        boolean salirGaraje = false;
        //Iniciamos el garaje y sus diferences opciones
        while (!salirGaraje) {
            jugadorUno.datosJugador(jugadorUno);
            System.out.println("Seleccione el numero de auto a modificar o la opcion del menu");
            System.out.println("(Ingrese 6 para ver el catalogo) (Ingrese 7 para seleccionar el auto principal) (Ingrese 8 para regresar al menu)");
            jugadorUno.imprimirGaraje();
            opcionGaraje = scanner.nextInt();
            switch (opcionGaraje) {
                case 1:
                    //Llamamos a la modificacion del primer auto del garaje del jugador
                    jugadorUno.cambioMenu();
                    modificarGaraje(jugadorUno);
                    break;
                case 2:
                    //Llamamos a la modificacion del segundo auto del garaje del jugador
                    jugadorUno.cambioMenu();
                    modificarGaraje(jugadorUno);
                    break;
                case 3:
                    //Llamamos a la modificacion del tercer auto del garaje del jugador
                    jugadorUno.cambioMenu();
                    modificarGaraje(jugadorUno);
                    break;
                case 4:
                    //Llamamos a la modificacion del cuarto auto del garaje del jugador
                    jugadorUno.cambioMenu();
                    modificarGaraje(jugadorUno);
                    break;
                case 5:
                    //Llamamos a la modificacion del quinto auto del garaje del jugador
                    jugadorUno.cambioMenu();
                    modificarGaraje(jugadorUno);
                    break;
                case 6:
                    //Llamamos al catalogo de autos para comprar
                    jugadorUno.cambioMenu();
                    catalogoCarros(jugadorUno);
                    break;
                case 7:
                    //Llamamos a la opcion de colocar un auto principal a eleccion
                    jugadorUno.cambioMenu();
                    autoPrincipal(jugadorUno);
                    break;
                case 8:
                    //Regresamos al menu principal
                    jugadorUno.cambioMenu();
                    salirGaraje = true;
                    break;
                default:
                    jugadorUno.cambioMenu();
                    System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");
            }

        }
    }

    /**
     * Con este metodo podemos colocar un auto a eleccion como principal para
     * competir
     *
     * @param jugadorUno
     */
    public void autoPrincipal(Jugador jugadorUno) {
        jugadorUno.datosJugador(jugadorUno);
        System.out.println("Seleccione el numero de auto a poner como predeterminado (Ingrese 6. para regresar)");
        jugadorUno.imprimirGaraje();
        opcionGaraje = scanner.nextInt();
        switch (opcionGaraje) {
            case 1:
                jugadorUno.cambioMenu();
                Carrito tmp = jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1);
                jugadorUno.setAutoPrincipal(opcionGaraje - 1);
                System.out.println("Su nuevo auto principal es:\n");
                System.out.println(tmp.datosGarajeAutos());
                break;
            case 2:
                jugadorUno.cambioMenu();
                Carrito tmp2 = jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1);
                jugadorUno.setAutoPrincipal(opcionGaraje - 1);
                System.out.println("Su nuevo auto principal es:\n");
                System.out.println(tmp2.datosGarajeAutos());
                break;
            case 3:
                jugadorUno.cambioMenu();
                Carrito tmp3 = jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1);
                jugadorUno.setAutoPrincipal(opcionGaraje - 1);
                System.out.println("Su nuevo auto principal es:\n");
                System.out.println(tmp3.datosGarajeAutos());
                break;
            case 4:
                jugadorUno.cambioMenu();
                Carrito tmp4 = jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1);
                jugadorUno.setAutoPrincipal(opcionGaraje - 1);
                System.out.println("Su nuevo auto principal es:\n");
                System.out.println(tmp4.datosGarajeAutos());
                break;
            case 5:
                jugadorUno.cambioMenu();
                Carrito tmp5 = jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1);
                jugadorUno.setAutoPrincipal(opcionGaraje - 1);
                System.out.println("Su nuevo auto principal es:\n");
                System.out.println(tmp5.datosGarajeAutos());
                break;
            case 6:
                break;
            default:
                jugadorUno.cambioMenu();
                System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");
        }
    }

    /**
     * Con este metodo llamamos a una una opcion de modificar el auto escojido
     * por el jugador
     *
     * @param jugadorUno
     */
    public void modificarGaraje(Jugador jugadorUno) {
        boolean salirModificarGaraje = false;
        Carrito tmp = jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1);
        while (!salirModificarGaraje) {
            System.out.println(tmp.datosGarajeAutos());
            jugadorUno.datosJugador(jugadorUno);
            System.out.println("Ingrese la opcion para modificar su automovil (Presiona 5. para regresa al Garaje)");
            System.out.println("1)Mejorar el motor\n2)Llenar el tanque\n3)Mejorar neumaticos\n4)Cambiar color");
            var opcionGarajeMod = scanner.nextInt();
            jugadorUno.cambioMenu();
            switch (opcionGarajeMod) {
                case 1:
                    //Llamamos al metodo que permite mejorar la potencia del automovil
                    potenciaCarro(jugadorUno);
                    break;
                case 2:
                    //Llamamos al metodo que permite llenar el tanque del automovil
                    tanqueCarro(jugadorUno);
                    break;
                case 3:
                    //Llamamos al metodo que permite mejorar las llantas del automovil
                    llantasCarro(jugadorUno);
                    break;
                case 4:
                    //Llamamos al metodo que permite cambiar el color del automovil
                    colorCarro(jugadorUno);
                    break;
                case 5:
                    salirModificarGaraje = true;
                    break;
                default:
                    jugadorUno.cambioMenu();
                    System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");
            }
        }
    }

    /**
     * Este metodo reemplaza el color del para el uto previamente escojido
     *
     * @param jugadorUno
     */
    public void colorCarro(Jugador jugadorUno) {
        System.out.println(jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).datosGarajeAutos());
        jugadorUno.datosJugador(jugadorUno);
        System.out.println("Ingrese el color para su auto [costo oro] (Presione 4. para Regresar)");
        System.out.println("1)[20]" + colorAzul + "Azul" + resetColor + "\n2)[20]" + colorRojo + "Rojo" + resetColor + "\n3)[20]" + colorVerde + "Verde" + resetColor);
        var opcionColores = scanner.nextInt();
        jugadorUno.cambioMenu();
        switch (opcionColores) {
            case 1:
                if (jugadorUno.getMonedasJugador() >= 20) {
                    jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).setColorCarro(colorAzul);
                    jugadorUno.setMonedasJugador((int) (jugadorUno.getMonedasJugador() - 20));
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 20));
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes Monedas");
                }
                break;
            case 2:
                if (jugadorUno.getMonedasJugador() >= 20) {
                    jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).setColorCarro(colorRojo);
                    jugadorUno.setMonedasJugador((int) (jugadorUno.getMonedasJugador() - 20));
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 20));
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes Monedas");
                }
                break;
            case 3:
                if (jugadorUno.getMonedasJugador() >= 20) {
                    jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).setColorCarro(colorVerde);
                    jugadorUno.setMonedasJugador((int) (jugadorUno.getMonedasJugador() - 20));
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 20));
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes Monedas");
                }
                break;
            case 4:
                break;
            default:
                jugadorUno.cambioMenu();
                System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");

        }
    }

    /**
     * Este metodo permite mejorar las llantas para el auto previamente escojido
     *
     * @param jugadorUno
     */
    public void llantasCarro(Jugador jugadorUno) {
        Carrito tmp = jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1);
        System.out.println(tmp.datosGarajeAutos());
        jugadorUno.datosJugador(jugadorUno);
        System.out.println("Ingrese los neumaticos que desea adquirir [costo oro] (Presione 4. para Regresar)");
        System.out.println("1)Calidad Baja/Coeficiente 2/[25]\n2)Calidad Media/Coeficiente 3/[50]\n3)Calidad Alta/Coeficiente 5/[75]");
        var opcionLlantas = scanner.nextInt();
        jugadorUno.cambioMenu();
        switch (opcionLlantas) {
            case 1:
                if (jugadorUno.getMonedasJugador() >= 25) {
                    jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).setLlantaCoef(2);
                    jugadorUno.setMonedasJugador((int) (jugadorUno.getMonedasJugador() - 25));
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 25));
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes Monedas");
                }
                break;
            case 2:
                if (jugadorUno.getMonedasJugador() >= 50) {
                    jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).setLlantaCoef(3);
                    jugadorUno.setMonedasJugador((int) (jugadorUno.getMonedasJugador() - 50));
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 50));
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes Monedas");
                }
                break;
            case 3:
                if (jugadorUno.getMonedasJugador() >= 75) {
                    jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).setLlantaCoef(5);
                    jugadorUno.setMonedasJugador((int) (jugadorUno.getMonedasJugador() - 75));
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 75));
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes Monedas");
                }
                break;
            case 4:
                break;
            default:
                jugadorUno.cambioMenu();
                System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");

        }
    }

    /**
     * Este metodo permite agreagar gasolina al auto elegido por el jugador
     *
     * @param jugadorUno
     */
    public void tanqueCarro(Jugador jugadorUno) {
        boolean opcionSalir = false;
        //Iniciamos el menu de llenado de tanque
        while (!opcionSalir) {
            Carrito tmp = jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1);
            //Creamos las variables que almacenaran los datos para una opcion de llenar completamente el tanque
            int gasolinaFull = (100 - tmp.getGasolinaCarro());
            double costoFullGas = (gasolinaFull * 2.5);
            System.out.println(tmp.datosGarajeAutos());
            jugadorUno.datosJugador(jugadorUno);
            System.out.println("Ingrese la opcion para comprar gasolina [precio oro]");
            System.out.println("1)Comprar un galon de gasolina [2.5] 2)Llenar el tanque completo [" + costoFullGas + "](Presiona 3 para regresar)");
            var opcionTanque = scanner.nextInt();
            jugadorUno.cambioMenu();
            switch (opcionTanque) {
                case 1:
                    //Opcion de agregar un solo galon del tanque de gasolina
                    if (jugadorUno.getMonedasJugador() >= 2.5) {
                        if (tmp.getGasolinaCarro() < 100) {
                            tmp.setGasolinaCarro(tmp.getGasolinaCarro() + 1);
                            jugadorUno.setMonedasJugador((double) jugadorUno.getMonedasJugador() - (2.5));
                            jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + (2.5)));
                        } else {
                            jugadorUno.cambioMenu();
                            System.out.println("Ya tienes 100 galones de gasolina (Puedes competir en cualquier pista ;)");
                        }
                    } else {
                        jugadorUno.cambioMenu();
                        System.out.println("No tienes las suficientes Monedas");
                    }
                    break;
                case 2:
                    //Opcion de agregar los galones restantes para competir en cualquier pista
                    if (tmp.getGasolinaCarro() < 100 && jugadorUno.getMonedasJugador() >= costoFullGas) {
                        tmp.setGasolinaCarro(tmp.getGasolinaCarro() + gasolinaFull);
                        jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() - (gasolinaFull * 2.5));
                        jugadorUno.setMonedasGastadas(jugadorUno.getMonedasGastadas() + (gasolinaFull * 2.5));
                    } else if (tmp.getGasolinaCarro() < 100 && jugadorUno.getMonedasJugador() < costoFullGas) {
                        jugadorUno.cambioMenu();
                        System.out.println("No tienes las suficientes monedas para fullear tu tanque");
                    } else if (tmp.getGasolinaCarro() == 100) {
                        jugadorUno.cambioMenu();
                        System.out.println("Ya puedes competir en cualquier pista :D");
                    }
                    break;
                case 3:
                    opcionSalir = true;
                    break;
                default:
                    jugadorUno.cambioMenu();
                    System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");
            }
        }
    }

    /**
     * Este metodo nos permite mejorar la potencia del motor del auto
     * previamente escojido por el jugador
     *
     * @param jugadorUno
     */
    public void potenciaCarro(Jugador jugadorUno) {
        Carrito tmp = jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1);
        System.out.println(tmp.datosGarajeAutos());
        jugadorUno.datosJugador(jugadorUno);
        System.out.println("Ingrese el motor que desea adquirir [costo gemas] (Presione 4. para Regresar)");
        System.out.println("1)Motor Basico/Potencia 4/[5]\n2)Motor Medio/Potencia 5/[20]\n3)Motos de Alto Rendimiento/Potencia 7/[35]");
        var opcionNeumaticos = scanner.nextInt();
        jugadorUno.cambioMenu();
        switch (opcionNeumaticos) {
            case 1:
                if (jugadorUno.getGemasJugador() >= 5) {
                    jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).upgradeMotor(4);
                    jugadorUno.setGemasJugador(jugadorUno.getGemasJugador() - 5);
                    jugadorUno.setGemasGastadas(jugadorUno.getGemasGastadas() + 5);
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes Gemas");
                }
                break;
            case 2:
                if (jugadorUno.getGemasJugador() >= 10) {
                    jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).upgradeMotor(5);
                    jugadorUno.setGemasJugador(jugadorUno.getGemasJugador() - 20);
                    jugadorUno.setGemasGastadas(jugadorUno.getGemasGastadas() + 20);
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes Gemas");
                }
                break;
            case 3:
                if (jugadorUno.getGemasJugador() >= 35) {
                    jugadorUno.getCarrosEnPropiedad(opcionGaraje - 1).upgradeMotor(7);
                    jugadorUno.setGemasJugador(jugadorUno.getGemasJugador() - 35);
                    jugadorUno.setGemasGastadas(jugadorUno.getGemasGastadas() + 35);
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes Gemas");
                }
                break;
            case 4:
                break;
            default:
                jugadorUno.cambioMenu();
                System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");

        }
    }

    /**
     * Este metodo despliega el catalogo de autos predefinidos para que el
     * usuario pueda agregarlos a su garaje personal
     *
     * @param jugadorUno
     */
    public void catalogoCarros(Jugador jugadorUno) {
        jugadorUno.datosJugador(jugadorUno);
        System.out.println("Ingrese el auto a agregar a su garaje [precio oro] (Presione 7. para regresar)");
        System.out.println("1)Batmovil[200]. 2)Delorean[200]. 3)Mach5[200]. 4)RayoMcQueen[250]. 5)Herbie[300]. 6)Cadillac Casafantasmas[350].");
        Carrito carroBatmovil = new Carrito("Batmovil", ":◊:", colorAmarillo, 2, 100, 1);
        System.out.println(carroBatmovil.datosGarajeAutos());
        jugadorUno.separador();
        Carrito carroDelorean = new Carrito("Delorean", ":▤=:", colorAmarillo, 2, 100, 1);
        System.out.println(carroDelorean.datosGarajeAutos());
        jugadorUno.separador();
        Carrito carroMach5 = new Carrito("Mach5", ":►:", colorAmarillo, 2, 100, 1);
        System.out.println(carroMach5.datosGarajeAutos());
        jugadorUno.separador();
        Carrito carroMcQueen = new Carrito("Rayo McQueen", ":◄-:", colorAmarillo, 2, 100, 1);
        System.out.println(carroMcQueen.datosGarajeAutos());
        jugadorUno.separador();
        Carrito carroHerbieVolkswagen = new Carrito("Herbie Volkswagen", ":◇:", colorAmarillo, 2, 100, 1);
        System.out.println(carroHerbieVolkswagen.datosGarajeAutos());
        jugadorUno.separador();
        Carrito carroGhostbustersCadillac = new Carrito("Ghostbusters Cadillac", ":◈+:", colorAmarillo, 2, 100, 1);
        System.out.println(carroGhostbustersCadillac.datosGarajeAutos());
        jugadorUno.separador();
        var opcionCompraCarro = scanner.nextInt();
        switch (opcionCompraCarro) {
            case 1:
                if (jugadorUno.getMonedasJugador() >= 200) {
                    jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() - 200);
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 200));
                    jugadorUno.agregarAutos(carroBatmovil);
                    jugadorUno.cambioMenu();
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes monedas para comprar el auto");
                }
                break;
            case 2:
                if (jugadorUno.getMonedasJugador() >= 200) {
                    jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() - 200);
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 200));
                    jugadorUno.agregarAutos(carroDelorean);
                    jugadorUno.cambioMenu();
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes monedas para comprar el auto");
                }
                break;
            case 3:
                if (jugadorUno.getMonedasJugador() >= 200) {
                    jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() - 200);
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 200));
                    jugadorUno.agregarAutos(carroMach5);
                    jugadorUno.cambioMenu();
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes monedas para comprar el auto");
                }
                break;
            case 4:
                if (jugadorUno.getMonedasJugador() >= 250) {
                    jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() - 250);
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 250));
                    jugadorUno.agregarAutos(carroMcQueen);
                    jugadorUno.cambioMenu();
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes monedas para comprar el auto");
                }
                break;
            case 5:
                if (jugadorUno.getMonedasJugador() >= 300) {
                    jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() - 300);
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 300));
                    jugadorUno.agregarAutos(carroHerbieVolkswagen);
                    jugadorUno.cambioMenu();
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes monedas para comprar el auto");
                }
                break;
            case 6:
                if (jugadorUno.getMonedasJugador() >= 350) {
                    jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() - 350);
                    jugadorUno.setMonedasGastadas((int) (jugadorUno.getMonedasGastadas() + 350));
                    jugadorUno.agregarAutos(carroGhostbustersCadillac);
                    jugadorUno.cambioMenu();
                } else {
                    jugadorUno.cambioMenu();
                    System.out.println("No tienes las suficientes monedas para comprar el auto");
                }
                break;
            case 7:
                jugadorUno.cambioMenu();
                break;
            default:
                jugadorUno.cambioMenu();
                System.out.println("Porfavor ingrese un numero correspondiente a las opciones dadas");
        }
    }

}
