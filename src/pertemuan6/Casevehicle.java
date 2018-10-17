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
public class Casevehicle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        System.out.println("1. naik kereta");
        System.out.println("2. naik pesawat");
        System.out.println("3. naik bus");
        System.out.println("4. naik Kendaraan pribadi");
        System.out.print("Enter bil : ");
        pil = input.nextInt();
        switch(pil){
            case 1: System.out.print("Naik kereta \nSilahkan beli tiket di stasiun \n");break;
            case 2: System.out.println("Naik pesawat");
            case 3: System.out.println("Naik bus");break;
            case 4: System.out.println("Naik kendaraan pribadi pribadi");break;
            default:System.out.println("Ndak jadi pergi ah");break;
        }
    }
}
