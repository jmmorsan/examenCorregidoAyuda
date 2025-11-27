/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

/**
 *
 * @author Juanma
 */
public class Registro {
    
    private String ciudad;
    private Date fechaVisita;
    private String estacion;
    private double tempMin;
    private double tempMax;
    private double tempProm;

    public Registro(String ciudad, Date fechaVisita, String estacion, double tempMin, double tempMax, double tempProm) {
        this.ciudad = ciudad;
        this.fechaVisita = fechaVisita;
        this.estacion = estacion;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.tempProm = tempProm;
    }

    public Registro(String ciudad, Date fechaVisita, String estacion) {
        this.ciudad = ciudad;
        this.fechaVisita = fechaVisita;
        this.estacion = estacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public String getEstacion() {
        return estacion;
    }

    public double getTempMin() {
        return tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public double getTempProm() {
        return tempProm;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public void setTempProm(double tempProm) {
        this.tempProm = tempProm;
    }
    
    


    
    
}
