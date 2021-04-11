/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jugador;

/**
 * 
 * @author Marco Munguia <@markomannder>
 */
public class Granjero {
    
    private int vidaJugador;
    private int dineroJugador;
    private String nombreJugador;
    private String nicknameJugador;

    public Granjero(int vidaJugador, int dineroJugador, String nombreJugador, String nicknameJugador) {
        this.vidaJugador = vidaJugador;
        this.dineroJugador = dineroJugador;
        this.nombreJugador = nombreJugador;
        this.nicknameJugador = nicknameJugador;
    }

    public int getVidaJugador() {
        return vidaJugador;
    }

    public void setVidaJugador(int vidaJugador) {
        this.vidaJugador = vidaJugador;
    }

    public int getDineroJugador() {
        return dineroJugador;
    }

    public void setDineroJugador(int dineroJugador) {
        this.dineroJugador = dineroJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getNicknameJugador() {
        return nicknameJugador;
    }

    public void setNicknameJugador(String nicknameJugador) {
        this.nicknameJugador = nicknameJugador;
    }
    
    

}
