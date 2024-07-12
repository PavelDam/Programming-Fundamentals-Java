package FinalExams.FinalExam04042020second;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawKey = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] commandsArr = input.split(">>>");
            String command = commandsArr[0];
            switch (command) {
                case "Contains":
                    String substring = commandsArr[1];
                    if (rawKey.contains(substring)) {
                        System.out.println(rawKey + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String charCase = commandsArr[1];
                    int startIndex = Integer.parseInt(commandsArr[2]);
                    int endIndex = Integer.parseInt(commandsArr[3]);
                    String sub = rawKey.substring(startIndex, endIndex);
                    if (charCase.equals("Upper")) {

                        rawKey = new StringBuilder(rawKey).replace(startIndex, endIndex, sub.toUpperCase()).toString();
                    } else if (charCase.equals("Lower")) {
                        rawKey = new StringBuilder(rawKey).replace(startIndex, endIndex, sub.toLowerCase()).toString();
                    }
                    System.out.println(rawKey);
                    break;
                case "Slice":
                    int startSliceIndex = Integer.parseInt(commandsArr[1]);
                    int endSliceIndex = Integer.parseInt(commandsArr[2]);
                    rawKey = new StringBuilder(rawKey).delete(startSliceIndex, endSliceIndex).toString();
                    System.out.println(rawKey);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",rawKey);
    }
}
