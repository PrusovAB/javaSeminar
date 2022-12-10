
// Реализовать простой калькулятор (операции + - / * )
import java.util.Scanner;

public class task3 {
   public static void main(String[] args) {
      System.out.println("Что мы будем делать?");
      System.out.println("1 - Сложение");
      System.out.println("2 - Разница");
      System.out.println("3 - Деление");
      System.out.println("4 - Умножение");
      Scanner newstr = new Scanner(System.in);
      System.out.print("Отлично! давай начнем : ");
      int vibor = newstr.nextInt();
      System.out.print("Введите первое число : ");
      int x = newstr.nextInt();
      System.out.print("Введите второе число : ");
      int y = newstr.nextInt();
      int c = 0;

      switch (vibor) {
         case 1:
            c = x + y;
            System.out.printf("Ответ %d", c);
            break;

         case 2:
            c = x - y;
            System.out.printf("Ответ %d", c);
            break;

         case 3:
            c = x / y;
            System.out.printf("Ответ %d", c);
            break;

         case 4:
            c = x * y;
            System.out.printf("Ответ %d", c);
            break;
      }
   }
}
