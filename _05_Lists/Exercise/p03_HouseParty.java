package L05Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>();

        for (int i = 1; i <= commandsCount; i++) {
            String check = scanner.nextLine();
            String name = check.split("\\s+")[0];

            if (check.contains("not")) {
                boolean ifcontains = guestList.contains(name);
                if (ifcontains) {
                    guestList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);

                }
            } else {
                boolean ifcontains = guestList.contains(name);
                if (ifcontains) {
                    System.out.printf("%s is already in the list!%n", name);

                } else {
                    guestList.add(name);
                }
            }
        }
        for (int i = 0; i <= guestList.size() - 1; i++) {
            System.out.println(guestList.get(i));
        }
    }
}
