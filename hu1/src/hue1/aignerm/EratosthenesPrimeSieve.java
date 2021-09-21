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
public class EratosthenesPrimeSieve implements PrimeSieve{
    private final int OBERGRENZE;
    private boolean[] alleZahlen;
    private int[] evenNumbers;
    
    public EratosthenesPrimeSieve(int obergrenze) {
        this.OBERGRENZE = obergrenze;        
    }
    
    private boolean validRange(){
        if(OBERGRENZE > 2){
            return true;
        }else{
            System.out.println("Die Obergrenze muss größer als 2 sein");
            return false;
        }
    }
    
    public void generatePrime(){
            if(validRange()){
                alleZahlen = new boolean[OBERGRENZE];
            
                for (int i = 0; i < alleZahlen.length; i++) {
                    alleZahlen[i] = true;
                }
                
                
                for (int i = 0; i < alleZahlen.length; i++) {
                    alleZahlen[i]=isPrime(i);
                }
                
                
            }        
    }
    
    
    
    @Override
    public boolean isPrime(int p) {
        boolean prime = true;
        if(alleZahlen[p] == true){
         
            for (int i = 2; i < p; i++) {
                if((p%i)== 0){
                    prime = false;
                }
            }
        }else{
            return false;
        }
        return prime;
    }

    @Override
    public void printPrimes() {
        generatePrime();
        
        if(validRange()){
            
            for (int i = 0; i < alleZahlen.length; i++) {
                if(alleZahlen[i]){
                    System.out.println(i);
                }
            }
        }
        
    }
    
    public void printEvenNumbers(){
        if(validRange()){
            generateEvenNumbers();
            boolean foundSum;
            
            for (int i = 0; i < evenNumbers.length; i++) {
                foundSum = false;
                for (int j = 0; j < evenNumbers[i]; j++) {
                    for (int k = 0; k < evenNumbers[i]; k++) {
                        if((j+k) == i && isPrime(k) && isPrime(j)){
                            System.out.println(i + " = " + j + " + " + k);
                            foundSum = true;
                            break;
                        }
                    }
                    if(foundSum){
                        break;
                    }
                }
            }
        }
    }
    
    private void generateEvenNumbers(){
        evenNumbers = new int[OBERGRENZE];
        for (int i = 0; i < alleZahlen.length; i+=2) {
                evenNumbers[i] = i;
        }
    }
    
}
