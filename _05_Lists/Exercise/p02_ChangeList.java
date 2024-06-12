package L05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            //1.команда Delete {element} -изтриваме всички елементи с тази стойност от листа
            if (command.contains("Delete")) {
                int elementToDelete = Integer.parseInt(command.split("\\s+")[1]);
                list.removeAll(Arrays.asList(elementToDelete));
            } else if (command.contains("Insert")) {
                //2.команда Insert {element} {position}- сетваме елемента на дадената позиция(индекс)
                int element = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                list.add(index, element);
            }
            command = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));

    }
}
