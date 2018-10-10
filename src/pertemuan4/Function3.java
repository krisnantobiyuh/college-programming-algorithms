/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author K15
 */
public class Function3 {

    public static int sum(){
        int a = 8, b = 10;
        return (a + b);
    }
    
    public static void main(String arg[]){
        Function3 obyek = new Function3(); //create obyek from class
        System.out.println("Result for method sum");
        System.out.println(sum());
        System.out.println(obyek.sum());
        
    }
}
