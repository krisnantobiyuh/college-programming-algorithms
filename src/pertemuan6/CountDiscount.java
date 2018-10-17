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
public class CountDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0; String result;
        float disc, pay;
        
        System.out.print("Input number : ");
        value = input.nextInt();
        
        if (value>=50000) {
            disc = value * 20/100;
            pay = value - disc;
            result = "Discount 20% \nTotal Disc = " + disc + "\nBayar = " + pay;
        } else if (value<50000 && value>=25000) {
            disc = value * 10/100;
            pay = value - disc;
            result = "Discount 10% \nTotal Disc = " + disc + "\nBayar = " + pay;
        }else if (value <25000 && value >= 10000) {
            disc = value * 5/100;
            pay = value - disc;
            result = "Discount 5%Total Disc = " +disc + "\nBayar = " + pay;
        }else if (value <10000 && value>0) {
            disc = value * 2/100;
            pay = value - disc;
            result = "Discount 2%Total Disc = " + disc + "\nBayar = " + pay;
        }else {
            result = "Discount 0%";
        }
        
        System.out.println(result);
    }
}
