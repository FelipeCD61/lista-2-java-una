import java.util.Scanner;
public class ListaDoisExercicioQuatro {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    double perimetro, area, volume;
    double pi = 3.14159;

    System.out.printf("1- Calcular e imprimir o perímetro do círculo. \n2- Calcular e imprimir a área do círculo. \n3- Calcular e imprimir o volume da esfera.\nEscolha a operação de acordo com as opções acima: ");
    int operation = sc.nextInt();
    System.out.printf("Digite o raio de um círculo ou esfera: ");
    double raio = sc.nextDouble();

    System.out.println("----------------------------------");//Aqui coloquei uma linha divisória

    switch (operation) {
      case 1:
        perimetro = 2 * pi * raio;
      System.out.printf("O perímetro do círculo é %.2f", perimetro);
      break;
      case 2:
        area = pi * Math.pow(raio,2);
      System.out.printf("A area do círculo é %.2f", area);
      break;
      case 3:
        volume = (4 * pi * Math.pow(raio,3)) / 3;
      System.out.printf("O volume da esfera é %.2f", volume);
      break;
      default:
        System.out.println("Digito inválido, digite um dos números correspondentes a uma das operações");
      
    }
        
          
    sc.close();
  }
}
