/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author K15
 */
public class CountBMI {
    public static void main(String[] args) {
        double weight, height;
        Scanner input = new Scanner(System.in);
        System.err.print("Enter your Weight : ");
        weight = input.nextDouble();
        System.err.print("Enter your Height : ");
        height = input.nextDouble();
        
        double calculateBMI = weight / Math.pow(height, 2) *70;
        
        System.err.println("Your body mass index is : " + calculateBMI);
    }
}
