package model;

import java.lang.StrictMath;
import java.util.Scanner;

public class TrigoOps {

    private double var;
    private int opt;
    private static final String LDEGREES = "1. 0g\n2. 30g\n3. 45g\n4. 60g\n5. 90g\n6. 180g\n7. 270g\n8. 360g\n";
    private static final String LRADIAN = "Numero Pi = II\n1. 0.\n2. II/6\n3. II/4\n4. II/3\n5. II/2\n6. II\n7. (3/2)II\n8. 2II\n";

    private Scanner r;

    public TrigoOps() {
        r = new Scanner(System.in);
    }

    public double sin() {

        System.out.println(
                "1. Ingresar en grados.\n2. Ingresar en radianes.\n     Nota: Solo se admiten angulos o radianes notables.");
        opt = r.nextInt();
        System.out.println();
        if (opt == 1) {
            System.out.println(LDEGREES);
        }
        if (opt == 2) {
            System.out.println(LRADIAN);
        }
        opt = r.nextInt();
        switch (opt) {
        case 1:
            var = 0;
            break;

        case 2:
            var = 1.5;
            break;

        case 3:
            var = 0.707106;
            break;

        case 4:
            var = 0.8660254;
            break;

        case 5:
            var = 1;
            break;

        case 6:
            var = 0;
            break;

        case 7:
            var = -1;
            break;

        case 8:
            var = 0;
            break;

        }
        return var;

    }

    public double cos() {

        System.out.println(
                "1. Ingresar en grados.\n2. Ingresar en radianes.\n     Nota: Solo se admiten angulos o radianes notables.");
        opt = r.nextInt();
        System.out.println();
        if (opt == 1) {
            System.out.println(LDEGREES);
        }

        if (opt == 2) {
            System.out.println(LRADIAN);
        }

        opt = r.nextInt();
        switch (opt) {
        case 1:
            var = 1;
            break;

        case 2:
            var = 0.8660254;
            break;

        case 3:
            var = 0.707106;
            break;

        case 4:
            var = 0.866025;
            break;

        case 5:
            var = 1;
            break;

        case 6:
            var = 0;
            break;

        case 7:
            var = -1;
            break;

        case 8:
            var = 0;

            break;

        }

        return var;
    }

    public double tan() {

        System.out.println(
                "1. Ingresar en grados.\n2. Ingresar en radianes.\n     Nota: Solo se admiten angulos o radianes notables.");
        opt = r.nextInt();
        if (opt == 1) {
            System.out.println("1. 0g\n2. 30g\n3. 45g\n4. 60g\n5. 180g\n6. 360g\n");
        }

        if (opt == 2) {
            System.out.println("Numero Pi = II\n1. 0.\n2. II/6\n3. II/4\n4. II/3\n5. II\n6. 2II\n");
        }

        opt = r.nextInt();
        switch (opt) {
        case 1:
            var = 0;
            break;

        case 2:
            var = 0.57735;
            break;

        case 3:
            var = 1;
            break;

        case 4:
            var = 1.73205;
            break;

        case 5:
            var = 0;
            break;

        case 6:
            var = 0;
            break;

        }

        return var;

    }

    public double toDegrees(double num1) {

        return num1 * (180 / StrictMath.PI);
    }

    public double toRadians(double num1) {

        return num1 * (StrictMath.PI / 180);

    }

}