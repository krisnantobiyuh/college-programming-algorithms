/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;
import java.util.Scanner;
/**
 *
 * @author K15
 */
public class RealCalculator {
    //field    
    public static void main(String arg[]){
        Scanner keyboard = new Scanner(System.in);
        Calculator calc = new Calculator();
        calc.tip = 0.10;
        
        System.err.println("Tax :" + calc.tax);
        System.err.println("Tip :" + calc.tip);
        System.err.println("Enter the originalPrice : ");
        
        Double originalPrice = keyboard.nextDouble();
        System.err.println("Person : $" + calc.findTotal(originalPrice));
    }
}
