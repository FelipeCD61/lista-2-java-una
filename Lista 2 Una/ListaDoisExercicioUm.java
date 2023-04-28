import java.util.Scanner;
public class ListaDoisExercicioUm {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    
    System.out.printf("Digite o 1° número:");
    int numero1 = sc.nextInt();
    System.out.printf("Digite o 2° número:");
    int numero2 = sc.nextInt();
    System.out.printf("Digite o 3° número:");
    int numero3 = sc.nextInt();

    //Aqui coloquei uma linha divisória//
    System.out.println("--------------------------------");
    
    if ((numero1 > numero2) && (numero1 > numero3)) {
      System.out.printf("O número " + numero1 + " é o maior");
    } else if ((numero2 > numero1) && (numero2 > numero3)) {
      System.out.printf("O número " + numero2 + " é o maior");
    } else {
      System.out.printf("O número " + numero3 + " é o maior");
    }
    if ((numero1 < numero2) && (numero1 < numero3)) {
      System.out.printf("\nO número " + numero1 + " é o menor");
    }else if ((numero2 < numero1) && (numero2 < numero3)) {
      System.out.printf("\nO número " + numero2 + " é o menor");
    }else{
      System.out.printf("\nO número " + numero3 + " é o menor");
    }   

    double mediaAritmetica = ((numero1 + numero2 + numero3) / 3);
    System.out.printf("\nA média aritmética desses valores é: %.2f", mediaAritmetica);
    
      sc.close();
    }
}