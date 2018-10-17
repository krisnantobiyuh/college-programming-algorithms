/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author K15
 */
public class Comparing2 {
    public static void main(String[] args) {
        String x = "Ora";
        String y = "cle";
        String z = x+ y;
        boolean test = (z == x+y);
        System.out.println(test); // kenapa bernilai false
        // karena compare string tidak bisa menggunakan operator ==
    }
}
