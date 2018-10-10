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
public class String3 {
    public static void main(String[] args) {
        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf('4');
        System.out.println("index of first dash : " + idx1);
        int idx2 = phoneNum.indexOf('-',3);
        System.out.println("second dash indx : " + idx2); 
    }
}
