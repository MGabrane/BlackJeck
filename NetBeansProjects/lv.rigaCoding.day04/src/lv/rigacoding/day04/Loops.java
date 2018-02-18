/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day04;

import java.util.Scanner;

/**
 *
 * @author Madza
 */
public class Loops {
    
    
    public static void countToN(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ievadi skaitli N: ");
        int n = input.nextInt();
        int total = 0;
        
        
        //i++
        //i = i + 1
        for(int i = 1; i <= n; i++){
          System.out.println(i);
          
          total = total + i;
          //total += i;
        }
        
        System.out.println("Skaitļu summa ir = " + total);
    }
    
    public static void countN(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ievadi skaitli N: ");
        int n = input.nextInt();
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            System.out.print("Ievadi " + i + ". skaitls ");
            int skaitls = input.nextInt();
            sum = sum + skaitls;   
        }
        double avarage = (double)sum / n;
        System.out.println("Skaitļu summa = " + sum);
        System.out.println("Vidējā vērtība = " + avarage);
        //Lai attēlotu tikai 2 skaitļus aiz komat:
        System.out.println("Vidējā vērtība = "
                + String.format("%.2f", avarage));
        
    }
    
    public static void make_wall(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli N: ");
         int n = input.nextInt();
        
        for(int rinda = 1; rinda <= n; rinda++){
            //vai i = 0; 1 < n; i++
            for (int kolona = 0; kolona <= n; kolona++){
                System.out.print("#");
            }
            
            System.out.println(); 
        }
        
        //ar while
        int rinda = 0;
        while(rinda < n){
            int kolona = 0;
            
            while(kolona <n){
            System.out.print("#");
            kolona++;
        }
            System.out.println("#");
            rinda++;
        }
                
    }
    
    public static void maketriangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli N: ");
        int n = input.nextInt();
        
        for(int rinda = 1; rinda <= n; rinda++){
            //vai i = 0; 1 < n; i++
            for (int kolona = 1; kolona <= rinda; kolona++){
                System.out.print(kolona);
            }
            
            System.out.println(); 
        }
    }
    
    public static void upsideDown(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli N: ");
        int n = input.nextInt();
        
        int atlikums = n % 10;
        int veselaDala = n / 10;
        System.out.print(atlikums);
        
        while(veselaDala > 0){
            atlikums = veselaDala % 10;
            System.out.print(atlikums);
            veselaDala = veselaDala / 10;
            
        }
       
   } 
    public static void Piramida(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli N: ");
        int n = input.nextInt();
        
        for(int rinda = 1; rinda <= n; rinda++){
          
            for(int space = 1; space <= 2 * rinda - 1; space++){
                System.out.print(" ");
            
            
            for(int star = 1; star <= rinda; star++){
                System.out.print("*");
            }
            }
            
            
            
         
           System.out.println(); 
   
        }
         for(int rinda = 1; rinda <= n; rinda++){
          
            for(int space = 1; space <= rinda; space++){
                System.out.print(" ");
            }
            
            for(int star = n; star >= rinda; star--){
                System.out.print("*");
            }
            
            for(int star2 = n; star2 >=rinda; star2--){
                System.out.print("*");
            }
            
          //int space = n - 1;
          //int star = n - space;
           System.out.println(); 
   
        }
    }
    
}

