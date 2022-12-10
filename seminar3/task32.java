import java.util.*;
import java.util.function.Predicate;

public class task32 {

   public static void main(String[] args) {

      int[] arr = RANDOM();

      List arre = new ArrayList<>();// init
      Arrays.asList(arr);
      System.out.println("Произвольный список: " + Arrays.toString(arr));
      arre.add(arr);

      for (int i = 0; i < arre.size(); i++) {
         int even = (int) arre.get(i) % 2;

         if (even == 0) {
            System.out.println("This is Even Number:" + arre.get(i));
            arre.remove(i);
            i--;
         }
      }
   }

   private static int[] RANDOM() {
      int[] arr = new int[20];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = ((int) (Math.random() * 31) - 0);
      }
      return arr;
   }
}