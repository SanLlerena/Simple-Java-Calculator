/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplejavacalculatorMonoOperations;

/**
 *
 * @author Santiago
 */
public class TanOperation implements MonoOperation{
        
    @Override
    public Double calculate(Double num){
        if (num == 0 || num % 180 == 0) {
            return 0.0;
        }
        if (num % 90 == 0.0 && num % 180 != 0.0) {
            return Double.NaN;
        }
        return Math.tan(Math.toRadians(num));
    }
    
}
