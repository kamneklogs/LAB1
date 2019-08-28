package ui;

import model.*;
import java.util.Scanner;

public class Calculator {

  private static final String LISTOPS = "Opciones:\n\n1. Suma\n2. Resta.\n3. Division.\n4. Multiplicacion.\n5. Modulo.\n6. Seno.\n7. Coseno.\n8. Tangente.\n9. Logaritmo base 10 y base n.\n10. Raiz cuadrada.\n11. Raiz n-esima.\n12. Potenciacion.\n13. Base 10 de un numero x.\n14. Memoria de los resultados de las ultimas 10 operaciones. (Estos resultados pueden ser usados en la operacion actual del usuario). \n15. El factorial de un numero.\n16. La conversion de grados a radianes y viceversa.\n17. La conversion entre binarios, decimales y hexadecimales.";
  private static final String LRADIAN = "Numero Pi = II\n1. 0.\n2. II/6\n3. II/4\n4. II/3\n5. II/2\n6. II\n7. (3/2)II\n8. 2II\n";
  private static final String LDEGREES = "1. 0g\n2. 30g\n3. 45g\n4. 60g\n5. 90g\n6. 180g\n7. 270g\n8. 360g\n";
  static int opt;
  static double num1, num2;
  static boolean b;
  static Scanner r = new Scanner(System.in);
  private BasicOps bOps;
  private MediumOps mOps;
  private TrigoOps tOps;
  

  public Calculator() {
    bOps = new BasicOps();
    mOps = new MediumOps();
    tOps = new TrigoOps();
  }

  public static void main(String[] args) {
    Calculator m = new Calculator();
    opt = 0;
    System.out
        .println("**********************************************************************************************");
    System.out
        .println("|                                  CAMILO'S CALCULATOR VERSION 1.9                           |");
    System.out
        .println("**********************************************************************************************\n");

    do {
      System.out.println("Elija el modo de su calculadora.\n1. Una operacion a la vez.\n2. Flujo de operaciones.");
      opt = r.nextInt();
      switch (opt) {
      case 1:
        System.out.println(LISTOPS);
        opt = r.nextInt();
        switch (opt) {

        case 1:
          m.bOps.sum();
          break;

        case 2:
          m.bOps.subt();
          break;

        case 3:
          m.bOps.div();
          break;

        case 4:
          m.bOps.multi();
          break;

        case 5:
          m.bOps.mod();
          break;

        case 6:
          System.out.println("1. Ingresar en grados.\n2. Ingresar en radianes.\n\n     Nota: Solo se admiten angulos o radianes notables.");
          opt = r.nextInt();
          switch(opt){
            case 1:
              opt = r.nextInt();
              
              break;
          }
          m.tOps.sin(a);
          break;

        }

      }
      System.out.println("1. Volver a la eleccion del modo de la calculadora.\n2. Apagar calculadora.");
      opt = r.nextInt();
    } while (opt == 1);

  }

}