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
import java.util.ArrayList;

 


public class Neuve extends Voiture {
    
    private ArrayList <Option> mesOptions = new ArrayList<Option>() ;

    public Neuve(String numero, double prix) {
        super(numero, prix);
    }

    public ArrayList<Option> getMesOptions() {
        return mesOptions;
    }

    public void setMesOptions(ArrayList<Option> mesOptions) {
        this.mesOptions = mesOptions;
    }

    @Override
    public double getPrix() {
        
        for(Option option : this.getMesOptions())
        {
            prix=super.prix +option.getPrix();
        }
        return prix;
    }
    
    public void addOption(Option opt){
    this.mesOptions.add(opt);
    
    }

    @Override
    public void setPrix(double prix) {
        this.prix = prix;
    }
    
     public String toString(){
        
        return "l'immatriculation :"+this.getNumero()  + "\t les options :" + this.getMesOptions()+"\t le prix avec option : "+this.getPrix()+"\n";
}

    
    
    

    
    
}
