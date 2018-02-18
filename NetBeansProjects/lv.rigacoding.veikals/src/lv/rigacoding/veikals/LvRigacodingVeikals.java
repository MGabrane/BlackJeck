/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.veikals;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Madza
 */
public class LvRigacodingVeikals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        private ArrayList<ShopItem> items;
        
        public Shop(){
            items = new ArrayList();
            items.add(new ShopItem("Dators", 900));
            items.add(new ShopItem("Bikses", 50));
            items.add(new ShopItem("Auto", 10000));
            items.add(new ShopItem("Mobilais", 200));
            items.add(new ShopItem("Tv", 550));
            items.add(new ShopItem("Koferis", 100));
            items.add(new ShopItem("Cimdi", 20));
            items.add(new ShopItem("Cepure", 10));
            
            
             System.out.println("Pieejamās preces: ");
             for(ShopItem item : items){
                System.out.println(item.getName() + " = " + item.getPrice() + "$");
             }
             
             //Paprasīt ievadīt preci
            Scanner input = new Scanner(System.in);
             int sum = 0;
             String text = "";

             do
             {
                  System.out.println("Ievadi vēlamo preci");
                  text = input.next();
                  
                 for(ShopItem item : items){
                     if(item.getName().equalsIgnoreCase(text)){
                         sum += item.getPrice;
                         break;
                     }
                 }
             }
              //2.2 ja ievade == "0", tad pārtrauc apstrādi un izvada summu
             while(!text.equals("0"));
             
             System.out.println("Kopsumma = " + sum + "$");
        }
        
    }
    
}
