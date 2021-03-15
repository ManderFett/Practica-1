package Obojetos;

public class Carrito {

    public static final String resetColor = "\u001B[0m";
    public static final String colorNegro = "\u001B[30m";
    public static final String colorRojo = "\u001B[31m";
    public static final String colorVerde = "\u001B[32m";
    public static final String colorAmarillo = "\u001B[33m";
    public static final String colorAzul = "\u001B[34m";
    public static final String colorMorado = "\u001B[35m";
    public static final String colorCyan = "\u001B[36m";
    public static final String colorGris = "\u001B[37m";
    private String nombreCarro;
    private String disenoCarro;
    private String colorCarro;
    private int motorCarro = 2;
    private int gasolinaCarro;
    private int llantaCoef = 1;
    private int[] gasolinaUtilizada = new int[5];

    public Carrito() {

    }

    public Carrito(String nombreCarro, String disenoCarro, String colorCarro, int motorCarro, int gasolinaCarro, int llantaCoef) {
        this.nombreCarro = nombreCarro;
        this.disenoCarro = disenoCarro;
        this.colorCarro = colorCarro;
        this.motorCarro = motorCarro;
        this.gasolinaCarro = gasolinaCarro;
        this.llantaCoef = llantaCoef;
    }

    public Carrito(int[] gasolinaUtilizada) {
        this.gasolinaUtilizada = gasolinaUtilizada;
    }

    public String datosGarajeAutos() {
        String datosCarro = ("Informacion Carro:\n" + "[Nombre= " + nombreCarro + "]" + "[Diseño=" + colorCarro + disenoCarro + resetColor + "]" + "[Color=" + colorCarro + "■" + resetColor + " ]" + "[Potencia del Motor=" + motorCarro + "]" + "[Gasolina=" + gasolinaCarro + "]" + "[Coeficiente de Llantas=" + llantaCoef + "]");
        return datosCarro;
    } 

    public void upgradeColor(String colorCarro) {
        this.colorCarro = colorCarro;
    }

    public void upgradeLlantas(int llantaCoef) {
        this.llantaCoef = llantaCoef;
    }

    public void upgradeGasolina(int gasolinaCarro) {
        this.gasolinaCarro = gasolinaCarro;
    }

    public void upgradeMotor(int motorCarro) {
        this.motorCarro = motorCarro;
    }

    public String getDisenoCarro() {
        return this.disenoCarro;
    }

    public String getNombreCarro() {
        return nombreCarro;
    }

    public String getColorCarro() {
        return this.colorCarro;
    }

    public int getMotorCarro() {
        return motorCarro;
    }

    public int getGasolinaCarro() {
        return gasolinaCarro;
    }

    public int getLlantaCoef() {
        return llantaCoef;
    }

    public void setNombreCarro(String nombreCarro) {
        this.nombreCarro = nombreCarro;
    }

    public void setDisenoCarro(String disenoCarro) {
        this.disenoCarro = disenoCarro;
    }

    public void setColorCarro(String colorCarro) {
        this.colorCarro = colorCarro;
    }

    public void setMotorCarro(int motorCarro) {
        this.motorCarro = motorCarro;
    }

    public void setGasolinaCarro(int gasolinaCarro) {
        this.gasolinaCarro = gasolinaCarro;
    }

    public void setLlantaCoef(int llantaCoef) {
        this.llantaCoef = llantaCoef;
    }

    public int getGasolinaUtilizada(int gasUtilizada) {
        return gasolinaUtilizada[gasUtilizada];
    }

    public void setGasolinaUtilizada(int[] gasolinaUtilizada) {
        this.gasolinaUtilizada = gasolinaUtilizada;
    }

}
