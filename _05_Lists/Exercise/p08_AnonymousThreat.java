package L05Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.прочитаме входа
        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        //2.прочитаме командите:
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] commandArr = command.split("\\s+");
            //•	merge {startIndex} {endIndex}-конкатенираме елементите от стартовия до крайния даден индекс
            //!!!ако някой от дадените индекси е извън обхвата на листа взимаме само тези в обхват
            if (command.contains("merge")) {
                Merge(inputList, commandArr);

                //•	divide {index} {partitions}-разделяме елемента на дадения индекс на няколко порции с еднаква дължина.
                //ако не може да бъдат разделени на равни порции приравняваме всички освен последната,която остава най дълга.
            } else if (command.contains("divide")) {
                Divide(inputList, commandArr);
            }

            command = scanner.nextLine();
        }
        //4.принтираме резултата с " ";
        for (String item : inputList) {
            System.out.print(item + " ");
        }
    }

    public static void Divide(List<String> inputList, String[] commandArr) {
        int index = Integer.parseInt(commandArr[1]);
        int partitions = Integer.parseInt(commandArr[2]);

        String element = inputList.get(index);
        List<String> dividedElementList = new ArrayList<>();

        if (element.length() % partitions == 0) {
            int elementCount = 0;
            int portionLength = element.length() / partitions;

            for (int i = 0; i < partitions; i++) {
                String concat = "";
                for (int j = 0; j < portionLength; j++) {
                    char symbol = element.charAt(elementCount);
                    concat += symbol;
                    elementCount++;
                }
                dividedElementList.add(concat);
            }
        } else {
            int portionLength = element.length() / partitions;
            int count = 0;
            for (int i = 0; i < partitions; i++) {
                String concat = "";

                if (i == partitions - 1) {
                    for (int j = count; j < element.length(); j++) {
                        char symbol = element.charAt(count);
                        concat += symbol;
                        count++;
                    }
                } else {
                    for (int j = 0; j < portionLength; j++) {
                        char symbol = element.charAt(count);
                        concat += symbol;
                        count++;
                    }
                }
                dividedElementList.add(concat);
            }
        }
        inputList.remove(index);
        inputList.addAll(index, dividedElementList);
    }


    public static void Merge(List<String> inputList, String[] commandArr) {
        int startIndex = Integer.parseInt(commandArr[1]);
        int endIndex = Integer.parseInt(commandArr[2]);

        if (startIndex < 0) {
            startIndex = 0;
        }
        if (endIndex > inputList.size() - 1) {
            endIndex = inputList.size() - 1;
        }
        int counter = startIndex;

        for (int i = startIndex; i < endIndex; i++) {
            String concat = inputList.get(counter) + inputList.get(counter + 1);
            inputList.set(counter, concat);
            inputList.remove(counter + 1);

        }
    }
}
