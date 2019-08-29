package model;
import java.util.Scanner;

public class BasicOps {

    double num1;
    double num2;
    Scanner r = new Scanner(System.in);

    public BasicOps() {
    }

    /**
     * This method performs the sum of two numbers 
     * <b>pre:</b> I don't know <br>
     * <b>post:</b> The sum hs been printed <br>
     * @param num1 is a number . num1 != null
     * @param num2 is a number . num2 != null
     */

    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double subt(double num1, double num2) {
        return num1 - num2;
    }

    public double div(double num1, double num2)throws ArithmeticException {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.err.println("ERROR DEMONIACO\n  Detalles: " + e + " NO SE PUEDE DIVIDIR POR CERO");
        }
    }

    public double multi(double num1, double num2) {
        return num1 * num2;
    }

    public double mod(double num1, num2)throws ArithmeticException {
        try {
            return num1 % num2;
        } catch (ArithmeticException e) {
            System.err.println("ERROR DEMONIACO\n  Detalles: " + e + " NO SE PUEDE DIVIDIR POR CERO");
        };
    }

}