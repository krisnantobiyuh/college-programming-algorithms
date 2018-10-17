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
public class IfElse {
    public static void main(String[] args) {
        String forecast;
        double temperature = getTemperature();
        if (temperature <=32.0){
        forecast = "SNOW";
        }
        else {
        forecast = "RAIN";
        }
        System.out.println(forecast); 
    }
    
    public static double getTemperature(){
       return 30.3;
    } 
}
