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
public class String9 {
    public static void main(String[] args) {
        String s1 = "Susan";
        String s2 = "Susan";
        String s3 = "Robert";
        //Return 0 becoude s1 is identical to s2
        System.out.println(s1.compareTo(s2));
        //Return >0 becaude 'S' follows 'R'
        System.out.println(s1.compareTo(s3));
        //Return <0 becoude 'R' precedes 'S'
        System.out.println(s3.compareTo(s1)); 
    }
}
