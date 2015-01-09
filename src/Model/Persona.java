/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ruben
 */
public class Persona {

    private String dni;
    private String nom;
    private String primerCognom;
    private String segonCognom;
    private int edat;

    public Persona(String dni, String nom, String primerCognom, String segonCognom, int edat) {
        this.dni = dni;
        this.nom = nom;
        this.primerCognom = primerCognom;
        this.segonCognom = segonCognom;
        this.edat = edat;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrimerCognom() {
        return primerCognom;
    }

    public void setPrimerCognom(String primerCognom) {
        this.primerCognom = primerCognom;
    }

    public String getSegonCognom() {
        return segonCognom;
    }

    public void setSegonCognom(String segonCognom) {
        this.segonCognom = segonCognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return dni + ";" + nom + ";" + primerCognom + ";" + segonCognom + ";" + edat;
    }

}
