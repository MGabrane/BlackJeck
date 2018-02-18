/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Madza
 */
public class ArrayClass {
   // private void add(String text1) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    public void test(){
        
        int[] firstArray = new int[3];
            firstArray[0] = 1;
            firstArray[1] = 3;
            firstArray[2] = 5;
                
        //aizpilda ar ciklu
        for(int i = 0; i < 3; i++){
            firstArray[i] = 5;
        }
        
        //aizpildot ar while ciklu
        int i = 0;
        while(true){
            firstArray[i] = 5;
            i++;
            if(i >= 3){
                break;
            }
        }
    
        int[] secondArray = new int[]{
                1,3,5
        };
            
        //Izvada katra masīva elementu
        for(int element : firstArray){
                System.out.println(element);
        }
        

            
        //Izvada katra masīva elementu
        for(int j = 0; i < secondArray.length; i++){
                int element2 = secondArray[i];
                System.out.println(element2);
            }
        
    }
    
    public void listTest(){
        ArrayList<Integer> firstList = new ArrayList<Integer>();
        
        ArrayList<String> textList = new ArrayList<String>();
        
        textList.add("text1");
        textList.add("text1");
        
        textList.remove(1); //text2
         
        String element = textList.get(0); //text1
        
        ArrayList<String> textList2 = new ArrayList<String>(){{
            add("text1");
            add("text2");
            add("text3");
                    
        }};
    }

    
    private static Scanner input = new Scanner(System.in);
    
    public static void FindNumber(){

        int[] Nnumbers = new int[]{
           0, 10, 20, 30, 40, 50
    };
            System.out.println("Ievadīt N skaitli: ");
            int n = input.nextInt();
            
           // boolean isFound = false;
            for(int element: Nnumbers){
                if(n == element){
                    System.out.println("Skaitls atrasts!");
                   // isFound = true;
                   //tad nevajag return
                   //un lejā ar if norada ja false, tad izvada to un to;
                    return;
                }
            }
            System.out.println("Skaitls nav atrasts");
            
    }
    
     public static void uzdevusm26(){
         
         System.out.println("Ievadi N skaitli: ");
         int n = input.nextInt();
         
         int Array1[] = new int [n];
         
          for(int i = 0; i < n; i++){
            System.out.println("Ievadi vērtību: ");
              Array1[i] = input.nextInt();
        }
          
          int min = Array1[0];
          int max = Array1[0];
          
          for(int number : Array1){
              if(number > max){
                  max = number;
              }
              if(number < min){
                  min = number;
              }  
            }
        System.out.println("min = " + min);    
        System.out.println("max = " + max);  
     }
    
}
