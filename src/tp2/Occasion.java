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
 
public class Occasion extends Voiture  {

    private int nbKms;
    private int age;

    public Occasion(String numero,int nbKms,int prix, int age ) {
        super(numero, prix);
        this.nbKms = nbKms;
        this.age = age;
    }

    public int getNbKms() {
        return nbKms;
    }

    public void setNbKms(int nbKms) {
        this.nbKms = nbKms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getPrix() {
        
        
        if(nbKms>getAge()*40000){return prix-((nbKms-(getAge()*40000))*0.05);}
        else {return prix+(((getAge()*40000-nbKms))*0.05);}
        
        
    }
    
    public String toString(){
        
        return super.toString()+"\t Nb de km: " + this.getNbKms() + "\t anciennete:" + this.getAge() + "\t Prix de vente:" + this.getPrix()+"\n";
}

    

    
}
