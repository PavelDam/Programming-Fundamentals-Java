package L05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (numbersList.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= numbersList.size() - 1) {
                int element = numbersList.get(index);

                sum += element;
                numbersList.remove(index);

                modifyList(numbersList, element);
            } else if (index < 0) {
                int firstElement = numbersList.get(0);

                sum += firstElement;
                numbersList.remove(0);

                int lastNumber = numbersList.get(numbersList.size()- 1) ;
                numbersList.add(0, lastNumber);
                modifyList(numbersList, firstElement);

            } else if (index > numbersList.size() - 1) {

                int lastElement = numbersList.get(numbersList.size()- 1) ;

                sum += lastElement;
                numbersList.remove(numbersList.size() - 1);

                int firstNumber = numbersList.get(0);
                numbersList.add(firstNumber);

                modifyList(numbersList, lastElement);
            }

        }
        System.out.println(sum);

    }

    private static void modifyList(List<Integer> numbersList, int element) {
        for (int i = 0; i <= numbersList.size() - 1; i++) {
            int currentNum = numbersList.get(i);

            if (currentNum <= element) {
                currentNum += element;
            } else {
                currentNum -= element;
            }
            numbersList.set(i, currentNum);
        }
    }
}
