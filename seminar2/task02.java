import java.util.logging.*;
import java.io.File;
import java.util.Random;
import java.util.random.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_2 {
   public static void insertionSort(int[] sortirov) {
      int j;

      for (int i = 1; i < sortirov.length; i++) {

         int swap = sortirov[i];
         for (j = i; j > 0 && swap < sortirov[j - 1]; j--) {

            sortirov[j] = sortirov[j - 1];
         }
         sortirov[j] = swap;
      }
   }

   public static void main(String args[]) throws IOException {
            Logger logger = Logger.getLogger(task_2.class.getName()); //создаем logger
            FileHandler ar = new FileHandler("logTask2.log", true); 
            logger.addHandler(ar);
            SimpleFormatter sFormat = new SimpleFormatter();
            ar.setFormatter(sFormat);
            Random random = new Random();
            int[] sortirov = random.int(100, 50, 100).toArray();

            insertionSort(sortirov);
            for (int i = 0; i < sortirov.length; i++) {
                {
                    System.out.printf("Отсортированный массив: %d \n", sortirov[i]);
                    logger.log(Level.INFO, String.valueOf(sortirov[i]) + " " + Arrays.toString(sortirov));

                }
            }
        }
}