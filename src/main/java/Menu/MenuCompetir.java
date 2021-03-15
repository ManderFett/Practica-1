package Menu;

import Obojetos.Jugador;
import Obojetos.Carrito;
import static Obojetos.Carrito.colorAmarillo;
import static Obojetos.Carrito.colorAzul;
import static Obojetos.Carrito.colorGris;
import static Obojetos.Carrito.colorMorado;
import static Obojetos.Carrito.colorNegro;
import static Obojetos.Carrito.colorRojo;
import static Obojetos.Carrito.colorVerde;
import static Obojetos.Carrito.resetColor;
import static puntoJAR.Principal.scanner;

public class MenuCompetir {

    private String[] disenoRivalesRandom = new String[6];
    private String[] colorRivalesRandom = new String[6];
    private String[] nombreRivalesRandom = new String[6];
    private String[] carroRivalesRandom = new String[6];
    private int[] contadorCasillasRandom = new int[7];
    private int[] motorRivalesRandom = new int[6];
    private int[] llantasRivalesRandom = new int[6];
    private String[] nicknameRival = {"CotorroLegend", "XMogo", "MaisterDani", "PiongYang", "Rex", "Georgie", "Diegitox", "Waliray", "CarCN", "Caba", "ElMalrod", "Huron", "Mashico"};
    private String[] rivalCarro = {"X-Wing", "Maquina del Misterio", "General Lee", "Halcon Milenario", "Control"};
    private String[] rivalDiseno = {":◀-:", ":▪▪▪:", ":◉-:", ":▬+:", ":▪▻=:", ":=:"};
    private String[] colorRival = {colorAzul, colorRojo, colorVerde, colorMorado, colorAmarillo};
    private int[] llantasRival = {1, 2, 3, 4, 5};
    private int[] potenciaRival = {1, 5, 3, 4, 2};
    private int contadorRivales = 1;
    private int opcionPista;
    private int opcionEntrearCarrera;
    private int numeroDeRivales;
    private int pistaACompetir;
    private int[] contadorCasillasJugador = new int[5];

