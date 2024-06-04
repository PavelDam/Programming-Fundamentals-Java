package L03Arrays.Bonus;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int []indexesWithBugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")){


            command= scanner.nextLine();
        }
    }
}
