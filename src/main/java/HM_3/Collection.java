package HM_3;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        String[] words = new String[]{"Собака", "Машина", "Конь", "Шина", "Собака", "Машина", "Конь",
                "Шина", "Собака", "Машина", "Конь", "Шина", "Собака", "Машина", "Конь", "Шина",};
        Set<String> set = new HashSet<>(List.of(words));
        List<String> list = new ArrayList<>(List.of(words));
        for (String s : set) {
            System.out.println(s + ": " + Collections.frequency(list, s));
        }
        System.out.println(set);

        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.add("Луканин", "89621581010");
        telephoneBook.add("Кузнецов", "89621582828");
        telephoneBook.add("Луканин", "89621581020");
        telephoneBook.add("Лапшин", "89621582425");
        telephoneBook.add("Луканин", "89621582020");
        telephoneBook.get("Луканин");
    }
}

