/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author K15
 */
public class String5 {
    public static void main(String[] args) {
        String str = "Using String replace to replace character";
        String newStr = str.replace("Using","RA");
        System.out.println(newStr);
        String newFirstStr = str.replaceFirst("Re","RE");
        System.out.println(newFirstStr); 
    }
}
