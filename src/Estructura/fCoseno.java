/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author Cliente
 */
public class fCoseno extends Tiene1Op implements Operacion{
    
    public fCoseno(){
        this.Op=0;
    }
    
    public double Operar(){
        
        return Math.cos(Op);
    }
}