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
public class uzdevums20 {
    /*Dota sākuma vērtība A un beigu vērtība B. Izvadiet visus naturālos
skaitļus no A līdz B, bet skaitļus, kas dalās ar 3 aizvietojiet ar “Fizz”,
skaitļus, kas dalās ar 5 – aizvietojiet ar “Buzz” un skaitļus, kas dalās gan 
ar 3, gan ar 5 – ar “FizzBuzz”.
(!) x % 5 atgriež dalījuma ar 5 atlikumu. 
     Ja “x % 5 == 0”, tad skaitlis dalās ar 5.

fizzBuzz(1, 5) → "1,2,Fizz,4,Buzz
fizzBuzz(1, 7) → "1,2,Fizz,4,Buzz,Fizz,7" */
    
     public static void Uzdevums20(){
          Scanner input = new Scanner(System.in);

        System.out.println("Ievadi skaitli A");
        int numberA = input.nextInt();
        System.out.println("Ievadi skaitli B");
        int numberB = input.nextInt();
        
       
       for(int i = numberA; numberB >= i; i++){
         
       if(i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
           
        }else if(i % 3 == 0){
            System.out.println("Fizz");
            
        }else if(i % 5 == 0){
            System.out.println("Buzz"); 
                    
        }else{
            System.out.println(i);
        }
           
     }
        
     }

}
