/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day05;

import static com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker.check;
import static java.lang.Math.max;
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;
import static sun.nio.ch.IOStatus.check;
import static sun.nio.ch.IOStatus.check;


/**
 *
 * @author Madza
 */
public class Karatavas {
   /* Definējiet masīvu ar vārdiem. Izvēlieties nejaušu vārdu no masīva un 
izvadiet lietotājam burtu skaitu vārdā. Ļaujiet lietotājam ievadīt kādu burtu
un attēlojiet šo burtu atbilstošajās pozīcijās, ja tāds eksistē, vai arī 
samaziniet atlikušo gājienu skaitu, ja dotais burts šajā vārdā neeksistēja. 
Izvadiet atbilstošu paziņojumu, vai vārds tika uzminēts, vai nē.
Piemēram, izvēlēts vārds “AKA”. Sākumā lietotājam izvadiet “_ _ _”.
Pēc pareizas burta ievades attēlojiet “A _ A”, bet pēc nepareizas burta
ievades attēlojiet “Burts S nav šajā vārdā. Jums atlikuši 4 mēģinājumi”.
(!) int random = java.util.concurrent.ThreadLocalRandom.current().nextInt(min, max + 1);
*/
 public static void Karatavas(){ 
     //Izveido masīvu
    String [] wordBank = new String[]{
                "lauks", "krava", "veikals", "darbs", "maize"
        };

        //Dabū random vārdu
        int i = new Random().nextInt(wordBank.length);
       
        //random vārdu pārveido par String
        String randomWord = wordBank[i];
        
        //Izvada burtu skaitu vārdā
        System.out.println(randomWord.length());
        
        //Burtu skaitu uz int uztaisa
        int svitrinuSkaits = randomWord.length();
        
        //Lai izvadītu svītriņas
        for(i = 1; i <= svitrinuSkaits; i++){
            System.out.print("_ ");   
        }
 
        Scanner input = new Scanner(System.in);
        //Paprasīt burtu
        System.out.println("Ievadiet burtu!");
        //ievadītā burta strings
        String letter = input.next();
        
        //Pārbauda vai burts ir vārdā

       
        for (i = 0; i < randomWord.length(); i++) {
            if (randomWord.contains(letter)){
            
  
            for(i = 0; i < randomWord.length(); i++){
                char c1 = letter.charAt(0);
                char c2 = randomWord.charAt(i);
                if(c1 == c2){
                     System.out.print(letter); 
                }else{
            System.out.print("_ "); 
            break;
            }   
            }
        }else{
            for(i = 0; i <= 5; i++){
                int gajienuSkaits = 5 - i;
                System.out.println("Atlikuši " + gajienuSkaits + " gājieni!");
                break;
            }
        }
        } 
            
       
     
 }
    }
 }     
