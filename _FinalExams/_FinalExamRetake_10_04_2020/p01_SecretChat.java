package FinalExams.FinalExamRetake10042020;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder(inputMessage);

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] inputArr = input.split(":\\|:");
            String command = inputArr[0];
            switch (command) {
                case "InsertSpace":
                    //Команда: InsertSpace:|:{index} - добавяме единичен спейс на дадения индекс
                    int index = Integer.parseInt(inputArr[1]);
                    message.insert(index, " ");
                    inputMessage = message.toString();
                    System.out.println(inputMessage);
                    break;
                case "Reverse":
                    //Команда: Reverse:|:{substring} -
                    //         ако стринга съдържа {substring} - взимаме {substring}, премахваме го от стринга,
                    //         обръщаме го и го добавяме в края на стринга
                    //         ако не се съдържа принтираме: "error"
                    //         заменяме само първото съвпадение на {substring} ако има повече от едно
                    String reverseString = inputArr[1];
                    if (inputMessage.contains(reverseString)) {
                        StringBuilder reverse = new StringBuilder(reverseString);
                        int firstIndexOf = inputMessage.indexOf(reverseString);
                        message.delete(firstIndexOf, firstIndexOf + reverseString.length());
                        message.append(reverse.reverse());
                        inputMessage = message.toString();
                        System.out.println(inputMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    //Команда: ChangeAll:|:{substring}:|:{replacement}
                    //            - заменяме всички съвпадения {substring} на дадения стринг с {replacement}
                    String subString = inputArr[1];
                    String replacement = inputArr[2];
                    inputMessage = inputMessage.replace(subString, replacement);
                    message = new StringBuilder(inputMessage);
                    System.out.println(inputMessage);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",inputMessage);
    }
}
