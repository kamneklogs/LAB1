package ui;
import model.*;
import java.util.Scanner;

public class Calculator {

  
  static int opt, optMenu;
  static Scanner r = new Scanner(System.in);
  private BasicOps bOps;

  public Calculator() {
    bOps = new BasicOps();
  }

  public static void main(String[] args) {
    optMenu = o;
    System.out
        .println("**********************************************************************************************");
    System.out
        .println("|                                  CAMILO'S CALCULATOR VERSION 1.9                           |");
    System.out
        .println("**********************************************************************************************\n");
    do{
      System.out.println(
        "Opciones:\n1. Suma2. Resta.\n3. División.\n4. Multiplicación.\n5. Módulo.\n6. Seno.\n7. Coseno.\n8. Tangente.\n9. Logaritmo base 10 y base n.\n10. Raíz cuadrada.\n11. Raíz n-ésima.\n12. Potenciación.\n13. Base 10 de un número x.\n14. Memoria de los resultados de las últimas 10 operaciones. (Estos resultados pueden ser usados en la operación actual del usuario). \n15. El factorial de un número.\n16. La conversión de grados a radianes y viceversa.\n17. La conversión entre binarios, decimales y hexadecimales.");
    opt = r.nextInt();
    switch(opt){
      case 1:
        
      break;
    }
    }while(optMenu == 0);
  }

  

  

}