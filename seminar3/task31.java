import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task31 {

   public static void merge(int[] arr, int[] aux, int low, int mid, int high) {
      int k = low, i = low, j = mid + 1;

      while (i <= mid && j <= high) {
         if (arr[i] <= arr[j]) {
            aux[k++] = arr[i++];
         } else {
            aux[k++] = arr[j++];
         }
      }
      while (i <= mid) {
         aux[k++] = arr[i++];
      }

      for (i = low; i <= high; i++) {
         arr[i] = aux[i];
      }
   }

   public static void mergesort(int[] arr, int[] aux, int low, int high) {
      if (high == low) {
         return;
      }

      int mid = (low + ((high - low) >> 1));

      mergesort(arr, aux, low, mid);
      mergesort(arr, aux, mid + 1, high);

      merge(arr, aux, low, mid, high);
   }

   public static void main(String[] args) {
      Logger logger = Logger.getInstance();

      int[] arr = RANDOM();

      int[] aux = Arrays.copyOf(arr, arr.length);

      mergesort(arr, aux, 0, arr.length - 1);
      System.out.printf("Отсортированный массив: %s ", Arrays.toString(arr));

   }

   private static int[] RANDOM() {// метод рандома
      int[] arr = new int[20];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = ((int) (Math.random() * 31) - 15);
      }
      return arr;
   }

   public class Logger {
      private static Logger logger;

      private Logger() {
      }

      public static Logger getInstance() {
         // ...
         return null;
      }
   }

   public class Filter {
      protected int treshold;

      public Filter(int treshold) {
         this.treshold = treshold;
      }

      public List<Integer> filterOut(List<Integer> source) {
         Logger logger = Logger.getInstance();
         List<Integer> result = new ArrayList<>();
         // ..
         return result;
      }
   }

}
