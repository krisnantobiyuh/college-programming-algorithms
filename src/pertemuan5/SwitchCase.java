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
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        System.out.println("1. naik kereta");
        System.out.println("2. naik pesawat");
        System.out.println("3. naik bus");
        System.out.print("Enter bil : ");
        pil = input.nextInt();
        switch(pil){
            case 1: System.out.println("naik kereta");break;
            case 2: System.out.println("naik pesawat");break;
            case 3: System.out.println("naik bus");break;
            default:System.out.println("pribadi$");break;
        }
    }
}
