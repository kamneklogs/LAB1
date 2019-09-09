package ui;

import model.*;
import java.util.Scanner;

/**
 * The app Camilo's Calulator is a great invention done by humanity. All rights
 * reserved!!
 * 
 * @since 1.0
 * @author Camilo Cordoba
 */
public class Calculator {

  private static final String LISTOPS = "\n\n\nOpciones:\n\n1. Suma\n2. Resta.\n3. Division.\n4. Multiplicacion.\n5. Modulo.\n6. Seno.\n7. Coseno.\n8. Tangente.\n9. Logaritmo.\n10. Raiz cuadrada.\n11. Raiz n-esima.\n12. Potenciacion.\n13. Base 10 de un numero x.\n14. Memoria de los resultados de las ultimas 10 operaciones. (Exclusivo solo en funcion Flujo de Operaciones). \n15. El factorial de un numero.\n16. La conversion de grados a radianes.\n17. La conversion de Radianes a Grados.\n18. La conversion entre binarios, decimales y hexadecimales.\n19. Logaritmo base 10.\n20. Logaritmo natural.\n";
  private static final String LISTTYP = "1. Decimales.\n2. Hexadecimales.\n3. Binarios ";
  private static int opt, num3;
  private static double num1, num2;
  private static String s;
  private static boolean oFlow, centinel;
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

