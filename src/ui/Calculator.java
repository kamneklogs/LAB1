package ui;

import model.*;
import java.util.Scanner;

public class Calculator {

  private static final String LISTOPS = "Opciones:\n\n1. Suma\n2. Resta.\n3. Division.\n4. Multiplicacion.\n5. Modulo.\n6. Seno.\n7. Coseno.\n8. Tangente.\n9. Logaritmo base 10 y base n.\n10. Raiz cuadrada.\n11. Raiz n-esima.\n12. Potenciacion.\n13. Base 10 de un numero x.\n14. Memoria de los resultados de las ultimas 10 operaciones. (Estos resultados pueden ser usados en la operacion actual del usuario). \n15. El factorial de un numero.\n16. La conversion de grados a radianes y viceversa.\n17. La conversion entre binarios, decimales y hexadecimales.";
  static int opt;
  static double num1, num2;
  static boolean b;
  static Scanner r;
  private BasicOps bOps;
  private MediumOps mOps;
  private TrigoOps tOps;

  public Calculator() {
    bOps = new BasicOps();
    mOps = new MediumOps();
    tOps = new TrigoOps();
    r = new Scanner(System.in);
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
          System.out.print("Num1 = ");
          num1 = r.nextDouble();
          System.out.print("Num2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.sum(num1, num2));
          break;

        case 2:
          System.out.print("Num1 = ");
          num1 = r.nextDouble();
          System.out.print("Num2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.subt(num1, num2));
          break;

        case 3:
          System.out.print("Num1 = ");
          num1 = r.nextDouble();
          System.out.print("Num2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.div(num1, num2));
          break;

        case 4:
          System.out.print("Num1 = ");
          num1 = r.nextDouble();
          System.out.print("Num2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.multi(num1, num2));
          break;

        case 5:
          System.out.print("Num1 = ");
          num1 = r.nextDouble();
          System.out.print("Num2 =");
          num2 = r.nextDouble();
          System.out.println(m.bOps.mod(num1, num2));
          break;

        case 6:
          System.out.println(m.tOps.sin());
          break;

        case 7:
          System.out.println(m.tOps.cos());
          break;

        case 8:
          System.out.println(m.tOps.tan());
          break;

        case 9:
          System.out.println("Ingrese la base");
          num1 = r.nextDouble();
          System.out.println("Ingrese el argumento");
          num2 = r.nextDouble();
          System.out.println("El resultado es: " + m.mOps.log(num1, num2));
          break;

        case 10:
          System.out.print("Num = ");
          num1 = r.nextDouble();
          System.out.println(m.mOps.sqrt(num1));
          break;

        case 11:
          System.out.println("Ingrese el radical: ");
          num1 = r.nextDouble();
          System.out.println("Ingrese el radicando: ");
          num2 = r.nextDouble();
          System.out.println(m.mOps.nroot(num1, num2));
          break;

        case 12:
          System.out.println("Ingrese la base: ");
          num1 = r.nextDouble();
          System.out.println("Ingrese el exponente: ");
          num2 = r.nextDouble();
          System.out.println(m.mOps.pow(num1, num2));
          break;

        case 13:
          System.out.println("Ingrese el exponente:");
          num2 = r.nextDouble();
          System.out.println(m.mOps.pow(10, num2));
          break;

        }

      }
      System.out.println("1. Volver a la eleccion del modo de la calculadora.\n2. Apagar calculadora.");
      opt = r.nextInt();
    } while (opt == 1);

    System.out
        .println("Created by Cristhian Camilo Gutierrez Cordoba\nInfo and cheaps services : kamneklogs@gmail.com :3");
  }

}