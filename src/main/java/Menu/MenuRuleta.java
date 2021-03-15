package Menu;

import static puntoJAR.Principal.scanner;
import Obojetos.Jugador;

public class MenuRuleta {

    /**
     * Este metodo nos ejecuta la ruleta donde el jugador puede obtener
     * diferentes recompensas en base a ciertas probabilidades
     *
     * @param jugadorUno
     */
    public void tiroRuleta(Jugador jugadorUno) {
        boolean salirRuleta = false;
        //Iniciamos el ciclo para que el jugador entre al menu de la ruleta
        while (!salirRuleta) {
            jugadorUno.datosJugador(jugadorUno);
            System.out.println("Bienvenido a la ruleta Costo del tiro [5 gemas] \n1)Tirar la ruleta 2)Regresar al menu principal");
            var opcionRuleta = scanner.nextInt();
            jugadorUno.cambioMenu();
            //Leemos la opcion del jugador para entrar a la ruleta
            switch (opcionRuleta) {
                case 1:
                    //Le damos la recompensa al jugador en base a la probabilidad generada
                    if (jugadorUno.getGemasJugador() >= 5) {
                        jugadorUno.setGemasJugador(jugadorUno.getGemasJugador() - 5);
                        jugadorUno.setGemasGastadas(jugadorUno.getGemasGastadas() + 5);
                        double probabilidadRuleta = (double) (Math.random());
                        if (probabilidadRuleta <= 0.05) {
                            //Si el numero generado esta entre 0 y 0.5, el jugador obtiene 1000 gemas
                            jugadorUno.setGemasJugador(jugadorUno.getGemasJugador() + 1000);
                            System.out.println("Felicidades has ganado 1000 gemas \nGemas actuales: " + jugadorUno.getGemasJugador());
                        } else if ((probabilidadRuleta > 0.05) && (probabilidadRuleta <= 0.10)) {
                            //Si el numero generado esta entre 0.5 y 0.10, el jugador obtiene 2000 monedas
                            jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() + 2000);
                            System.out.println("Felicidades has ganado 2000 monedas \nMonedas actuales: " + jugadorUno.getMonedasJugador());
                        } else if ((probabilidadRuleta > 0.10) && (probabilidadRuleta <= 0.25)) {
                            //Si el numero generado esta entre 0.10 y 0.25, el jugador obtiene 75 monedas 
                            jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() + 75);
                            System.out.println("Felicidades has ganado 75 monedas \nMonedas actuales: " + jugadorUno.getMonedasJugador());
                        } else if ((probabilidadRuleta > 0.25) && (probabilidadRuleta <= 0.35)) {
                            //Si el numero generado esta entre 0.25 y 0.35, el jugador obtiene 40 gemas
                            jugadorUno.setGemasJugador(jugadorUno.getGemasJugador() + 40);
                            System.out.println("Felicidades has ganado 40 gemas \nGemas actuales: " + jugadorUno.getGemasJugador());
                        } else if ((probabilidadRuleta > 0.35) && (probabilidadRuleta <= 0.65)) {
                            //Si el numero generado esta entre 0.35 y 0.65, el jugador obtiene 5 gemas
                            jugadorUno.setGemasJugador(jugadorUno.getGemasJugador() + 5);
                            System.out.println("Felicidades has ganado 5 gemas \nGemas actuales: " + jugadorUno.getGemasJugador());
                        } else if ((probabilidadRuleta > 0.65) && (probabilidadRuleta <= 1)) {
                            //Si el numero generado esta entre 0.65 y 1.0, el jugador obtiene 10 monedas
                            jugadorUno.setMonedasJugador(jugadorUno.getMonedasJugador() + 10);
                            System.out.println("Felicidades has ganado 10 monedas \nMonedas actuales: " + jugadorUno.getMonedasJugador());
                        }
                    } else {
                        System.out.println("No tienes gemas suficientes para girar la ruleta");
                    }
                    break;
                case 2:
                    salirRuleta = true;
                    break;
            }
        }
    }
}
