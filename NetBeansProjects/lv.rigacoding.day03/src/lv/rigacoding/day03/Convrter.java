/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day03;

import java.util.Scanner;

/**
 *
 * @author Madza
 */
public class Convrter {
    
    
    public Convrter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lūdzu ievadi grādus");
        //Nolasam skaitli
        int degree = input.nextInt();
       System.out.println("Lūdzu ievadiet mērvienību");
        //Nolasam mērvienību
        char unit = input.next().charAt(0);
       
        if(unit == 'C'){
        //C=(F-32)x5/9
        //F=(Cx9/5)+32
        int resultF = degree * 9 / 5 + 32;
        System.out.println(resultF + " F");
        
        }else if(unit == 'c'){
        int resultF = degree * 9 / 5 + 32;
        System.out.println(resultF + " F");
        
        }else if(unit == 'F'){
        
        int resultC = (degree - 32) * 5 / 9;
        System.out.println(resultC + " C");
        
        }else if(unit == 'f'){
         int resultC = (degree - 32) * 5 / 9;
         System.out.println(resultC + " C");
        }
        
    
        //     izsauc toFahrenheit(...)
        
        //Ja 'mervienība' == 'F'
        //       izsauc toCelsius(...)
        // ...
        //...
        /*
        +pārbaudīt, vai strādā gan mazie, gan lielie burti
        +veikt pārbaudi vai ievadīta pieļaujamā mērvienība
        
        */
    }
   // private int toFahrenheit(int value){
      //pārvērš value uz farenheitiem
      //atgriež aprēķinato vērtību
    //}
    //private int toCelsius(int value){
      //pārvērš value uz celsiju
      //atgriež aprēķinato vērtību
    //}
}
