package model;

import java.math.*;
import java.lang.*;

public class MediumOps {

    private double n, nn, r;
    private double max = Double.MAX_VALUE;
    private double aux, babylonial, var;
    static char hexdec[];

    public MediumOps() {

        hexdec = new char[100];

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

    public double pow(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public int fact(int num1) {

        int res = 1, i;
        for (i = 2; i <= num1; i++) {
            res *= i;
        }
        return res;
    }

    public String hexToBin(String s) {

        String varR = "";

        hexdec = s.toCharArray();

        for (int i = 0; i != hexdec.length; i++) {

            switch (hexdec[i]) {
            case '0':
                varR += "0000";
                break;
            case '1':
                varR += "0001";
                break;
            case '2':
                varR += "0010";
                break;
            case '3':
                varR += "0011";
                break;
            case '4':
                varR += "0100";
                break;
            case '5':
                varR += "0101";
                break;
            case '6':
                varR += "0110";
                break;
            case '7':
                varR += "0111";
                break;
            case '8':
                varR += "1000";
                break;
            case '9':
                varR += "1001";
                break;
            case 'A':
            case 'a':
                varR += "1010";
                break;
            case 'B':
            case 'b':
                varR += "1011";
                break;
            case 'C':
            case 'c':
                varR += "1100";
                break;
            case 'D':
            case 'd':
                varR += "1101";
                break;
            case 'E':
            case 'e':
                varR += "1110";
                break;
            case 'F':
            case 'f':
                varR += "1111";
                break;
            default:
                System.out.print("\nDigito hexadecimal invalido, intente nuevamente ");
            }

        }

        return varR;
    }

    public String decToHexa(int num1) {
        double residue;
        StringBuilder convertion = new StringBuilder(num1);
        convertion = new StringBuilder();
        while (num1 != 0) {
            residue = num1 % 16;
            num1 = num1 / 16;
            if (residue == 10)
                convertion.append("A");
            else if (residue == 11)
                convertion.append("B");
            else if (residue == 12)
                convertion.append("C");
            else if (residue == 13)
                convertion.append("D");
            else if (residue == 14)
                convertion.append("E");
            else if (residue == 15)
                convertion.append("F");

            else
                convertion.append((int) residue);
        }
        String output = convertion.reverse().toString();
        return output;

    }

    public int binToDeci(int num1) {

        int num = num1;
        int dec_value = 0;

        // Initializing base

        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }

    public String decToBin(int num1) {

        String s = decToHexa(num1);
        return hexToBin(s);

    }

    public int hexaToDeci(String s) {
        String str = hexToBin(s);
        int num1 = Integer.parseInt(str.trim());
        return binToDeci(num1);
    }

    public String binToHexa(int num1) {
        int num = binToDeci(num1);
        return decToHexa(num);
    }

}