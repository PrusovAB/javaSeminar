// Вывести все простые числа от 1 до 1000

public class task2 {
   public static void main(String[] args) {
      System.out.println("Простые числа от 0 до 1000");
      int i, j;
      for (i = 2; i < 1000; i++) {
         int u = 0;
         for (j = 2; j < 1000; j++) {
            if ((i % j) == 0)
               u++;
         }
         if (u < 2)
            System.out.printf(" %d ", i);
      }
   }
}