    /**
     * Este metodo es la interfaz principal del menu competir, donde el jugador
     * tiene la opcion de escojer la pista para jugar.
     *
     * @param jugadorUno
     */
    public void principalCompetir(Jugador jugadorUno) {
        Carrito tmp = jugadorUno.getCarrosEnPropiedad(jugadorUno.getAutoPrincipal());
        System.out.println("Ingrese el No. de pista donde quiere competir \n1)Tierra 2)Arena 3)Concreto (Presiona 4 para regresar)");
        pistaACompetir = scanner.nextInt();
        jugadorUno.setPistaEscojida(pistaACompetir);
        //Generamos los rivales aleatorios antes de inicial el juego
        generarAutosRivales(jugadorUno);
        numeroDeRivales = ((int) (Math.random() * 5 + 1));
        //Revisamos si el auto principal del jugador tiene la gasolina necesaria para competir en la pista escojida
        switch (pistaACompetir) {
            case 1:
                if (tmp.getGasolinaCarro() >= 80) {
                    pistaTierra(jugadorUno);//Llamamos a la pista de tierra para comenzar a competir
                } else {
                    System.out.println("No tienes la suficiente gasolina en tu auto principal, ve a llenar el tanque ");
                }
                break;
            case 2:
                if (tmp.getGasolinaCarro() >= 90) {
                    pistaArena(jugadorUno);//Llamamos a la pista de arena para comenzar a competir
                } else {
                    System.out.println("No tienes la suficiente gasolina en tu auto principal, ve a llenar el tanque ");
                }
                break;
            case 3:
                if (tmp.getGasolinaCarro() == 100) {
                    pistaConcreto(jugadorUno);//Llamamos a la pista de concreto para comenzar a competir
                } else {
                    System.out.println("No tienes la suficiente gasolina en tu auto principal, ve a llenar el tanque ");
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Ingrese un numero valido :D");

        }
    }

    /**
     * Este metodo imprime la pista de Tierra
     *
     * @param jugadorUno
     */
    public void pistaTierra(Jugador jugadorUno) {
        System.out.println("\tPISTA DE TIERRA");
        System.out.println("Ingresa 1 entrar a la carrera y 2 para abandonarla");
        opcionPista = scanner.nextInt();
        while (opcionPista == 1) {
            System.out.println("\t\tPISTA DE TIERRA");
            System.out.println("\tIngresa 1 para avanzar");
            opcionEntrearCarrera = scanner.nextInt();
            switch (opcionEntrearCarrera) {
                case 1:
                    pistaDefault(jugadorUno, 6, colorRojo, colorRojo, 80);
                    break;
                case 2:
                    opcionPista = 2;
                    break;
            }
        }
    }

    /**
     * Este metodo imprime la pista de Arena
     *
     * @param jugadorUno
     */
    public void pistaArena(Jugador jugadorUno) {
        System.out.println("\tPISTA DE ARENA");
        System.out.println("Ingresa 1 entrar a la carrera y 2 para abandonarla");
        opcionPista = scanner.nextInt();
        while (opcionPista == 1) {
            System.out.println("\t\tPISTA DE ARENA");
            System.out.println("\tIngresa 1 para avanzar");
            opcionEntrearCarrera = scanner.nextInt();
            switch (opcionEntrearCarrera) {
                case 1:
                    pistaDefault(jugadorUno, 2, colorAmarillo, colorAmarillo, 90);
                    break;
                case 2:
                    opcionPista = 2;
                    break;
            }
        }
    }

    /**
     * Este metodo imprime la pista de concreto
     *
     * @param jugadorUno
     */
    public void pistaConcreto(Jugador jugadorUno) {
        System.out.println("\t\t\tPISTA DE CONCRETO");
        System.out.println("Ingresa 1 entrar a la carrera y 2 para abandonarla");
        opcionPista = scanner.nextInt();
        while (opcionPista == 1) {
            System.out.println("\t\tPISTA DE CONCRETO");
            System.out.println("\tIngresa 1 para avanzar");
            opcionEntrearCarrera = scanner.nextInt();
            switch (opcionEntrearCarrera) {
                case 1:
                    pistaDefault(jugadorUno, 6, colorGris, colorGris, 100);
                    break;
                case 2:
                    opcionPista = 2;
                    break;
            }
        }
    }

    /**
     * Este es un metodo general donde se imprime una pista como tal, sin
     * importar sus casillas, la capacidad de rivales y de gasolina a utilizar
     * por auto principal del jugador
     *
     * @param jugadorUno
     * @param coefPistaEscojida
     * @param pistaColor
     * @param pistaMitad
     * @param casillasPista
     */
    public void pistaDefault(Jugador jugadorUno, int coefPistaEscojida, String pistaColor, String pistaMitad, int casillasPista) {
        Carrito tmp = jugadorUno.getCarrosEnPropiedad(jugadorUno.getAutoPrincipal());
        //Leemos la opcion del jugador para que siga avanzando con el auto
        if (opcionEntrearCarrera == 1) {
            //Utilizamos contadores para imprimir las casillas y los autos tanto los rivales como el del jugador
            for (int i = 0; i < casillasPista; i++) {
                System.out.print(pistaColor + "-" + resetColor);
            }
            System.out.println();
            avanzarAutoPrincipal(jugadorUno, coefPistaEscojida, casillasPista);//Llamamos al metodo que permite avanzar de manera aleatoria con el auto del jugador
            for (int i = 0; i < numeroDeRivales; i++) {
                avanzarRivales(jugadorUno, coefPistaEscojida, casillasPista, i + 1);//Llamamos al metodo que permite avanzar a los rivales generados de manera aleatoria
            }
            for (int i = 0; i < casillasPista; i++) {
                System.out.print(pistaColor + "-" + resetColor);
            }
            System.out.println();
        }
        //Mostramos en pantalla los competirodes de la carrera indicados con su color de auto
        System.out.print("Competidores: " + tmp.getColorCarro() + jugadorUno.getNicknameJugador() + resetColor + " ");
        for (int i = 0; i < numeroDeRivales; i++) {
            System.out.print(colorRivalesRandom[i + 1] + nombreRivalesRandom[i + 1] + resetColor + " ");
        }
        //Llamamos al metodo que realiza una lectura de casillas avanzadas y nos determina un ganador
        System.out.println();
        condicionGanar(jugadorUno, casillasPista, contadorRivales, coefPistaEscojida);
    }

    /**
     * Este metodo permite avanzar al auto principal del jugador y a la vez nos
     * almacena los datos de las casillas que ha recorrido
     *
     * @param jugadorUno
     * @param coefPistaEscojida
     * @param casillasPista
     */
    public void avanzarAutoPrincipal(Jugador jugadorUno, int coefPistaEscojida, int casillasPista) {
        //Leemos la opcion del jugador para que siga avanzando con el auto
        if (opcionEntrearCarrera == 1) {
            //Declaramos todas las variables que serviran para la formula brindada por los reglamentos del juego
            int randomPotencia = ((int) (Math.random() * 10 + 1));
            int randomLlanta = ((int) (Math.random() * 5 + 1));
            Carrito infoCarro = jugadorUno.getCarrosEnPropiedad(jugadorUno.getAutoPrincipal());
            int potenciaCarroActual = infoCarro.getMotorCarro();
            int llantasCarroActual = infoCarro.getLlantaCoef();
            int formulaAvanzar = (potenciaCarroActual * randomPotencia) + coefPistaEscojida + (llantasCarroActual * randomLlanta);//[POTENCIA_VEHICULO*RANDOM(1-10)]+COEFICIENTE_DE_PISTA+[COEFICIENTE_DE_LLANTAS*RANDOM(1-5)]
            this.contadorCasillasRandom[0] += formulaAvanzar;
            int restoSiGana = contadorCasillasRandom[0] - casillasPista;
            //Utilizamos contadores para imprimir las casillas recorridas por el auto principal del jugador
            if (this.contadorCasillasRandom[0] < casillasPista) {
                for (int i = 0; i < this.contadorCasillasRandom[0]; i++) {
                    System.out.print(colorNegro + "-" + resetColor);
                }
                System.out.println(infoCarro.getColorCarro() + infoCarro.getDisenoCarro() + resetColor);
            }
            if (this.contadorCasillasRandom[0] >= casillasPista) {
                for (int i = 0; i < (this.contadorCasillasRandom[0] - restoSiGana); i++) {
                    System.out.print(colorNegro + "-" + resetColor);
                }
                System.out.println(infoCarro.getColorCarro() + infoCarro.getDisenoCarro() + resetColor);
            }
        }
    }

    /**
     * Este metododo nos genera los autos rivales de manera aleatoria y los
     * almacena en los arreglos previamente definidos
     *
     * @param jugadorUno
     */
    public void generarAutosRivales(Jugador jugadorUno) {
        for (contadorRivales = 1; contadorRivales < 6; contadorRivales++) {
            //Declaramos las variables que nos generan de manera aleatoria los atributos de los rivales
            int randomMotorRival = ((int) (Math.random() * 5));
            int randomLlantasRival = ((int) (Math.random() * 5));
            int randomRival = ((int) (Math.random() * 5));
            int randomColorRival = ((int) (Math.random() * 5));
            int randomNickRival = ((int) (Math.random() * 13));
            colorRivalesRandom[contadorRivales] = colorRival[randomColorRival];
            motorRivalesRandom[contadorRivales] = potenciaRival[randomMotorRival];
            llantasRivalesRandom[(contadorRivales)] = llantasRival[randomLlantasRival];
            carroRivalesRandom[contadorRivales] = rivalCarro[randomRival];
            nombreRivalesRandom[contadorRivales] = nicknameRival[randomNickRival];
            disenoRivalesRandom[contadorRivales] = rivalDiseno[randomRival];
        }
    }

    /**
     * Este metodo realiza el conteo de casillas aleatorias para que avancen los
     * rivales
     *
     * @param jugadorUno
     * @param coefPistaEscojida
     * @param casillasPista
     * @param posicionRival
     */
    public void avanzarRivales(Jugador jugadorUno, int coefPistaEscojida, int casillasPista, int posicionRival) {
        if (opcionEntrearCarrera == 1) {
            //Declaramos las variables que utilizaremos en la formula para que avancen nuestros rivales
            int randomPotencia = ((int) (Math.random() * 10 + 1));
            int randomLlanta = ((int) (Math.random() * 5 + 1));
            int formulaAvanzar = ((motorRivalesRandom[posicionRival]) * randomPotencia) + coefPistaEscojida + ((llantasRivalesRandom[posicionRival] * randomLlanta));//[POTENCIA_VEHICULO*RANDOM(1-10)]+COEFICIENTE_DE_PISTA+[COEFICIENTE_DE_LLANTAS*RANDOM(1-5)]
            this.contadorCasillasRandom[posicionRival] += formulaAvanzar;
            int restoSiGana = this.contadorCasillasRandom[posicionRival] - casillasPista;
            //Utilizamos contadores que imprimiran las casillas que avanzara cada rival
            if (this.contadorCasillasRandom[posicionRival] < casillasPista) {
                for (int i = 0; i < this.contadorCasillasRandom[posicionRival]; i++) {
                    System.out.print(colorNegro + "-" + resetColor);
                }
                System.out.println(this.colorRivalesRandom[posicionRival] + this.disenoRivalesRandom[posicionRival] + resetColor);
            }
            if (this.contadorCasillasRandom[posicionRival] >= casillasPista) {
                for (int i = 0; i < (contadorCasillasRandom[posicionRival] - restoSiGana); i++) {
                    System.out.print(colorNegro + "-" + resetColor);
                }
                System.out.println(this.colorRivalesRandom[posicionRival] + this.disenoRivalesRandom[posicionRival] + resetColor);
            }

        }
    }

    /**
     * Este metodo nos evalua las casillas recorridas por cada competidor y
     * cuando cumple las condiciones se termina la partida
     *
     * @param jugadorUno
     * @param casillasPista
     * @param posicionRival
     * @param coefPistaEscojida
     */
    public void condicionGanar(Jugador jugadorUno, int casillasPista, int posicionRival, int coefPistaEscojida) {
        Carrito tmp = jugadorUno.getCarrosEnPropiedad(jugadorUno.getAutoPrincipal());
        //Utilizamos un contador que evalua los rivales generados y cuando este cumple las condiciones termina el juego
        for (posicionRival = 1; posicionRival < 6; posicionRival++) {
            if (contadorCasillasRandom[posicionRival] >= casillasPista && contadorCasillasRandom[posicionRival] > contadorCasillasRandom[0]) {
                //Imprime Los datos del competidor cuando cumple las condiciones y gana la carrera
                System.out.println("La Carrera ha Finalizado");
                System.out.println("Ganador: " + colorRivalesRandom[posicionRival] + nombreRivalesRandom[posicionRival] + resetColor);
                System.out.println("Automovil: " + colorRivalesRandom[posicionRival] + carroRivalesRandom[posicionRival] + disenoRivalesRandom[posicionRival] + resetColor);
                System.out.println("Ve a las estadisticas y reportes para saber los detalles y el podio de la carrera");
                opcionPista = 2;
                //Almacenamos los datos de la carrera en los arreglos previamente definidos en la calse Jugador
                jugadorUno.setCompetidoresCarrera(numeroDeRivales + 1);
                jugadorUno.setCasillasRecorridas(contadorCasillasRandom);
                jugadorUno.setNombreCompetidores(nombreRivalesRandom);
                jugadorUno.setColoresCompetidores(colorRivalesRandom);
                jugadorUno.setCarrosCompetidores(disenoRivalesRandom);
                recompensaCarrera(jugadorUno, coefPistaEscojida);
                tmp.setGasolinaCarro(tmp.getGasolinaCarro() - contadorCasillasRandom[0]);
                contadorCasillasJugador[jugadorUno.getAutoPrincipal()] = contadorCasillasRandom[0];
                tmp.setGasolinaUtilizada(contadorCasillasJugador);
                break;
            }
        }
        //Utilizamos un contador que evalua las condiciones para que el jugador gane la carrera
        if (contadorCasillasRandom[0] >= casillasPista && contadorCasillasRandom[0] > contadorCasillasRandom[2] && contadorCasillasRandom[0] > contadorCasillasRandom[3] && contadorCasillasRandom[0] > contadorCasillasRandom[4] && contadorCasillasRandom[0] > contadorCasillasRandom[5] && contadorCasillasRandom[0] > contadorCasillasRandom[6]) {
            //Imprime Los datos del jugador cuando cumple las condiciones y gana la carrera
            System.out.println("La Carrera ha Finalizado");
            System.out.println("Ganador: " + tmp.getColorCarro() + jugadorUno.getNicknameJugador() + resetColor);
            System.out.println("Automovil: " + tmp.getColorCarro() + tmp.getNombreCarro() + tmp.getDisenoCarro() + resetColor);
            System.out.println("Ve a las estadisticas y reportes para saber los detalles y el podio de la carrera");
            opcionPista = 2;
            //Almacenamos los datos de la carrera en los arreglos previamente definidos en la calse Jugador
            jugadorUno.setCompetidoresCarrera(numeroDeRivales + 1);
            jugadorUno.setCasillasRecorridas(contadorCasillasRandom);
            recompensaCarrera(jugadorUno, coefPistaEscojida);
            tmp.setGasolinaCarro(tmp.getGasolinaCarro() - casillasPista);
            contadorCasillasJugador[jugadorUno.getAutoPrincipal()] = casillasPista;
            tmp.setGasolinaUtilizada(contadorCasillasJugador);
        }
    }

    /**
     * Este metodo genera las recompensas del jugador al finalizar cada partida
     * dependiendo de los atributos generados previamente para sus rivales
     *
     * @param jugadorUno
     * @param coefPistaEscojida
     */
    public void recompensaCarrera(Jugador jugadorUno, int coefPistaEscojida) {
        //Declaramos las variables que generan los numeros para las recompensas
        int randomPotenciaRival = ((int) (Math.random() * 6));
        int randomGemas = ((int) (Math.random() * 10 + 1));
        int randomMonedas = ((int) (Math.random()) * 10 + 1);
        int recompensaGemas = (motorRivalesRandom[randomPotenciaRival] + randomGemas + coefPistaEscojida);//GEMAS = POTENCIA RIVAL+RANDOM(1-10)+COEFICIENTE DE PISTA)
        int recompensaMonedas = (motorRivalesRandom[randomPotenciaRival] + randomMonedas + coefPistaEscojida);//ORO = POTENCIA DEL RIVAL+RANDOM(1-10)+COEFICIENTE DE PISTA
        jugadorUno.setGemasJugador(jugadorUno.getGemasJugador() + recompensaGemas);//Agregamos las gemas ganadas a las gemas que tiene el jugador en posesion
        jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() + recompensaMonedas);//Agregamos las monedas ganadas a las monedas que tiene el jugador en posesion
        System.out.println("Felicidades, haz ganado: " + recompensaGemas + "◇ gemas y " + recompensaMonedas + "◎ monedas :D");//Imprimimos la recompensa que se le dara al jugador por finalizar con la carrera
    }

}