  public static void main(String[] args) {
    Calculator m = new Calculator();
    opt = 0;
    System.out.print(
        "                                   _____________________\n                                  |  _________________  |\n                                  | | JO           0. | |\n                                  | |_________________| |\n                                  |  ___ ___ ___   ___  |\n                                  | | 7 | 8 | 9 | | + | |\n                                  | |___|___|___| |___| |\n                                  | | 4 | 5 | 6 | | - | |\n                                  | |___|___|___| |___| |\n                                  | | 1 | 2 | 3 | | x | |\n                                  | |___|___|___| |___| |\n                                  | | . | 0 | = | | / | |\n                                  | |___|___|___| |___| |\n                                  |_____________________|\n");
    System.out
        .println("\n *********************************************************************************************");
    System.out
        .println("|                      CAMILO'S CALCULATOR PREMIUM VERSION FULL HD 4K                        |");
    System.out
        .println(" *********************************************************************************************\n");

    do {
      System.out.println(
          "\nElija el modo de su calculadora.\n\n1. Una operacion a la vez (Nota: Resetea la memoria del flujo de operaciones).\n2. Flujo de operaciones.\n");
      opt = r.nextInt();
      if (opt == 2) {
        oFlow = true;
      }
      if (opt == 1) {
        oFlow = false;
      }
      System.out.println(LISTOPS);
      opt = r.nextInt();
      switch (opt) {

      case 1:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.sum(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.sum(num1, num2)));
            }
            if (opt == 2) {
              System.out.print("\nNum1 = ");
              num1 = r.nextDouble();
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.sum(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.sum(num1, num2)));
            }
          } else {
            System.out.print("\nNum1 = ");
            num1 = r.nextDouble();
            System.out.print("\nNum2 = ");
            num2 = r.nextDouble();
            System.out.println(m.bOps.sum(num1, num2));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.bOps.sum(num1, num2)));
            }
          }
        } else {
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 = ");
          num2 = r.nextDouble();
          System.out.println(m.bOps.sum(num1, num2));
        }
        break;

      case 2:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.subt(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.subt(num1, num2)));
            }
            if (opt == 2) {
              System.out.print("\nNum1 = ");
              num1 = r.nextDouble();
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.subt(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.subt(num1, num2)));
            }
          } else {
            System.out.print("\nNum1 = ");
            num1 = r.nextDouble();
            System.out.print("\nNum2 = ");
            num2 = r.nextDouble();
            System.out.println(m.bOps.subt(num1, num2));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.bOps.subt(num1, num2)));
            }
          }
        } else {
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 = ");
          num2 = r.nextDouble();
          System.out.println(m.bOps.subt(num1, num2));
        }
        break;

      case 3:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.div(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.div(num1, num2)));
            }
            if (opt == 2) {
              System.out.print("\nNum1 = ");
              num1 = r.nextDouble();
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.div(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.div(num1, num2)));
            }
          } else {
            System.out.print("\nNum1 = ");
            num1 = r.nextDouble();
            System.out.print("\nNum2 = ");
            num2 = r.nextDouble();
            System.out.println(m.bOps.div(num1, num2));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.bOps.div(num1, num2)));
            }
          }
        } else {
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 = ");
          num2 = r.nextDouble();
          System.out.println(m.bOps.div(num1, num2));
        }
        break;

      case 4:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.multi(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.multi(num1, num2)));
            }
            if (opt == 2) {
              System.out.print("\nNum1 = ");
              num1 = r.nextDouble();
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.multi(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.multi(num1, num2)));
            }
          } else {
            System.out.print("\nNum1 = ");
            num1 = r.nextDouble();
            System.out.print("\nNum2 = ");
            num2 = r.nextDouble();
            System.out.println(m.bOps.multi(num1, num2));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.bOps.multi(num1, num2)));
            }
          }
        } else {
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 = ");
          num2 = r.nextDouble();
          System.out.println(m.bOps.multi(num1, num2));
        }
        break;

      case 5:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.mod(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.mod(num1, num2)));
            }
            if (opt == 2) {
              System.out.print("\nNum1 = ");
              num1 = r.nextDouble();
              System.out.print("\nNum2 = ");
              num2 = r.nextDouble();
              System.out.println(m.bOps.mod(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.bOps.mod(num1, num2)));
            }
          } else {
            System.out.print("\nNum1 = ");
            num1 = r.nextDouble();
            System.out.print("\nNum2 = ");
            num2 = r.nextDouble();
            System.out.println(m.bOps.mod(num1, num2));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.bOps.mod(num1, num2)));
            }
          }
        } else {
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("\nNum2 = ");
          num2 = r.nextDouble();
          System.out.println(m.bOps.mod(num1, num2));
        }
        break;

      case 6:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero (en grados) de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero (en grados) de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.println(m.tOps.sin(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.sin(num1)));
            }
            if (opt == 2) {
              System.out.print("\nNum1 (en grados) = ");
              num1 = r.nextDouble();
              System.out.println(m.tOps.sin(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.sin(num1)));
            }
          } else {
            System.out.print("\nNum1 (en grados) = ");
            num1 = r.nextDouble();
            System.out.println(m.tOps.sin(num1));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.tOps.sin(num1)));
            }
          }
        } else {
          System.out.print("\nNum1 (en grados) = ");
          num1 = r.nextDouble();
          System.out.println(m.tOps.sin(num1));
        }
        break;

      case 7:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero (en grados) de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero (en grados) de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.println(m.tOps.cosin(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.cosin(num1)));
            }
            if (opt == 2) {
              System.out.print("\nNum1 (en grados) = ");
              num1 = r.nextDouble();
              System.out.println(m.tOps.cosin(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.cosin(num1)));
            }
          } else {
            System.out.print("\nNum1 (en grados) = ");
            num1 = r.nextDouble();
            System.out.println(m.tOps.cosin(num1));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.tOps.cosin(num1)));
            }
          }
        } else {
          System.out.print("\nNum1 (en grados) = ");
          num1 = r.nextDouble();
          System.out.println(m.tOps.cosin(num1));
        }
        break;

      case 8:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero (en grados) de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero (en grados) de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.println(m.tOps.tan(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.tan(num1)));
            }
            if (opt == 2) {
              System.out.print("\nNum1 (en grados) = ");
              num1 = r.nextDouble();
              System.out.println(m.tOps.tan(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.tan(num1)));
            }
          } else {
            System.out.print("\nNum1 (en grados) = ");
            num1 = r.nextDouble();
            System.out.println(m.tOps.tan(num1));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.tOps.tan(num1)));
            }
          }
        } else {
          System.out.print("\nNum1 (en grados) = ");
          num1 = r.nextDouble();
          System.out.println(m.tOps.tan(num1));
        }
        break;

      case 9:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar el argumento de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija el argumento de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.print("\nBase = ");
              num3 = r.nextInt();
              System.out.println(m.mOps.log(num1, num3));
              m.bOps.addToMemory(String.valueOf(m.mOps.log(num1, num3)));
            }
            if (opt == 2) {
              System.out.print("\nNum1 = ");
              num1 = r.nextDouble();
              System.out.print("Base = ");
              num3 = r.nextInt();
              System.out.println(m.mOps.log(num1, num3));
              m.bOps.addToMemory(String.valueOf(m.mOps.log(num1, num3)));
            }
          } else {
            System.out.print("\nNum1 = ");
            num1 = r.nextDouble();
            System.out.print("Base = ");
            num3 = r.nextInt();
            System.out.println(m.mOps.log(num1, num3));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.mOps.log(num1, num3)));
            }
          }
        } else {
          System.out.print("\nNum1 = ");
          num1 = r.nextDouble();
          System.out.print("Base = ");
          num3 = r.nextInt();
          System.out.println(m.mOps.log(num1, num3));
        }
        break;

      case 10:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.println(m.mOps.sqrt(num1));
              m.bOps.addToMemory(String.valueOf(m.mOps.sqrt(num1)));
            }
            if (opt == 2) {
              System.out.print("\nNum = ");
              num1 = r.nextDouble();
              System.out.println(m.mOps.sqrt(num1));
              m.bOps.addToMemory(String.valueOf(m.mOps.sqrt(num1)));
            }
          } else {
            System.out.print("\nNum = ");
            num1 = r.nextDouble();
            System.out.println(m.mOps.sqrt(num1));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.mOps.sqrt(num1)));
            }
          }
        } else {
          System.out.print("\nNum = ");
          num1 = r.nextDouble();
          System.out.println(m.mOps.sqrt(num1));
        }
        break;

      case 11:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar el radicando de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija el radicando de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num2 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.print("\nIndice = ");
              num1 = r.nextInt();
              System.out.println(m.mOps.nRoot(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.mOps.nRoot(num1, num2)));
            }
            if (opt == 2) {
              System.out.print("\nRadicando = ");
              num2 = r.nextDouble();
              System.out.print("Indice = ");
              num1 = r.nextInt();
              System.out.println(m.mOps.nRoot(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.mOps.nRoot(num1, num2)));
            }
          } else {
            System.out.print("\nRadicando = ");
            num2 = r.nextDouble();
            System.out.print("Indice = ");
            num1 = r.nextInt();
            System.out.println(m.mOps.nRoot(num1, num2));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.mOps.nRoot(num1, num2)));
            }
          }
        } else {
          System.out.print("\nRadicando = ");
          num2 = r.nextDouble();
          System.out.print("Indice = ");
          num1 = r.nextInt();
          System.out.println(m.mOps.nRoot(num1, num2));
        }
        break;

      case 12:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar la base de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija la base de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.print("\nExponente = ");
              num2 = r.nextDouble();
              System.out.println(m.mOps.pow(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.mOps.pow(num1, num2)));
            }
            if (opt == 2) {
              System.out.print("\nBase = ");
              num1 = r.nextDouble();
              System.out.print("\nExponente = ");
              num2 = r.nextDouble();
              System.out.println(m.mOps.pow(num1, num2));
              m.bOps.addToMemory(String.valueOf(m.mOps.pow(num1, num2)));
            }
          } else {
            System.out.print("\nBase = ");
            num1 = r.nextDouble();
            System.out.print("\nExponente = ");
            num2 = r.nextDouble();
            System.out.println(m.mOps.pow(num1, num2));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.mOps.pow(num1, num2)));
            }
          }
        } else {
          System.out.print("\nBase = ");
          num1 = r.nextDouble();
          System.out.print("\nExponente = ");
          num2 = r.nextDouble();
          System.out.println(m.mOps.pow(num1, num2));
        }
        break;

      case 13:
        if (oFlow == true) {
          System.out.print("\nExponente = ");
          num1 = r.nextDouble();
          System.out.println(m.mOps.pow(10, num1));
          m.bOps.addToMemory(String.valueOf(m.mOps.pow(10, num1)));
        } else {
          System.out.print("\nExponente = ");
          num1 = r.nextDouble();
          System.out.println(m.mOps.pow(10, num1));
        }
        break;

      case 15:
        if (oFlow == true) {
          System.out.print("\nNumero entero positivo = ");
          num3 = r.nextInt();
          System.out.println(m.mOps.fact(num3));
          m.bOps.addToMemory(String.valueOf(m.mOps.fact(num3)));
        } else {
          System.out.print("\nNumero entero positivo = ");
          num3 = r.nextInt();
          System.out.println(m.mOps.fact(num3));
        }
        break;

      case 14:
        if (oFlow == true) {
          System.out.println(m.bOps.memoryToString());
        } else {
          System.out.println(
              "Para acceder a esta funcion premium pague la subscripcion, si ya la pago entonces elija la\nopcion flujo de operaciones (No sea vago.)");
        }
        break;

      case 16:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero en grados de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero en grados de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.println(m.tOps.toRadians(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.toRadians(num1)));
            }
            if (opt == 2) {
              System.out.print("\nNumero en grados = ");
              num1 = r.nextDouble();
              System.out.println(m.tOps.toRadians(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.toRadians(num1)));
            }
          } else {
            System.out.print("\nNumero en grados = ");
            num1 = r.nextDouble();
            System.out.println(m.tOps.toRadians(num1));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.tOps.toRadians(num1)));
            }
          }
        } else {
          System.out.print("\nNumero en grados = ");
          num1 = r.nextDouble();
          System.out.println(m.tOps.toRadians(num1));
        }
        break;

      case 17:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar un numero en radianes de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un numero en radianes de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.println(m.tOps.toDegrees(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.toDegrees(num1)));
            }
            if (opt == 2) {
              System.out.print("\nNumero en radianes = ");
              num1 = r.nextDouble();
              System.out.println(m.tOps.toDegrees(num1));
              m.bOps.addToMemory(String.valueOf(m.tOps.toDegrees(num1)));
            }
          } else {
            System.out.print("\nNumero en radianes = ");
            num1 = r.nextDouble();
            System.out.println(m.tOps.toDegrees(num1));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.tOps.toDegrees(num1)));
            }
          }
        } else {
          System.out.print("\nNumero en radianes = ");
          num1 = r.nextDouble();
          System.out.println(m.tOps.toDegrees(num1));
        }
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
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar el argumento de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un argumento de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.println(m.mOps.log10(num1));
              m.bOps.addToMemory(String.valueOf(m.mOps.log10(num1)));
            }
            if (opt == 2) {
              System.out.print("\nArgumento = ");
              num1 = r.nextDouble();
              System.out.println(m.mOps.log10(num1));
              m.bOps.addToMemory(String.valueOf(m.mOps.log10(num1)));
            }
          } else {
            System.out.print("\nArgumento = ");
            num1 = r.nextDouble();
            System.out.println(m.mOps.log10(num1));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.mOps.log10(num1)));
            }
          }
        } else {
          System.out.print("\nNum = ");
          num1 = r.nextDouble();
          System.out.println(m.mOps.log10(num1));
        }
        break;

      case 20:
        if (oFlow == true) {
          if (centinel == true && oFlow == true) {
            System.out.println("\nDesea ingresar el argumento de la memoria?\n1. Si.\n2. No.\n");
            opt = r.nextInt();
            if (opt == 1) {
              System.out.println("\nElija un argumento de la lista para operar: \n");
              System.out.println(m.bOps.memoryToString());
              opt = r.nextInt();
              num1 = Double.parseDouble(m.bOps.getMemory(opt));
              System.out.println(m.mOps.ln(num1));
              m.bOps.addToMemory(String.valueOf(m.mOps.ln(num1)));
            }
            if (opt == 2) {
              System.out.print("\nArgumento = ");
              num1 = r.nextDouble();
              System.out.println(m.mOps.ln(num1));
              m.bOps.addToMemory(String.valueOf(m.mOps.ln(num1)));
            }
          } else {
            System.out.print("\nArgumento = ");
            num1 = r.nextDouble();
            System.out.println(m.mOps.ln(num1));
            if (centinel == false && oFlow == true) {
              m.bOps.addToMemory(String.valueOf(m.mOps.ln(num1)));
            }
          }
        } else {
          System.out.print("\nNum = ");
          num1 = r.nextDouble();
          System.out.println(m.mOps.ln(num1));
        }
        break;

      }

      System.out.println("\n1. Volver a la eleccion del modo de la calculadora.\n2. Apagar calculadora.\n");
      opt = r.nextInt();
      if (oFlow == true) {
        centinel = true;
      } else {
        centinel = false;
      }
    } while (opt == 1);

    System.out
        .println("\nCreated by Cristhian Camilo Gutierrez Cordoba\nInfo and cheaps services : kamneklogs@gmail.com :3");
    r.close();
  }

}