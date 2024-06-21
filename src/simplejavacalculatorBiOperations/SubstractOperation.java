/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplejavacalculatorBiOperations;

/**
 *
 * @author Santiago
 */
public class SubstractOperation implements BiOperation {

    @Override
    public Double calculate(Double num1, Double num2) {
        return num1 - num2;
    }
    
}
