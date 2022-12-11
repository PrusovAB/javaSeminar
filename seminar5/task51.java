import java.util.*;

public class task51 {

   public static void main(String[] args) {
      String[] str = { "Иван Иванов = +7 432 888 22 11 +7 433 234 11 22\n" };
      String[] str2 = { "Светлана Петрова = +7 542 44 22 +7 123 231 11 22\n" };
      String[] str3 = { "Анна Мусина = +7 745 431 44 33 + 7 542 123 44 11\n" };
      String[] str4 = { "Петр Лыков = +7 123 434 31 +7 222 111 21 22\n" };
      String[] str5 = { "Марина Лугова = +7 875 123 24 +7 222 223 25 11\n" };
      String[] str6 = { "Иван Ежов = +7 234 484 34 +7 832 113 23 11" };

      ArrayList<String> subscribers = new ArrayList<>(Arrays.asList(str));
      ArrayList<String> subscribers1 = new ArrayList<>(Arrays.asList(str2));
      ArrayList<String> subscribers2 = new ArrayList<>(Arrays.asList(str3));
      ArrayList<String> subscribers3 = new ArrayList<>(Arrays.asList(str4));
      ArrayList<String> subscribers4 = new ArrayList<>(Arrays.asList(str5));
      ArrayList<String> subscribers5 = new ArrayList<>(Arrays.asList(str6));

      HashMap<Integer, ArrayList<String>> name = new HashMap<>();
      name.putIfAbsent(1, subscribers);
      name.putIfAbsent(2, subscribers1);
      name.putIfAbsent(3, subscribers2);
      name.putIfAbsent(4, subscribers3);
      name.putIfAbsent(5, subscribers4);
      name.putIfAbsent(6, subscribers5);

      System.out.println(name);

   }
}
