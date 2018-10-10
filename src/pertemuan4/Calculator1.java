/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author K15
 */
public class Calculator1 {
     //field
 public double tax = 0.05;
 public double tip = 0.15;
 //methods
    public double getTip(){
       return tip;
    }
    public double findTotal(double originalPrice){
       double total = originalPrice * (1+ tax+tip);
       return total;
    }
    public static void main(String[] arg){
     Calculator calc = new Calculator();
     calc.tip = 0.10;
     System.out.println("Jumlah Tip (%): "+ (calc.getTip() * 100));
    } 
}
