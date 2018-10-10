/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.lang.Double;
/**
 *
 * @author K15
 */
public class Coversi4 {
    public static void main(String[] arg){ 
        int intVar1 = Integer.parseInt("100");

        double doubleVar2;
        doubleVar2 = Double.parseDouble("2.33");
        
        
        int ageYears = 20;
        long ageSeconds = ageYears *365 * 24L * 60 * 60;
    
        int ageDays = Integer.parseInt("32");
    
    System.out.println("You are " + ageDays + " days old.");
    System.out.println("You are " + ageSeconds + " secods old.");
    } 

}
