/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day01;

/**
 *
 * @author Madza
 */
public class Adresi {
    public String valsts;
    
    public String pilseta;
    
    public String iela;
    
    public String majasNr;
    
    public String dzivoklaNr; 
    
    public String PilnaAdrese(){
        String fullAdress = "";
        
        if(valsts != null && valsts != ""){
            fullAdress += valsts + ", ";
            //tas pats kas- fullAdress = fullAdress + valsts + ", ";
        }
        
        if(pilseta != null && pilseta != ""){
            fullAdress += pilseta + ", "; 
        }
        
        //"Latvija, Rîga"
        if(fullAdress.length() > 0){
            fullAdress = fullAdress.substring(0, fullAdress.length() -2);
    }
        
        return valsts + " " + pilseta + " " + iela + " " + majasNr + " " + dzivoklaNr + " ";
    }
    
    //if (String valsts.length() == 0){
    //    public String iela = "";
    //}
    
    //if (String valsts.isEmpty()){
        
    //}
    
    //if (String iela.equals(null)){
    //public String iela = "";  
    //}
    
    //if (String valsts.isEmpty()){
        
    //}
}
