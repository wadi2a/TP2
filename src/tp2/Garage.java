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


public class Garage {
    
    private ArrayList<Option> listeOption;
    private ArrayList<Voiture> listeVoiture ;

    public Garage(ArrayList<Option> listeOption, ArrayList<Voiture> listeVoiture) {
        this.listeOption = listeOption;
        this.listeVoiture = listeVoiture;
    }

    Garage() {
        
    }

    public ArrayList<Option> getListeOption() {
        return listeOption;
    }

    public void setListeOption(ArrayList<Option> listeOption) {
        this.listeOption = listeOption;
    }

    public ArrayList<Voiture> getListeVoiture() {
        return listeVoiture;
    }

    public void setListeVoiture(ArrayList<Voiture> listeVoiture) {
        this.listeVoiture = listeVoiture;
    }

    public ArrayList<Option> getListOp() {
        return listOp;
    }

    public void setListOp(ArrayList<Option> listOp) {
        this.listOp = listOp;
    }

    public ArrayList<Voiture> getListV() {
        return listV;
    }

    public void setListV(ArrayList<Voiture> listV) {
        this.listV = listV;
    }
    

   
    
    
Neuve v1=new Neuve("123AZE93",10000);
Neuve v2=new Neuve("986RTY93",15000);
Neuve v3=new Neuve("4567UI75",12000);
Neuve v4=new Neuve("3578PO93",16000);
Neuve v5=new Neuve("9546NB93",20000);
Occasion o1= new Occasion("9874IY94",45000,5000,2);
Occasion o2= new Occasion("6548SD93",25000,7000,5);
Occasion o3= new Occasion("1232DF94",35000,6000,4);
Occasion o4= new Occasion("951EIY94",40000,6550,3);
Option op1 = new Option(1,"Airbag",800);
Option op2 = new Option(2,"Fermeture centralisée",900);
Option op3 = new Option(3,"Climatisation",1500);
Option op4 = new Option(4,"Toit ouvrant",700);
Option op5 = new Option(5,"Alarme",1000);


ArrayList<Option> listOp = new ArrayList<>();
ArrayList<Voiture> listV = new ArrayList<>();

 public void addOption(Option opt) {
        
        this.listOp.add(opt);    
    }
    public void addVoiture(Voiture voit) {
        
        this.listV.add(voit);    
    }
    




   
}