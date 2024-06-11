package L05Lists.Lab;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");

            switch (commandArr[0]) {
                case "Add":
                    int numberAdd = Integer.parseInt(commandArr[1]);
                    inputList.add(numberAdd);
                    break;
                case "Remove":
                    int numberRemove = Integer.parseInt(commandArr[1]);
                    inputList.remove(Integer.valueOf(numberRemove));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(commandArr[1]);
                    inputList.remove(index);
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(commandArr[1]);
                    int indexInsert = Integer.parseInt(commandArr[2]);
                    inputList.add(indexInsert, numberInsert);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }
}
