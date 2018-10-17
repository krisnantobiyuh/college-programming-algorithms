/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author K15
 */
public class CheckOddAndEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Input number 1 until 10 for check : ");
        int val = input.nextInt();
        
        if (val<=0 && val>=10) {
            System.out.println("Number Doesn't match");
        }
        
        if (val % 2 == 0) {
            System.out.println("Enter the number "+val);
            System.out.println("The number is even "+val);
        } else {
            System.out.println("Enter the number "+val);
            System.out.println("The number is odd "+val);    
        }
    }
}
