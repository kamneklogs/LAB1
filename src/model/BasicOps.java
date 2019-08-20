package model;

public class BasicOps {

    public BasicOps() {
    }

    /**
     * This method performs the sum of two numbers
     * <b>pre:</b> I don't know <br>
     * <b>post:</b> The sum hs been printed <br>
     * @param num1 is a number . num1 != null
     * @param num2 is a number . num2 != null
     * @throws Exception I don't know  
     */
    public void sum(double num1, double num2) {
        System.out.println("El resultado es: " + (num1 + num2));
    }

    public void subt(double num1, double num2){
        System.out.println("El resultado de la resta es: "+ (num1-num2));
    }

    public void div(double num1, double num2){
        System.out.println("El resultado de la division es: " + (num1/num2));
    }

    public void multi(double num1, double num2){
        System.out.println("El resultado de la multipplicacion es: " + (num1*num2));
    }

    public void mod(double num1, double num2){
        System.out.println("El modulo es: " + (num1%num2));
    }

}