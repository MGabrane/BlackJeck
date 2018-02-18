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
public class Uzdevums14 {
    public static void Uzdevums14(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ievadi skaitli N: ");
        int n = input.nextInt();
     
        if(n < 0){
            System.out.println("Ievadīta neatļauta vērtība");
        }else{
        
        for(int i = n; 1 <= i; i--){
          System.out.print(i + ", ");
          
        }
      }

    }
}
