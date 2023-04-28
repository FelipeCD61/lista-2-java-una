import java.util.Scanner;
public class ListaDoisExercicioDois {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int troco;

    System.out.printf("Digite o valor da compra:");
    int compra = sc.nextInt();
    System.out.printf("Digite o valor pago:");
    int pago = sc.nextInt();
   
    troco = pago-compra;

    //Aqui criei um contador para cada nota
    int nota50 = 0;
    int nota20 = 0;
    int nota10 = 0;
    int nota5 = 0;
    int nota2 = 0;
    int nota1 = 0;

    while (troco >= 50) {
      troco -= 50;
      nota50 ++;
      }
    System.out.printf("\nNotas de R$ 50,00: %d", nota50);
    while (troco >= 20) {
      troco -=20;
      nota20 ++;
      }
    System.out.printf("\nNotas de R$ 20,00: %d", nota20);
    while (troco >= 10) {
      troco -=10;
      nota10 ++;
      }
    System.out.printf("\nNotas de R$ 10,00: %d", nota10);
    while (troco >= 5) {
      troco -=5;
      nota5 ++;
      }
    System.out.printf("\nNotas de R$ 5,00: %d", nota5);
    while (troco >= 2) {
      troco -=2;
      nota2 ++;
      }
    System.out.printf("\nNotas de R$ 2,00: %d", nota2);
    while (troco >= 1) {
      troco -=1;
      nota1 ++;
      }
    System.out.printf("\nNotas de R$ 1,00: %d", nota1);

    if (compra > pago)
      System.out.println("\n\nA quantia paga é insuficiente para realizar a compra.");

    sc.close();
  }
}