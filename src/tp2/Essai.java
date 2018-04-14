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
public class Essai {
        
        public static void main(String[] args) {
          
            
            

            Garage unGarage = new Garage();
                

Neuve v4=new Neuve("3575PO93",16000);
Neuve v5=new Neuve("954545393",20000);
Occasion o1= new Occasion("9874IY94",45000,5000,2);
Occasion o2= new Occasion("6548SD93",25000,7000,5);

Option op1 = new Option(1,"Airbag",800);
Option op2 = new Option(2,"vitre electrique",900);
Option op3 = new Option(3,"Climatisation",1500);
Option op4 = new Option(4,"Toit ouvrant",700);



            
            
  
            unGarage.addVoiture(v4);
            unGarage.addVoiture(v5);
            unGarage.addVoiture(o1);
            unGarage.addVoiture(o2);
   
            unGarage.addOption(op1);
            unGarage.addOption(op2);
            unGarage.addOption(op3);
            unGarage.addOption(op4);
      
            
       
            
            

            
            
         
    }
    
      
        
     
     

}
