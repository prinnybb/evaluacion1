/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion1;

/**
 *
 * @author sebol
 */
public class InterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, int years) {
        return principal * (rate / 100) * years;
    }
}

