import java.util.HashMap;
import java.util.Map;

public class task01 {
   public static void main(String[] args) {
      Map<String, String> params1 = new HashMap<>();

      params1.put("name", "Ivanov");
      params1.put("country", "Russia");
      params1.put("city", "Moscow");
      params1.put("age", null);

      System.out.println(getA(params1)); // Вывод на экран метода
   }

   public static String getA(Map<String, String> Serch) // метод поиска

   {
      StringBuilder s = new StringBuilder();
      for (Map.Entry<String, String> P : Serch.entrySet()) // Метод возвращает набор, имеющий те же элементы, что и
                                                           // хэш-карта.
      {
         if (P.getValue() != null) {
            s.append(P.getKey() + " = '" + P.getValue() + "' and ");
         }
      }
      s.delete(s.toString().length() - 5, s.toString().length());
      return s.toString();
   }

}