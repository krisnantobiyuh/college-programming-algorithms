/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author K15
 */
public class Lottery{
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10 :");
        int userNum = numberScanner.nextInt();
        Random rnd = new Random();
        int winningNum = rnd.nextInt(11);
        System.out.println("Your number : " + userNum);
        System.out.println("The winning number is : "+ winningNum); 
    }        
}
