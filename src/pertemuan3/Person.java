/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author K15
 */
public class Person {
    public static void main(String[] arg){
        int ageYears = 32;
        int ageDays = ageYears * 365;
        long ageSeconds = ageYears *365 * 24L * 60 * 60;
        System.out.println("You are " + ageDays + " days old.");
        System.out.println("You are " + ageSeconds + " secods old.");
   } 

}
