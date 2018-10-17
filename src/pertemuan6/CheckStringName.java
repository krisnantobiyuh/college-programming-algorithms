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
public class CheckStringName {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input your name : ");
        name = input.next();
        System.out.println("Enter your name : "+name);
        
        if (name.equals("Moe")) {
            System.out.println("You are the king of rock and roll");
        } else {
            System.out.println("You are not king");
        }
    }
}
