/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day06;

import java.util.Scanner;

/**
 *
 * @author Madza
 */
public class SwitchClass {
   private static Scanner input = new Scanner(System.in);
    public static void country(){
        System.out.print("Ievadi valsti: ");
        String country = input.next().toLowerCase();
        
        switch(country){
            case "latvija":
                System.out.println("Rīga");
                break;
            case"somija":
                System.out.println("Helsinki");
                break;
            case"austrija":
                System.out.println("Vīne");  
                break;
            case"lietuva":
                System.out.println("Viļņa");  
                break;
            case"francija":
                System.out.println("Parīze");  
                break; 
            default:
                System.out.println("Nezinama galvaspilsēta");
                break;
        }
    }
    
    public static void calculatorLoop(){
        while(true){
            calculator();
            
            System.out.println("Vai turpināt (y/n)?");
            if(Character.toLowerCase(input.next().charAt(0)) == 'n'){
               break;
            }
        }
    }
    
     public static void calculator(){
         
         System.out.println("Ievadiet pirmo skaitli: ");
         int cipars1 = input.nextInt();
         
         System.out.println("Ievadiet otro skaitli: ");
         int cipars2 = input.nextInt();
         
         System.out.println("Ievadiet darbību: ");
         char darbiba = input.next().charAt(0);
         
         double result = 0;
 
         
         boolean isOk = true;
         switch(darbiba){
             
             case '+':
                 result = cipars1 + cipars2;
                
                 break;
             case '-':
                 result = cipars1 - cipars2;
                
                 break;
             case '*':
                 result = cipars1 * cipars2;
                 
                 break;
             case '/':
                 result = cipars1 - cipars2;
                 
                 break;
             default:
                 isOk = false;
                 break;
                 
         }
         
         if(isOk){
             System.out.println("Rezultāts = " + String.format("%.2f", result));
         }else{
             System.out.println("Neatļauta darbība");
         }
         
     }
    
}

