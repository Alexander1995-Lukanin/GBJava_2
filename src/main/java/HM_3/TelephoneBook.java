package HM_3;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {
    private static List<String> families = new ArrayList<>();
    private static List<String> telephones = new ArrayList<>();

    public void add(String familie, String telephon) {
        families.add(familie);
        telephones.add(telephon);

    }

    public void get(String familie) {
        for (int i = 0; i < families.size(); i++) {
            if (families.get(i).equals(familie)) {
                System.out.println(families.get(i));
                System.out.println(telephones.get(i));
            } else continue;
        }
    }
}

