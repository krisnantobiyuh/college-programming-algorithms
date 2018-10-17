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
public class DriverIsUnderAge {
    public static void main(String[] args) {
        int age;
        boolean drivingUnderAge = false;
        
        age = 20;
        
        if (age <= 18) {
            drivingUnderAge = true;
        }
        
        System.out.println(drivingUnderAge);
    }
}
