package ui;

import model.*;
import java.util.Scanner;

/**
 * The app Camilo's Calulator is a great invention done by humanity. 
 * @since 1.0
 * @author Camilo Cordoba
 */
public class Calculator {

  private static final String LISTOPS = "\n\n\nOpciones:\n\n1. Suma\n2. Resta.\n3. Division.\n4. Multiplicacion.\n5. Modulo.\n6. Seno.\n7. Coseno.\n8. Tangente.\n9. Logaritmo.\n10. Raiz cuadrada.\n11. Raiz n-esima.\n12. Potenciacion.\n13. Base 10 de un numero x.\n14. Memoria de los resultados de las ultimas 10 operaciones. (Estos resultados pueden ser usados en la operacion actual del usuario). \n15. El factorial de un numero.\n16. La conversion de grados a radianes.\n17. La conversion de Radianes a Grados.\n18. La conversion entre binarios, decimales y hexadecimales.\n19. Logaritmo base 10.\n20. Logaritmo natural.\n";
  private static final String LISTTYP = "1. Decimales.\n2. Hexadecimales.\n3. Binarios ";
  private static int opt;
  // private static double[] memory = new double[9];
  private static double num1, num2;
  private static String s;
  private static Scanner r;
  private BasicOps bOps;
  private MediumOps mOps;
  private TrigoOps tOps;

  
  /** 
   * This constructor make all relations tree
   */
  public Calculator() {
    bOps = new BasicOps();
    mOps = new MediumOps();
    tOps = new TrigoOps();
    r = new Scanner(System.in);
  }

  
  /** 
   * This does some not do something important xD
   */
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
      System.out.println("Elija el modo de su calculadora.\n1. Una operacion a la vez.\n2. Flujo de operaciones.\n");
      opt = r.nextInt();
      switch (opt) {
      case 1:
        System.out.println(LISTOPS);
        opt = r.nextInt();
        switch (opt) {

        case 1:
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.sum(num1, num2));
          break;

        case 2:
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.subt(num1, num2));
          break;

        case 3:
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.div(num1, num2));
          break;

        case 4:
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.multi(num1, num2));
          break;

        case 5:
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.mod(num1, num2));
          break;

        case 6:
          System.out.print("\nNum 1 (grados) = ");
          num1 = r.nextDouble();
          System.out.println(m.tOps.sin(num1));
          break;

        case 7:
          System.out.print("\nNum 1 (grados) = ");
          num1 = r.nextDouble();
          System.out.println(m.tOps.cosin(num1));
          break;

        case 8:
          System.out.print("\nNum 1 (grados) = ");
          num1 = r.nextDouble();
          System.out.println(m.tOps.tan(num1));
          break;

        case 9:
          System.out.println("\nIngrese la base");
          num1 = r.nextDouble();
          System.out.println("\nIngrese el argumento");
          num2 = r.nextDouble();
          System.out.println("\nEl resultado es: " + m.mOps.log(num1, (int)num2));
          break;

        case 10:
          System.out.print("\nNum = ");
          num1 = r.nextDouble();
          System.out.println(m.mOps.sqrt(num1));
          break;

        case 11:
          System.out.println("\nIngrese el indice: ");
          num1 = r.nextDouble();
          System.out.println("\nIngrese el radicando: ");
          num2 = r.nextDouble();
          System.out.println(m.mOps.nRoot(num1, num2));
          break;

        case 12:
          System.out.println("\nIngrese la base: ");
          num1 = r.nextDouble();
          System.out.println("\nIngrese el exponente: ");
          num2 = r.nextDouble();
          System.out.println(m.mOps.pow(num1, num2));
          break;

        case 13:
          System.out.println("\nIngrese el exponente:");
          num2 = r.nextDouble();
          System.out.println(m.mOps.pow(10, num2));
          break;

        case 15:
          System.out.print("\nIngrese el numero: ");
          num1 = r.nextInt();
          System.out.println(m.mOps.fact((int) num1));
          break;

        case 16:
          System.out.print("\nIngrese el numero en grados: ");
          num1 = r.nextDouble();
          System.out.println(m.tOps.toRadians(num1));
          break;

        case 17:
          System.out.println("\nIngrese el numero en radianes");
          num1 = r.nextDouble();
          System.out.println(m.tOps.toDegrees(num1));
          break;

        case 18:
          System.out.println("\nElija el tipo de numero origen:\n" + LISTTYP);
          opt = r.nextInt();
          switch (opt) {
          case 1:
            System.out.println("\nElija el tipo de numero destino:\n" + LISTTYP);
            opt = r.nextInt();
            switch (opt) {
            case 1:
              System.out.print("\nIngrese el numero");
              num1 = r.nextDouble();
              System.out.println(num1);
              break;

            case 2:
              System.out.print("\nIngrese el numero: ");
              num1 = r.nextDouble();
              System.out.println(m.mOps.decToHexa((int) num1));
              break;

            case 3:
              System.out.print("\nIngrese el numero: ");
              num1 = r.nextDouble();
              System.out.println(m.mOps.decToBin((int) num1));
              break;
            }
            break;

          case 2:
            System.out.println("\nElija el tipo de numero destino:\n" + LISTTYP);
            opt = r.nextInt();
            switch (opt) {
            case 1:
              System.out.print("\nIngrese el numero hexadecimal: ");
              s = r.next();
              System.out.println(m.mOps.hexaToDeci(s));
              break;

            case 2:
              System.out.print("\nIngrese el numero hexadecimal: ");
              s = r.nextLine();
              System.out.println(s);
              break;

            case 3:
              System.out.print("\nIngrese el numero hexadecimal: ");
              s = r.nextLine();
              System.out.println(m.mOps.hexToBin(s));
              break;
            }
            break;

          case 3:
            System.out.println("\nElija el tipo de numero destino:\n" + LISTTYP);
            opt = r.nextInt();
            switch (opt) {
            case 1:
              System.out.print("\nIngrese el numero binario: ");
              num1 = r.nextDouble();
              System.out.println(m.mOps.binToDeci((int) num1));
              break;

            case 2:
              System.out.print("\nIngrese el numero binario: ");
              num1 = r.nextInt();
              System.out.println(m.mOps.binToHexa((int) num1));
              break;

            case 3:
              System.out.print("\nIngrese el numero binario: ");
              s = r.nextLine();
              System.out.println(s);
              break;
            }
            break;
          }

          break;

        case 19:

          System.out.print("\nIngrese el argumento = ");
          num2 = r.nextDouble();
          System.out.println(m.mOps.log10(num2));
          break;

        case 20:
          System.out.print("\nIngrese el argumento = ");
          num2 = r.nextDouble();
          System.out.println(m.mOps.ln(num2));
          break;

        }

      }
      System.out.println("\n1. Volver a la eleccion del modo de la calculadora.\n2. Apagar calculadora.");
      opt = r.nextInt();
    } while (opt == 1);

    System.out
        .println("\nCreated by Cristhian Camilo Gutierrez Cordoba\nInfo and cheaps services : kamneklogs@gmail.com :3");
  }

}