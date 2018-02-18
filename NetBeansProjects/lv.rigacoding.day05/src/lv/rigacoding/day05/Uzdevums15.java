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
public class Uzdevums15 {
     public static void Uzdevums15(){
          Scanner input = new Scanner(System.in);
        
        System.out.println("Ievadi nedēļas dienu");
        String diena = input.next();
        System.out.println("Atvaļinājums- 1; Nav atvaļinajuma-2");
        int atvalinajums = input.nextInt();
        
        if(diena.equals("P") ||diena.equals("O") ||diena.equals("T")
                ||diena.equals("C") ||diena.equals("Pk") && atvalinajums == 2){
              System.out.println("Modinātājs skanēs pulksten 7:00");
        }else if(diena.equals("P") ||diena.equals("O") ||diena.equals("T")
                ||diena.equals("C") ||diena.equals("Pk") && atvalinajums == 1){
            System.out.println("Modinātājs skanēs pulksten 10:00");
        }
         if(diena.equals("S") ||diena.equals("Sv") && atvalinajums == 2){
              System.out.println("Modinātājs skanēs pulksten 10:00");
        }else if(diena.equals("S") ||diena.equals("Sv") && atvalinajums == 1){
            System.out.println("Modinātājs off");
        }
        
     }
     
}
