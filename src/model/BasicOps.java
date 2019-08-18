package model;

public class BasicOps {

    public BasicOps() {
    }

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