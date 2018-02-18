/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day05;

import java.util.Scanner;

/**
 *
 * @author Madza
 */
public class Uzdevums16 {
     public static void Uzdevums16(){
          
         Scanner input = new Scanner(System.in);
        
        System.out.println("Ievadiet braukšanas ātrumu");
        int atrums = input.nextInt();
        System.out.println("Ir dzimšanas diena - 1; Nav dzimšanas diens - 2");
        int bDay = input.nextInt();
        
        if(atrums <= 60 && bDay == 2){
         System.out.println("0");
        }else if(atrums <= 65 && bDay == 1){
        System.out.println("0");
        } 
        
        if(atrums <= 80 && bDay == 2){
         System.out.println("1");
        }else if(atrums <= 80 && bDay == 1){
        System.out.println("1");
        } 
        
        if(atrums > 80 && bDay == 2){
         System.out.println("2");
        }else if(atrums > 80 && bDay == 1){
        System.out.println("2");
        } 
     
    } 
}
