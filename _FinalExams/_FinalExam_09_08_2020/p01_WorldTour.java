package FinalExams.FinalExam09082020;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder modifiedString = new StringBuilder(stops);

        while (!input.equals("Travel")) {
            String[] commandArr = input.split(":");
            String command = commandArr[0];
            switch (command) {
                case "Add Stop":
                    //Команда: Add Stop:{index}:{string}
                    //         ако индекса {index} е валиден добавяме {string} на съответния индекс {index}
                    //         принтираме моментното състояние на стринга (stops)
                    int index = Integer.parseInt(commandArr[1]);
                    String string = commandArr[2];
                    if (index >= 0 && index <= stops.length() - 1) {
                        modifiedString.insert(index, string);
                        stops = modifiedString.toString();
                    }
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    //Команда: Remove Stop:{start_index}:{end_index}
                    //         ако и двата индекса са валидни премахваме елементите от {start_index} до {end_index} включително
                    //         принтираме моментното състояние на стринга (stops)
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);
                    if (startIndex >= 0 && endIndex <= stops.length() - 1) {
                        modifiedString.delete(startIndex, endIndex + 1);
                        stops = modifiedString.toString();

                    }
                    System.out.println(stops);
                    break;
                case "Switch":
                    //Команда: Switch:{old_string}:{new_string}
                    //         ако {old_string} се съдържа в (stops), заменяме всички съвпадения с {new_string}
                    //         принтираме моментното състояние на стринга (stops)
                    String oldString = commandArr[1];
                    String newString = commandArr[2];
                    if (stops.contains(oldString)) {
                        stops = stops.replace(oldString, newString);

                    }
                    System.out.println(stops);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
        //принтиреме: "Ready for world tour! Planned stops: {string}"
    }
}
