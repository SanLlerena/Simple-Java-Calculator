/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplejavacalculatorMonoOperations;

/**
 *
 * @author Santiago
 */
public class SquareRootOperation implements MonoOperation{
    
    @Override
    public Double calculate(Double num){
        return Math.sqrt(num);
    }
    
}
