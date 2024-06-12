package L05Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> scheduleList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] commandArr = command.split(":");

            switch (commandArr[0]) {
                case "Add":
                    String lessonAdd = commandArr[1];

                    if (!scheduleList.contains(lessonAdd)) {
                        scheduleList.add(lessonAdd);
                    }
                    break;
                case "Insert":
                    String lessonInsert = commandArr[1];
                    int indexInsert = Integer.parseInt(commandArr[2]);
                    if (!scheduleList.contains(lessonInsert)) {
                        scheduleList.add(indexInsert, lessonInsert);
                    }
                    break;
                case "Remove":
                    String lessonRemove = commandArr[1];
                    scheduleList.remove(lessonRemove);
                    scheduleList.removeIf(n -> n.contains(lessonRemove + "-Exercise"));
                    break;
                case "Swap":
                    String lessonSwap1 = commandArr[1];
                    String lessonSwap2 = commandArr[2];

                    if (scheduleList.contains(lessonSwap1) && scheduleList.contains(lessonSwap2)) {

                        int index1 = scheduleList.indexOf(lessonSwap1);
                        int index2 = scheduleList.indexOf(lessonSwap2);

                        Collections.swap(scheduleList, index1, index2);
                    }
                    if (scheduleList.contains(lessonSwap1 + "-Exercise") && scheduleList.contains(lessonSwap2 + "-Exercise")) {
                        int index1 = scheduleList.indexOf(lessonSwap1 + "-Exercise");
                        int index2 = scheduleList.indexOf(lessonSwap2 + "-Exercise");
                        Collections.swap(scheduleList, index1, index2);
                    }
                    exerciseSwap(scheduleList, lessonSwap1);
                    exerciseSwap(scheduleList, lessonSwap2);
                    break;
                case "Exercise":
                    String lessonExercise = commandArr[1];
                    if (scheduleList.contains(lessonExercise) && !scheduleList.contains(lessonExercise + "-Exercise")) {
                        int lessonIndex = scheduleList.indexOf(lessonExercise);
                        scheduleList.add(lessonIndex + 1, lessonExercise + "-Exercise");
                    }
                    if (!scheduleList.contains(lessonExercise) && !scheduleList.contains(lessonExercise + "-Exercise")) {
                        scheduleList.add(lessonExercise);
                        scheduleList.add(lessonExercise + "-Exercise");
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i <= scheduleList.size() - 1; i++) {
            System.out.printf("%d.%s%n", i + 1, scheduleList.get(i));
        }
    }

    private static void exerciseSwap(List<String> scheduleList, String lessonSwap1) {
        if (scheduleList.contains(lessonSwap1 + "-Exercise")) {
            int exerciseSwapIndex1 = scheduleList.indexOf(lessonSwap1 + "-Exercise");
            int lessonIndex = scheduleList.indexOf(lessonSwap1);
            String exerciseSwap1 = scheduleList.get(exerciseSwapIndex1);
            scheduleList.remove(exerciseSwapIndex1);
            scheduleList.add(lessonIndex + 1, exerciseSwap1);
        }
    }
}
