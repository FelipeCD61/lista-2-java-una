import java.util.Random;
import java.util.Scanner;

public class ListaDoisExercicioSeis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random generator = new Random();
    int parimpar;
    int random = 0;

    System.out.printf("Digite o 1° número: ");
    int numero1 = sc.nextInt();
    System.out.printf("Digite o 2° número: ");
    int numero2 = sc.nextInt();

    if (numero1 > numero2) {
      random = generator.nextInt(numero2, numero1 + 1);
      System.out.printf("Número sorteado: " + random);
      
      parimpar = random % 2;//Aqui é verificado se o número sorteado é par ou ímpar

      if (parimpar == 0)
        System.out.println("\nO número sorteado é par.");
      else
        System.out.println("\nO número sorteado é ímpar.");
      
    } else if (numero2 > numero1) {
      random = generator.nextInt(numero1, numero2 + 1);
      System.out.printf("Número sorteado: " + random);
      
      parimpar = random % 2;//Aqui é verificado se o número sorteado é par ou ímpar

      if (parimpar == 0)
        System.out.println("\nO número sorteado é par.");
      else
        System.out.println("\nO número sorteado é ímpar.");
      
    } else {
      System.out.println("\nNão é possível realizar o sorteio com dois números iguais.");
    }

    sc.close();
  }
}