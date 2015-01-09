/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.LinkedList;

/**
 *
 * @author Ruben
 */
public class LlistaPersones extends LinkedList<Persona> {

    private int comptadorRegistres = 0;

    public LlistaPersones() {
    }
    
    public Persona getPersona(){
       return this.get(comptadorRegistres);
    }
    
    public int getPosicioActual(){
        return this.comptadorRegistres + 1;
    }
    
    public void incRegistre(){
        if(this.comptadorRegistres < this.size()-1){
            this.comptadorRegistres++;
        }
    }
    
    public void decRegistre(){
        if(this.comptadorRegistres > 0){
            this.comptadorRegistres--;
        }
    }

    
    
}
