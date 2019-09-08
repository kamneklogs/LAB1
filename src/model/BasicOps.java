package model;

import java.util.Scanner;


/**
 * The BasicOps.java it's so util. Also recommended
 * 
 * @author Camilo Cordoba
 * @since 1.0
 */
public class BasicOps {

    private String[] memory;

    /** 
     * 
     */
    public BasicOps() {
        memory = new String[10];
        for(int i = 0; i != memory.length; i++){
            memory[i] = "Vacio";
        }
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

    public String getMemory(int opt) {

        return memory[opt - 1];

    }

    public void addToMemory(String s){
        
        for(int i = 8; i != -1; i--){
            memory[i+1] = memory[i];
            //System.out.println("entro al for");
        }
        memory[0] = s;
    }

}