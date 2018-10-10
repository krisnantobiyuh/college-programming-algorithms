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
public class Calculator {
     //field
 public double tax = 0.05;
 public double tip = 0.15;
 //methods
public double getTip(){
   return tip;
}

public void printTip(){
  System.out.println("Jumlah Tip : "+ tip);
} 


public double findTotal(double originalPrice){
double total = originalPrice * (1+ tax+tip)/100;
   return total;
}

public static void main(String[] arg){
 Calculator calc = new Calculator();
 System.out.println("Person 1 : $"+calc.findTotal(10));
 System.out.println("Person 2 : $"+calc.findTotal(12));
 System.out.println("Person 3 : $"+calc.findTotal(9));
 System.out.println("Person 4 : $"+calc.findTotal(8));
 System.out.println("Person 5 : $"+calc.findTotal(7));
 System.out.println("Person 6 : $"+calc.findTotal(15));
 System.out.println("Person 7 : $"+calc.findTotal(11));
 System.out.println("Person 8 : $"+calc.findTotal(30));
} 
}
