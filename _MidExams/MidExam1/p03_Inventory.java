package MidExams.MidExam1;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] commandArr = command.split(" - ");

            switch (commandArr[0]) {
                //"Collect - {item}" - you should add the given item to your inventory.
                //                       If the item already exists, you should skip this line.
                case "Collect":
                    String collectItem = commandArr[1];
                    if (!inputList.contains(collectItem)) {
                        inputList.add(collectItem);
                    }
                    break;
                //"Drop - {item}" - you should remove the item from your inventory if it exists.
                case "Drop":
                    String dropItem = commandArr[1];
                    inputList.remove(dropItem);
                    break;
                //"Combine Items - {old_item}:{new_item}" - you should check if the old item exists.
                //                  If so, add the new item after the old one. Otherwise, ignore the command.
                case "Combine Items":
                    String[] combineArr = commandArr[1].split(":");
                    String oldItem = combineArr[0];
                    String newItem = combineArr[1];
                    if (inputList.contains(oldItem)) {
                        int oldIndex = inputList.indexOf(oldItem);
                        inputList.add(oldIndex + 1, newItem);
                    }
                    break;
                //•	"Renew – {item}" – if the given item exists,
                //                     you should change its position and put it last in your inventory.
                case "Renew":
                    String renewItem = commandArr[1];
                    if (inputList.contains(renewItem)) {
                        inputList.remove(renewItem);
                        inputList.add(renewItem);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\]]", ""));
    }
}
