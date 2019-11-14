/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author LENOVO
 */
public class AeroPlan extends Vehicle {

    @Override
    public void walk() {
        System.out.println("Aeroplan is Flying");
    }
    public void fuel(){
        System.out.println("Bensin");
    }
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
        
    }
    
    
}
