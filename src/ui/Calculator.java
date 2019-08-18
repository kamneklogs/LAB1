package ui;

import model.*;
import java.util.Scanner;

public class Calculator {

  private static final String LISTOPS = "Opciones:\n\n1. Suma\n2. Resta.\n3. Division.\n4. Multiplicacion.\n5. Modulo.\n6. Seno.\n7. Coseno.\n8. Tangente.\n9. Logaritmo base 10 y base n.\n10. Raiz cuadrada.\n11. Raiz n-esima.\n12. Potenciacion.\n13. Base 10 de un numero x.\n14. Memoria de los resultados de las ultimas 10 operaciones. (Estos resultados pueden ser usados en la operacion actual del usuario). \n15. El factorial de un numero.\n16. La conversion de grados a radianes y viceversa.\n17. La conversion entre binarios, decimales y hexadecimales.";
  static int opt, optMenu;
  static double num1, num2;
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
    optMenu = 0;
    System.out
        .println("**********************************************************************************************");
    System.out
        .println("|                                  CAMILO'S CALCULATOR VERSION 1.9                           |");
    System.out
        .println("**********************************************************************************************\n");
    do {
      System.out.println(LISTOPS);
      opt = r.nextInt();
      switch (opt) {
      case 1:
        System.out.println("Ingrese el primer numero: ");
        num1 = r.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = r.nextDouble();
        m.bOps.sum(num1, num2);
        break;

      case 2:
        System.out.println("Ingrese el primer numero: ");
        num1 = r.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = r.nextDouble();
        m.bOps.subt(num1, num2);
        break;

      case 3:
        System.out.println("Ingrese el numerador: ");
        num1 = r.nextDouble();
        System.out.println("Ingrese el denominador: ");
        num2 = r.nextDouble();
        m.bOps.div(num1, num2);
        break;

      case 4:
        System.out.println("Ingrese el primer factor: ");
        num1 = r.nextDouble();
        System.out.println("Ingrese el segundo factor: ");
        num2 = r.nextDouble();
        m.bOps.multi(num1, num2);
        break;

      case 5:
        System.out.println("Ingrese el numerador: ");
        num1 = r.nextDouble();
        System.out.println("Ingrese el denominador: ");
        num2 = r.nextDouble();
        m.bOps.mod(num1, num2);
        break;
      }

    } while (optMenu == 0);
  }

}