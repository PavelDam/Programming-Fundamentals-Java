package MidExams.MidExamRetake_07_2020;

import org.w3c.dom.html.HTMLTableCaptionElement;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals("End")) {
            int targetIndex = Integer.parseInt(input);

            if (targetIndex >= 0 && targetIndex <= targetsList.size() - 1) {

                if (targetsList.get(targetIndex) != -1) {
                    count++;
                    int targetElement = targetsList.get(targetIndex);
                    int target = -1;
                    targetsList.set(targetIndex, target);
                    for (int i = 0; i < targetsList.size(); i++) {
                        int element = targetsList.get(i);
                        if (element > targetElement && element != -1) {
                            element -= targetElement;
                            targetsList.set(i, element);
                        } else if (element <= targetElement && element != -1) {
                            element += targetElement;
                            targetsList.set(i, element);
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        System.out.print(targetsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
