/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue1.aignerm;

/**
 *
 * @author Michael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EratosthenesPrimeSieve sieve = new EratosthenesPrimeSieve(20);
        
        sieve.printPrimes();
        
        System.out.println("----------------------------------------------------");
        sieve.printEvenNumbers();
    }
    
}
