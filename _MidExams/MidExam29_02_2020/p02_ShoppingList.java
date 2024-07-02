package MidExams.MidExam29_02_2020;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Go Shopping!")) {
            String[] commandArr = commandInput.split(" ");
            String command = commandArr[0];
            switch (command) {
                //1.Urgent {item}-слагаме add елемента в началото на листа.Ако има такъв елемент пропускаме командата
                case "Urgent":
                    String itemUr = commandArr[1];
                    if (!productList.contains(itemUr)) {
                        productList.add(0, itemUr);
                    }
                    break;
                //2.Unnecessary {item}- изтриваме елемента с това име ако е в списъка,ако не пропускаме командата
                case "Unnecessary":
                    String itemUnn = commandArr[1];
                    productList.remove(itemUnn);
                    break;
                //3.Correct {oldItem} {newItem}-ako има елемента с име{oldItem} го заменяме с {newItem},ако го няма пропускаме командата
                case "Correct":
                    String oldItem = commandArr[1];
                    String newItem = commandArr[2];

                    if (productList.contains(oldItem)) {
                        int index = productList.indexOf(oldItem);
                        productList.set(index, newItem);
                    }
                    break;
                //4.Rearrange {item}-ако има елемент с име{item} премахваме елемента от индеска му и го слагаме в края на листа,
                //                   ако няма такъв елемент пропускаме командата
                case "Rearrange":
                    String itemRear = commandArr[1];
                    if (productList.contains(itemRear)) {
                        productList.remove(itemRear);
                        productList.add(itemRear);
                    }
                    break;
            }
            commandInput = scanner.nextLine();
        }
        System.out.println(productList.toString().replaceAll("[\\[\\]]", ""));
    }
}
