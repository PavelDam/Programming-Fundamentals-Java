package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            switch (commandArray[0]) {
                case "swap":
                    //намираме индексите
                    int index1 = Integer.parseInt(commandArray[1]);
                    int index2 = Integer.parseInt(commandArray[2]);
                    //намираме елементите на дадените индекси
                    int element1 = numbersArray[index1];
                    int element2 = numbersArray[index2];
                    //разменяме елементите
                    numbersArray[index1] = element2;
                    numbersArray[index2] = element1;
                    break;
                case "multiply":
                    //взимаме елементите на съответните индекси
                    int multiplyIndex1 = Integer.parseInt(commandArray[1]);
                    int multiplyIndex2 = Integer.parseInt(commandArray[2]);
                    //намираме елементите на дадените индекси
                    int multiplyElement1 = numbersArray[multiplyIndex1];
                    int multiplyElement2 = numbersArray[multiplyIndex2];
                    //умножаваме елементите
                    int multiplySum = multiplyElement1 * multiplyElement2;
                    //заместваме елемента на multiplyIndex1 от масива с получената сума
                    numbersArray[multiplyIndex1] = multiplySum;
                    break;
                case "decrease":
                    //намаляваме стойноста на всеки елемент в масива с 1
                    for (int index = 0; index < numbersArray.length; index++) {
                        numbersArray[index] -= 1;
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i <= numbersArray.length - 1; i++) {
            if (i != numbersArray.length - 1) {
                System.out.print(numbersArray[i] + ", ");
            } else {
                System.out.print(numbersArray[i]);
            }
        }
    }
}
