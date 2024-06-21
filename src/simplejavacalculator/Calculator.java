/**
 * @name        Simple Java Calculator
 * @package     ph.calculator
 * @file        Main.java
 * @author      SORIA Pierre-Henry
 * @email       pierrehs@hotmail.com
 * @link        http://github.com/pH-7
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

import simplejavacalculatorMonoOperations.MonoOperation;
import simplejavacalculatorBiOperations.BiOperation;
import simplejavacalculatorBiOperations.NormalOperation;

public class Calculator {
    private BiOperation biOperation;
    private MonoOperation monoOperation;
    private Double num1, num2 ;
    
    public void setBiOperation(BiOperation biOperation){
        this.biOperation = biOperation;
    }
    
    public void setMonoOperation(MonoOperation monoOperation){
        this.monoOperation = monoOperation;
    }

    public Double calculateBi(Double num1,Double num2) {
        return biOperation.calculate(num1, num2);
    }
    
    public Double calculateMono(Double num){
        return monoOperation.calculate(num);
    }
    
    public Double calculateEqual(Double num) {
        setBiOperation(new NormalOperation());
        return calculateBi(this.num1, num);
    }

    public Double reset() {
        this.num1 = 0.0;
        this.num2 = 0.0;
        setBiOperation(new NormalOperation());
        return Double.NaN;
    }
}