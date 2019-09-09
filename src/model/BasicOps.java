package model;

import java.util.Scanner;


/**
 * The BasicOps.java it's so util. Also recommended. All rights reserved!!
 * 
 * @author Camilo Cordoba
 * @since 1.0
 */
public class BasicOps {

    private String[] memory;

    /** 
     * This method is the constructor of class
     */
    public BasicOps() {
        memory = new String[10];
        for(int i = 0; i != memory.length; i++){
            memory[i] = "Vacio";
        }
    }

    /**
     * This method performs the sum of two numbers 
     * <b>pre:</b> num1 and num2 are valids parameters <br>
     * <b>post:</b> The sum was made <br>
     * @param num1 is a number . num1 != null
     * @param num2 is a number . num2 != null
     * 
     */

    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * This method performs the subtracion of two numbers
     * <b>pre:</b> num1 and num2 are valids parameters <br>
     * <b>post:</b> The subtraction was made <br>
     * @param num1 is a number Double type . num1 != null
     * @param num2 is a number Double type. num2 != null
     * @return double
     */
    public double subt(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * This method divides
     * <b>pre:</b> num1 and num2 are valids parameters <br>
     * <b>post:</b> The divition was made <br>
     * @param num1 is a number Double type . num1 != null
     * @param num2 is a number Double type . num2 != 0
     * @return double
     */
    public double div(double num1, double num2) {

        return num1 / num2;

    }

    /**
     * This method miltiplies
     * @param num1 is a number Double type . num1 != null
     * @param num2 is a number Double type . num2 != null
     * @return double
     */
    public double multi(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Return the module
     * @param num1
     * @param num2
     * @return double
     */
    public double mod(double num1, double num2) {

        return num1 % num2;

    }

    /**
     * This methor returns all array memory
     * @return list
     * @author Camilo Cordoba
     */
    public String memoryToString() {
        String list = "";
        for (int i = 0; i < memory.length; i++) {
            if (i == 9) {
                list += "\n " + (i + 1) + ".   " + memory[i];
            } else {
                list += "\n " + (i + 1) + ".    " + memory[i];
            }
        }
        return list;
    }

    /**
     * Get memory valor in memory[opt-1]
     * @param opt
     * @return something
     */
    public String getMemory(int opt) {

        return memory[opt - 1];

    }

    /**
     * adds to Memory[]
     * @param s
     * @author Camilo Corodoba
     */
    public void addToMemory(String s){
        
        for(int i = 8; i != -1; i--){
            memory[i+1] = memory[i];
        }
        memory[0] = s;
    }

}