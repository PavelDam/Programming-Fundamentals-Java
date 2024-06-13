package L05Lists.Bonus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03TakeSkipRope {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Прочитаме входа (String)
        List<String> inputList = new ArrayList<>(List.of(scanner.nextLine().split("")));

        //2.създаваме нов numbersList
        List<Integer> numbersList = new ArrayList<>();
        //3.итерираме по интексите на inputList
        for (int i = 0; i <= inputList.size() - 1; i++) {

            String isDigit = String.valueOf(inputList.get(i));
            char digitChar = isDigit.charAt(0);
            boolean check = Character.isDigit(digitChar);
            //4.записваме числата от inputList в numbersList
            if (check) {
                numbersList.add(Integer.valueOf(inputList.get(i)));
                //5.премахваме числото на дадения индекс в inputList
                inputList.remove(i);
                i--;
            }
        }
        //6.създаваме два листа takeList -> съдържа чистлата от numbersList на нечетни (odd) индекси и
        //                      skipList -> съдържа числата от numbersList на четни (even) индекси
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i <= numbersList.size() - 1; i++) {
            if (i % 2 == 0) {
                takeList.add(numbersList.get(i));
            } else {
                skipList.add(numbersList.get(i));
            }
        }
        //7.итерираме по двата масива с inputList:
        String take = "";
        String skip = "";


        for (int i = 0; i <= takeList.size() - 1; i++) {
            int charsToTake = takeList.get(i);
            int takeCharsCounter = 0;
            //цикъл за взимане на буквите от inputList
            for (int j = 0; j < charsToTake; j++) {
                //проверка ако са дадени повече букви от дължината на листа
                if (j == inputList.size()) {
                    break;
                }
                take += inputList.get(j);
                takeCharsCounter++;
            }
            //премахваме взетите букви от inputList
            if (takeCharsCounter != 0) {
                for (int j = takeCharsCounter - 1; j >= 0; j--) {
                    inputList.remove(j);
                    takeCharsCounter--;
                }
            }
            int charsToSkip = skipList.get(i);
            int skipCharCounter = 0;
            //цикъл за пропуснатите букви от inputList
            for (int j = 0; j < charsToSkip; j++) {
                //проверка ако са дадени повече букви от дължината на листа
                if (j == inputList.size()) {
                    break;
                }
                skip += inputList.get(j);
                skipCharCounter++;
            }
            //премахваме пропуснатите букви от inputList
            if (skipCharCounter != 0) {
                for (int j = skipCharCounter - 1; j >= 0; j--) {
                    inputList.remove(j);
                    skipCharCounter--;
                }
            }
        }
        //принтираме String take
        System.out.println(take);
    }
}
