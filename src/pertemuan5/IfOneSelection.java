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
public class IfOneSelection {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int bil;
        System.out.print("input number : ");
        bil = input.nextInt();
        if(bil==0){
            System.out.println("nol");
        }else if(bil < 0) {
            System.out.println("negative");
        }else if(bil > 0) {
            System.out.println("positive");
        }
        
        if(bil==0)
            System.out.println("nol");
        else if(bil % 2 == 0) {
            System.out.println("genap");
        }else {
            System.out.println("ganjil");
        }
    }
}
