/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day02;

/**
 *
 * @author Madza
 */
public class LvRigacodingDay02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.variants
        Automasina auto1 = new Automasina();
        //2.variants
        transportlidzeklis auto2 = new Automasina();
        //3.variants- nelegals
        //transportlidzeklis auto3 = new transportlidzeklis();
        
        transportlidzeklis lidmasina = new Lidmasina();
        transportlidzeklis vilciens = new Vilciens();
        
        izvaditInformaciju(auto1);
        izvaditInformaciju(lidmasina);
        vilciens.Parvietoties();
     
    }
    
    private static void izvaditInformaciju(transportlidzeklis transports){
        transports.Parvietoties();
    }
    
}
