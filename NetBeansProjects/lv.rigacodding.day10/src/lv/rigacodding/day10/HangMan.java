/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacodding.day10;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Madza
 */
public class HangMan {
    
    private ArrayList<String>dictionary;
    
    private String word;
    private String guessWord;
    private String guessedWord;
    
    public HangMan(){
        dictionary = new ArrayList();
        dictionary.add("SUNS");
        dictionary.add("VILKS");
        dictionary.add("LAPSA");
        dictionary.add("ZILONIS");
        dictionary.add("KAMIELIS");
        dictionary.add("PELE");
    }
    public void startNewGame(){
       Collections.shuffle(dictionary);
       
       word = dictionary.get(0);
       
       guessedWord = "";
       for(int i = 0; i < word.length(); i++){
           guessedWord += "_";
           
       }
    }
   
    public boolean hasGuessed(){
        //return !guessedWord.contains("_");
        
        return word.equals(guessedWord);
    }
    
    public boolean guess(char letter){
        int position = word.indexOf(letter);
        
        if(position == -1){
            return false;
            
        }
        
        while(position > -1){
       String newGuessWord = "";
       newGuessWord = guessedWord.substring(0, position) + letter;
       if(position < guessedWord.length()){
           newGuessWord += guessedWord.substring(position + 1);
           
       }
       
       guessedWord = newGuessWord;
       
       position = word.indexOf(letter, position + 1);
        }  
       return true;
    }
    
    public String getGuessedWord(){
        return guessedWord;
    } 
}
