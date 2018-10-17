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
public class ShowAlfabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0; char alfabet;
        
        System.out.print("Input number : ");
        
        value = input.nextInt();
        
        if (value>=80 && value<= 100) {
            alfabet = 'A';
        } else if (value>=60 && value<=79) {
            alfabet = 'B';
        }else if (value >=40 && value <= 59) {
            alfabet = 'C';
        }else if (value >=20 && value <= 39) {
            alfabet = 'D';
        }else if (value >=0 && value <= 19) {
            alfabet = 'E';
        }else {
            alfabet = 'f';
        }
        
        System.err.println(alfabet);
    }
}
