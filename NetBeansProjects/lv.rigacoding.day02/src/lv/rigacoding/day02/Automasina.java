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
public class Automasina implements transportlidzeklis {
    
    private int maxAtrums;

    public int getMaxAtrums() {
        return maxAtrums;
    }

    public void setMaxAtrums(int maxAtrums) {
        this.maxAtrums = maxAtrums;
    }
    

    @Override
    public void Parvietoties() {
        System.out.println("Automašīna brauc");
    }
    
}
