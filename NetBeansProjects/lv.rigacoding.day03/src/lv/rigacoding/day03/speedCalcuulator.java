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
public class speedCalcuulator {
   
     public speedCalcuulator {
    
     Scanner input = new Scanner(System.in);
        //Datu nolasīšana
        
        System.out.print("Lūdzu ievadiet attālumu: ");
        int distance = input.nextInt();
        System.out.print("Lūdzu ievadiet laiku: ");       
        int haurs = input.nextInt();
        int minutes = input.nextInt();
        int seconds = input.nextInt();
        
        //Datu apstrāde
        //kopējais laiks
        int totalTime = getTotalTime(haurs, minutes, seconds);
        //2. ātrums
        getSpeed(distance, totalTime);
        // ...
        
}
    public int getTotalTime( int haurs, int minutes, int seconds){
        //apstrāde
        int total = seconds
                + minutes * 60
                + haurs * 60 *60; 
        //izvade
        System.out.println("Kopējais laiks = "
                + total
                + "sekundes");
        return total;
    }
    public void getSpeed (int distance, int totalTime){
        double speed = (double)distance / (double)totalTime;
        System.out.println("Ātrums (m/s) = " + speed);
        
        double speedKmh = ((double)distance/1000
                /(double)totalTime/3600);
        
        System.out.println("Ātrums (km/h) = " + speedKmh);
    }
   
}
