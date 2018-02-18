/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.veikals;

import java.util.Scanner;

/**
 *
 * @author Madza
 */
public class Shop {
     public static void Shop(){
         String[] items = new String[8];
            items[0] = "DATORS";
            items[1] = "BIKSES";
            items[2] = "AUTO";
            items[3] = "MOBĪLAIS";
            items[4] = "TV";
            items[5] = "KOFERIS";
            items[6] = "CIMDI";
            items[7] = "CEPURE";
            
         int[] prices = new int[8];   
            prices[0] = 900;
            prices[1] = 50;
            prices[2] = 10000;
            prices[3] = 200;
            prices[4] = 550;
            prices[5] = 100;
            prices[6] = 20;
            prices[7] = 10;
            
            int i = 0;
            
            for(int j = 0; i < items.length; i++){
                String element1 = items[i];
                int element2 = prices[i];
                System.out.println(element1 + " - " + element2 + "$");
            }
            
            Scanner input = new Scanner(System.in);
            System.out.println("Ievadiet vēlamās preces-");
            String itemIwant = input.next();
            
             for(int j = 0; i < items.length; i++){
                 String element1 = items[i];
                 int element2 = prices[i];
            if(itemIwant.equalsIgnoreCase(element1)){
                System.out.println(element1 + " - " + element2 + "$");
                
            }
               
        }        
        }    
     
     
         private double price;
         
         private String name;
         
         public ShopItem(String name, double price){
             this.price = price;
             this.name = name;
         }
         public double
     }
     
   

