// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

class task {
   public static void main(String[] args) {
      Scanner newStr = new Scanner(System.in); //
      int n = newStr.nextInt();
      int s = 0;
      for (int i = 0; i <= n; i++) {
         s += i;
      }
      System.out.printf("наше число %d полученная сумма  = %d%n", n, s);
   }
}
