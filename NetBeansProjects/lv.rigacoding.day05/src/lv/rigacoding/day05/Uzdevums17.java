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
public class Uzdevums17 {
    
    public static void Uzdevums17(){
          
         Scanner input = new Scanner(System.in);

        System.out.println("Ievadiet pirmo kārts vērtību");
        int card1 = input.nextInt();
        System.out.println("Ievadiet otras kārts vērtību");
        int card2 = input.nextInt();
        
        if(card1 > 21){
            card1 =0;
        }
        
        if(card2 > 21){
            card2 =0;
        //}else if(card1 == 0 && card2 == 0){
            //System.out.println("0");
        }else if(card1 == card2){
            card1 = 0;
            card2 = 0;
        }
                
        int closer = Math.abs( 21 - card1) < Math.abs(21 - card2) ?
                card1 : card2;
                System.out.println(closer);
        //double closer = Math.abs(c - a) < Math.abs(c - b) ? a : b;
        //System.out.println(closer);

    }      
}
