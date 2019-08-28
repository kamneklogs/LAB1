package model;

import java.util.Scanner;

public class TrigoOps {

    private double extra;
    private int opt;
    private static final String LDEGREES = "1. 0g\n2. 30g\n3. 45g\n4. 60g\n5. 90g\n6. 180g\n7. 270g\n8. 360g\n";
    private Scanner r;

    public TrigoOps() {
        r = new Scanner(System.in);
    }
    // "1. 0g\n2. 30g\n3. 45g\n4. 60g\n5. 90g\n6. 180g\n7. 270g\n8. 360g\n";

    public void sin() {

        System.out.println(
                "1. Ingresar en grados.\n2. Ingresar en radianes.\n\n     Nota: Solo se admiten angulos o radianes notables.");
        opt = r.nextInt();
        if (opt == 1) {
            System.out.println(LDEGREES);
            opt = r.nextInt();
            switch (opt) {
            case 1:
                System.out.println("Seno = 0");
                break;

            case 2:
                System.out.println("Seno = 1/2");
                break;

            case 3:
                System.out.println("(Seno = Raiz cuadrada de 2)/2");
                break;

            case 4:
                System.out.println("Seno = (Raiz cuadrada de 3)/2");
                break;

            case 5:
                System.out.println("Seno = 1");
                break;

            case 6:
                System.out.println("Seno = 0");
                break;

            case 7:
                System.out.println("Seno = -1");
                break;

            case 8:
                System.out.println("Seno = 0");
                break;

            }

        }

        if (b == true) {

        }

    }

}