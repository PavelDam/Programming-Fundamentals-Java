package FinalExams.FinalExamRetake15082020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();

        StringBuilder messageManipulation = new StringBuilder(encryptedMessage);
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String command = input.split("\\|")[0];


            switch (command) {
                case "Move":
                    //Команда: Move {number of letters} - преместваме първите n на брой букви {number of letters} в края на стринга
                    int numberOfLetters = Integer.parseInt(input.split("\\|")[1]);
                    for (int i = 0; i < numberOfLetters; i++) {
                        messageManipulation.append(messageManipulation.charAt(i));

                    }
                    messageManipulation.delete(0, numberOfLetters);
                    encryptedMessage = String.valueOf(messageManipulation);

                    break;
                case "Insert":
                    //Команда: Insert {index} {value} - добавяме {value} преди дадения индекс {index}
                    int index = Integer.parseInt(input.split("\\|")[1]);
                    String value = input.split("\\|")[2];
                    messageManipulation.insert(index, value);
                    encryptedMessage = String.valueOf(messageManipulation);

                    break;
                case "ChangeAll":
                    //Команда: ChangeAll {substring} {replacement} - променяме всички съвпадения на дадения {substring} с {replacement}
                    String subString = input.split("\\|")[1];
                    String replacement = input.split("\\|")[2];
                    encryptedMessage = encryptedMessage.replace(subString, replacement);
                    messageManipulation = new StringBuilder(encryptedMessage);

                    break;
            }


            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", messageManipulation);

    }
}
