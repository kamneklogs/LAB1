package model;

import java.lang.StrictMath;
import java.util.Scanner;
import model.MediumOps;

public class TrigoOps extends MediumOps {

    private double var;
    private int opt;
    private static final String LDEGREES = "1. 0g\n2. 30g\n3. 45g\n4. 60g\n5. 90g\n6. 180g\n7. 270g\n8. 360g\n";
    private static final String LRADIAN = "Numero Pi = II\n1. 0.\n2. II/6\n3. II/4\n4. II/3\n5. II/2\n6. II\n7. (3/2)II\n8. 2II\n";

    private Scanner r;


    public TrigoOps() {
        r = new Scanner(System.in);
    }

    public double sin(double num1) {

        num1 = toRadians(num1);
        int count = 1;
        double pow1 = 1, pow2 = 3, y, sump = 0.0, sumn = 0.0;

        do {
            sump = sump + (StrictMath.pow(num1, pow1)) / fact((int) pow1);
            pow1 += 4;
            sumn = sumn - (StrictMath.pow(num1, pow2)) / fact((int) pow2);
            pow2 += 4;
            count++;
        } while (count < 4);
        y = sump + sumn;

        return y;

    }

    
    public double cosin(double num1) {

        int j = 1, m = -1;
        double r = 0, y = 0, rad;
        rad = toRadians(num1);
        y = 1.0;
        if (num1 >= 0 && num1 < 120) {
            for (int k = 2; k < 5; k = k + 2) {

                double o = StrictMath.pow(rad, k);
                j = j * (k - 1) * k;
                y = o / j;
                y = y + m * r;
                m = m * (-1);

            }
            return y;
        }
        if (num1 >= 120 && num1 < 200) {

            for (int k = 2; k < 10; k = k + 2) {
                double o = StrictMath.pow(rad, k);
                j = j * (k - 1) * k;
                r = o / j;
                y = y + m * r;
                m = m * (-1);
            }
            return y;
        } 
        if (num1 >= 200 && num1 < 300) {

            for (int k = 2; k < 13; k = k + 2) {
                double o = StrictMath.pow(rad, k);
                j = j * (k - 1) * k;
                r = o / j;
                y = y + m * r;
                m = m * (-1);
            }
            return y;
        } 
        
        else {
            for (int k = 2; k < 14; k = k + 2) {
                double o = StrictMath.pow(rad, k);
                j = j * (k - 1) * k;
                r = o / j;
                y = y + m * r;
                m = m * (-1);
            }
            return y;
        }
    }



    public double tan(double num1) {

        return (sin(num1)/cosin(num1))*0.04703703704;

    }

    public double toDegrees(double num1) {

        return num1 * (180 / StrictMath.PI);
    }

    public double toRadians(double num1) {

        return num1 * (StrictMath.PI / 180);

    }

}