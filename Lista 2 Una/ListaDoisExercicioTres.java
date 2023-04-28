import java.util.Scanner;
public class ListaDoisExercicioTres {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    /* Criei as variaveis:
    * X1 para equação de 1° grau exigida na letra B;
    * X2 para equação de 2° grau com discriminante = 0;
    * Xx1 para a primeira raiz da equação de 2° grau com discriminante diferente de 0;
    * Xx2 para a segunda raiz da equação de 2° grau com discriminante diferente de 0;  
    * 'delta' para calcular o discriminante.
    */
    double X1, X2, Xx1, Xx2, delta;

    System.out.println("Digite uma equação de 2° grau:\n Ax^2 * Bx * C = 0");

    System.out.print("\nDigite o coeficiente A: ");
    double A = sc.nextDouble();
    System.out.print("Digite o coeficiente B: ");
    double B = sc.nextDouble();
    System.out.print("Digite o coeficiente C: ");
    double C = sc.nextDouble();

    //Aqui calculo o discriminante:
    delta = (B * B) - (4 * A * C);

    //Aqui coloquei uma linha divisória
    System.out.println("-----------------------------------------------");

    if (A == 0 && B == 0) {
      System.out.println("Coeficientes informados incorretamente!");
    } else if (A == 0 && B != 0) {
      System.out.println("Essa é uma equação de primeiro grau.");
      X1 = - C / B;
      //Aqui eu fiz a operação de 1° grau.
      System.out.printf("O resultado da equação é %.2f ", X1);
    } else if (delta < 0 ) {
      System.out.println("Esta equação não possui raízes reais.");
    } else if (delta == 0 ) {
      System.out.println("Esta equação possui duas raízes reais iguais.");
      X2 = - B / 2 * A; //Aqui eu fiz a operação de 2° grau para delta = 0.
      System.out.printf("\nO resultado da equação é %.2f ", X2);
    } else if (delta > 0 ) {
    System.out.println("Esta equação possui duas raízes reais diferentes.");
      Xx1 = (- B + Math.sqrt(delta)) / 2 * A;
      Xx2 = (- B - Math.sqrt(delta)) / 2 * A;
      System.out.printf("\nO resultado da 1° raiz dessa equação é %.2f e o resultado da 2° raiz é %.2f", Xx1, Xx2);
    } else {
      System.out.println("ERROR");
    } 
            
    sc.close();
  }
}