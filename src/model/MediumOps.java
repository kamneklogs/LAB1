package model;

import java.math.*;
import java.lang.*;

public class MediumOps {

    private double n, nn, r;
    private double max = Double.MAX_VALUE;
    private double aux, babylonial, var;

    public MediumOps() {

    }

    public double log(double num1, double num2) {

        return Math.log10(num2) / Math.log10(num1);
    }

    public double sqrt(double num1) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            r = i * i;
            aux = abs(r - num1);
            if (aux < max) {
                n = i;
                nn = r;
                max = aux;
            } else {
                break;
            }
        }
        babylonial = (num1 + nn) / (2 * n);

        return babylonial;
    }

    public double abs(double num1) {

        if (num1 < 0) {
            num1 = num1 * -1;
        }
        return num1;

    }

    public double nroot(double num1, double num2) {
        
        var = Math.pow(num2, 1 / num1);

        return var;
        
    }

    public double pow(double num1, double num2){
        return Math.pow(num1, num2);
    }

}