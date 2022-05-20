/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.burgermenu;

/**
 *
 * @author Jose Angel
 */
public class Menu {
    private double preciofinal;
    private final double iva = getPreciofinal() * 0.21;

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    public double getIva() {
        return iva;
    }
    
    
}
