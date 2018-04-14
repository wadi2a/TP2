/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author Ouadie
 */
public abstract class   Voiture {
    
    private String numero;
    protected double prix;

    public Voiture(String numero, double prix) {
        this.numero = numero;
        this.prix = prix;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public  abstract double getPrix();

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    public String toString(){
    
    return this.getNumero();
    
    }
    
    
    
    
}