import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task33 {
   public static void main(String[] args) {

      List<Integer> number = new ArrayList<>();

      Logger logger = Logger.getLogger(HomeWork_1.class.getName());// init log
      FileHandler fh = null; // создаем log
      try {
         fh = new FileHandler("logTask_3.log", true);
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
      logger.addHandler(fh);
      SimpleFormatter log = new SimpleFormatter();
      fh.setFormatter(log);

      number.add(11);
      number.add(45);
      number.add(12);
      number.add(32);
      number.add(36);
      number.add(36);
      number.add(63);
      number.add(38);
      number.add(87);
      number.add(88);
      number.add(99);
      System.out.printf("список %s\n", number);
      logger.info(Arrays.toString(new List[] { number }));

      int max = Collections.max(number);// максимально число
      System.out.printf("Максимальное число: %s\n", max);

      logger.info(Arrays.toString(new int[] { max }));

      int min = Collections.min(number);
      System.out.printf("Минимальное число: %s\n", min);
      logger.info(Arrays.toString(new int[] { min }));

      int sum = extracted(number);
      System.out.printf("Сумма чисел: %s\n", sum);
      logger.info(Arrays.toString(new int[] { sum }));

      int mid = extracted(number) / 2;
      System.out.printf("Средняя сумма: %s\n", mid);
      logger.info(Arrays.toString(new int[] { mid }));

   }

   private static int extracted(List<Integer> number) {
      int sum = 0;
      for (int i = 0; i < number.size(); i++) {
         sum += number.get(i);
      }
      return sum;
   }
}