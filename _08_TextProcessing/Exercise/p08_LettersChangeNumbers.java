package L08TextProcessing.Exercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");
        double totalSum = 0;

        int i = 0;
        while (i < inputArr.length) {
            String currentString = inputArr[i];

            char firstLetter = currentString.charAt(0);
            double number = Double.parseDouble(currentString.substring(1, currentString.length() - 1));
            char secondLetter = currentString.charAt(currentString.length()-1);

            if (Character.isUpperCase(firstLetter)) {
                number = number / (firstLetter - 64);
            } else if (Character.isLowerCase(firstLetter)) {
                number = number * (firstLetter - 96);
            }
            if (Character.isUpperCase(secondLetter)) {
                number = number - (secondLetter - 64);
            } else if (Character.isLowerCase(secondLetter)) {
                number = number + (secondLetter - 96);
            }
            totalSum += number;
            i++;
        }
        System.out.printf("%.2f", totalSum);
        //Буркавата преди числото:
        //         ако е главна делим числото на позицията на буквата в азбуката
        //         ако е малка умножаваме числото на позицията на буквата в азбуката
        //Буквата след числото:
        //         ако е главна изваждаме позицията на буквата в азбуката от числото
        //         ако е малка събираме позицията на буквата в азбуката с числото
        //събираме резултатите от манипулациите на всички стрингове
    }
}
