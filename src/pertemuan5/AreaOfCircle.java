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
public class AreaOfCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius : ");
            double radius = sc.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.println("The area of circle is :" + area);
        } 

    }
}
