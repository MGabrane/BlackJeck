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
public class Uzdevums21 {
    
/*Dota vērtība N. Izvadiet skaitļus pēc parauga “1, 1, 2, 1, 2, 3, …, 1, 2, 3, …, N”.

skaitluSerija(3) → “1, 1, 2, 1, 2, 3“
skaitluSerija(4) → “1, 1, 2, 1, 2, 3, 1, 2, 3, 4“
skaitluSerija(2) → “1, 1, 2“*/
    
    
     public static void Uzdevums21(){
          Scanner input = new Scanner(System.in);

        System.out.println("Ievadi skaitli N");
        int numberN = input.nextInt();
        
        for(int i = 1 ; i <= numberN; i++){
            for (int m = 1; m <= i; m++){
            System.out.print(m + ", ");
            }
            }

    }    
}
