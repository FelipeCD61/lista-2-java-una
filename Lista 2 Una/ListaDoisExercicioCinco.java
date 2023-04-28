import java.util.Scanner;
public class ListaDoisExercicioCinco {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

    System.out.printf("Digite o primeiro número: ");
    double numero1 = sc.nextDouble();
    System.out.printf("Digite o segundo número: ");
    double numero2 = sc.nextDouble();
    
    System.out.println("\nDigite a operação que desja realizar de acordo com a tabela a baixo:\n + | Soma\n - | Subtração\n * | Multiplicação\n / | Divisão\n ^ | Potenciação\n-------------------------------------");
    //Coloquei uma linha divisória para organização
    String operation = sc.next();

    if (operation.equals("+")) {
      System.out.printf(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
    } else if (operation.equals("-")) {
      System.out.printf(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
    } else if (operation.equals("*")) {
      System.out.printf(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
    } else if (operation.equals("/")) {
      System.out.printf(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
    } else if (operation.equals("^")) {
      System.out.printf(numero1 + " ^ " + numero2 + " = " + Math.pow(numero1, numero2));
    } else {
      System.out.println("Operação inválida, digite novamente.");
    }

    sc.close();
  }
}