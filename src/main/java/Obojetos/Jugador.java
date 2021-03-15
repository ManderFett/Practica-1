package Obojetos;

import static Obojetos.Carrito.colorAmarillo;
import static Obojetos.Carrito.colorAzul;
import static Obojetos.Carrito.colorCyan;
import static Obojetos.Carrito.colorMorado;
import static Obojetos.Carrito.colorRojo;
import static Obojetos.Carrito.colorVerde;
import static Obojetos.Carrito.resetColor;

public class Jugador {

    private String nicknameJugador;
    private double monedasJugador = 0;
    private int gemasJugador = 0;
    private Carrito[] carrosEnPropiedad = new Carrito[5];
    private int contadorGaraje;
    private int autoPrincipal;
    private int gemasGastadas;
    private int pistaEscojida;
    private double monedasGastadas;
    private int competidoresCarrera;
    private String[] nombreCompetidores = new String[competidoresCarrera];
    private String[] carrosCompetidores = new String[competidoresCarrera];
    private String[] coloresCompetidores = new String[competidoresCarrera];
    private int[] casillasRecorridas = new int[competidoresCarrera];

    public Jugador() {
    }

    public Jugador(String nicknameJugador, int monedasJugador, int gemasJugador, int contadorGaraje) {
        this.nicknameJugador = nicknameJugador;
        this.gemasJugador = gemasJugador;
        this.monedasJugador = monedasJugador;
        this.contadorGaraje = 0;
    }

    public void datosJugador(Jugador jugadorUno) {
        Carrito tmp = jugadorUno.getCarrosEnPropiedad(jugadorUno.getAutoPrincipal());
        System.out.println(" ");
        System.out.println(colorAzul + "--------------------" + resetColor + colorMorado + "CAR RPG" + resetColor + colorAzul + "------------------" + resetColor + tmp.getColorCarro() + tmp.getDisenoCarro() + resetColor);
        System.out.println(colorVerde + "Jugador:" + nicknameJugador + resetColor + colorAmarillo + " Monedas:◎ " + monedasJugador + resetColor + colorCyan + " Gemas:◇ " + gemasJugador + resetColor);
    }

    public void agregarAutos(Carrito guardarCarrito) {
        if (this.contadorGaraje < 5) {
            this.carrosEnPropiedad[this.contadorGaraje] = guardarCarrito;
            this.contadorGaraje++;
        } else {
            System.out.println("Ya alcansaste el maximo de carros");
        }
    }

    public void imprimirGaraje() {
        for (int i = 0; i < contadorGaraje; i++) {
            System.out.println((i + 1) + ")." + carrosEnPropiedad[i].datosGarajeAutos());
            separador();
        }
        System.out.println("Tienes " + (5 - contadorGaraje) + " espacios disponibles en tu garaje");
    }

    public int getAutoPrincipal() {
        return autoPrincipal;
    }

    public void setAutoPrincipal(int autoPrincipal) {
        this.autoPrincipal = autoPrincipal;
    }

    public Carrito getCarrosEnPropiedad(int posicionCarro) {
        return carrosEnPropiedad[posicionCarro];
    }

    public void setCarrosEnPropiedad(Carrito[] carrosEnPropiedad) {
        this.carrosEnPropiedad = carrosEnPropiedad;
    }

    public String getNicknameJugador() {
        return nicknameJugador;
    }

    public double getMonedasJugador() {
        return monedasJugador;
    }

    public int getGemasJugador() {
        return gemasJugador;
    }

    public void setNicknameJugador(String nicknameJugador) {
        this.nicknameJugador = nicknameJugador;
    }

    public void setMonedasJugador(double monedasJugador) {
        this.monedasJugador = monedasJugador;
    }

    public void setGemasJugador(int gemasJugador) {
        this.gemasJugador = gemasJugador;
    }

    public int getGemasGastadas() {
        return gemasGastadas;
    }

    public double getMonedasGastadas() {
        return monedasGastadas;
    }

    public int getCasillasRecorridas(int casillasCompetidor) {
        return casillasRecorridas[casillasCompetidor];
    }

    public void setGemasGastadas(int gemasGastadas) {
        this.gemasGastadas = gemasGastadas;
    }

    public void setMonedasGastadas(double monedasGastadas) {
        this.monedasGastadas = monedasGastadas;
    }

    public void setCasillasRecorridas(int[] casillasRecorridas) {
        this.casillasRecorridas = casillasRecorridas;
    }

    public int getCompetidoresCarrera() {
        return competidoresCarrera;
    }

    public void setCompetidoresCarrera(int nombreCompetidores) {
        this.competidoresCarrera = nombreCompetidores;
    }

    public String getNombreCompetidores(int nombreCompetidor) {
        return nombreCompetidores[nombreCompetidor];
    }

    public void setNombreCompetidores(String[] nombreCompetidor) {
        this.nombreCompetidores = nombreCompetidor;
    }

    public String getCarrosCompetidores(int carroCompetidor) {
        return carrosCompetidores[carroCompetidor];
    }

    public String getColoresCompetidores(int colorCompetidor) {
        return coloresCompetidores[colorCompetidor];
    }

    public void setCarrosCompetidores(String[] carrosCompetidores) {
        this.carrosCompetidores = carrosCompetidores;
    }

    public void setColoresCompetidores(String[] coloresCompetidores) {
        this.coloresCompetidores = coloresCompetidores;
    }

    public int getPistaEscojida() {
        return pistaEscojida;
    }

    public void setPistaEscojida(int pistaEscojida) {
        this.pistaEscojida = pistaEscojida;
    }

    public void cambioMenu() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }

    public void separador() {
        System.out.println("\t\t\t");
    }
    /*public Carrito[] getCarrosEnPropiedad() {
        return carrosEnPropiedad;
    }

    public void setCarrosEnPropiedad(Carrito[] carrosEnPropiedad) {
        this.carrosEnPropiedad = carrosEnPropiedad;
    }*/
}
