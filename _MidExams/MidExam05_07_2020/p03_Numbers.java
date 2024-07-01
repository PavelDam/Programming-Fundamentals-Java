package MidExams.MidExam05_07_2020;

import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        double averageSum = 1.0 * numList.stream().mapToInt(Integer::intValue).sum() / numList.size();

        List<Integer> greaterNum = new ArrayList<>();
        int isGreater = 0;
        for (int i = 0; i <= numList.size() - 1; i++) {
            int currentNum = numList.get(i);

            if (currentNum > averageSum) {
                greaterNum.add(currentNum);
                isGreater++;
            }
        }
        greaterNum.sort(Collections.reverseOrder());
        if (isGreater < 5 && isGreater > 0) {
            String toPrint = greaterNum.toString().replaceAll("[]\\[,]", "").trim();
            toPrint = toPrint.replaceAll("\\s+", " ");
            System.out.println(toPrint);
        } else if (isGreater >= 5) {
            for (int i = 0; i <= 4; i++) {
                System.out.print(greaterNum.get(i) + " ");
            }
        } else if (isGreater == 0) {
            System.out.println("No");
        }
    }
}
