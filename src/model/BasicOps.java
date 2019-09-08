package model;

import java.util.Scanner;

/**
 * The BasicOps.java it's so util. Also recommended
 * @author  Camilo Cordoba
 * @since 1.0
 */
public class BasicOps {

    double num1;
    double num2;
    Scanner r = new Scanner(System.in);

    
    /** 
     * 
     */
    public BasicOps() {
    }

    /**
     * This method performs the sum of two numbers <b>pre:</b> I don't know <br>
     * <b>post:</b> The sum hs been printed <br>
     * 
     * @param num1 is a number . num1 != null
     * @param num2 is a number . num2 != null
     */

    public double sum(double num1, double num2) {
        return num1 + num2;
    }
    
    
    /** 
     * @param num1
     * @param num2
     * @return double
     */
    public double subt(double num1, double num2) {
        return num1 - num2;
    }

    
    /** 
     * @param num1
     * @param num2
     * @return double
     */
    public double div(double num1, double num2) {

        return num1 / num2;

    }

    
    /** 
     * @param num1
     * @param num2
     * @return double
     */
    public double multi(double num1, double num2) {
        return num1 * num2;
    }

    
    /** 
     * @param num1
     * @param num2
     * @return double
     */
    public double mod(double num1, double num2) {

        return num1 % num2;

    }

}