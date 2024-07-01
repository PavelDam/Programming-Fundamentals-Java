package MidExams.MidExam05_07_2020;

import java.util.Arrays;
import java.util.Scanner;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("end")) {
            String[] commandArr = commandInput.split(" ");
            String command = commandArr[0];

            switch (command) {
                //1.swap {index1} {index2}- разменяме елементите на дадените индески
                case "swap":
                    int index1 = Integer.parseInt(commandArr[1]);
                    int index2 = Integer.parseInt(commandArr[2]);
                    //взимаме елемента на index1
                    int element1 = numArr[index1];
                    //взимаме елента на index2
                    int element2 = numArr[index2];
                    //заместваме element1 на numArr[index2]
                    numArr[index1] = element2;
                    //заместваме element2 на numArr[index1]
                    numArr[index2] = element1;
                    break;
                //2.multiply {index1} {index2}- умножаваме елементите на дадените индекси
                //                               и заместваме елемента на index1 с получения резултат
                case "multiply":
                    int multilyIndex1 = Integer.parseInt(commandArr[1]);
                    int multilyIndex2 = Integer.parseInt(commandArr[2]);
                    //взимаме елемента на index1
                    int multiply1 = numArr[multilyIndex1];
                    //взимаме елента на index2
                    int multiply2 = numArr[multilyIndex2];
                    //умножаваме елементите
                    int result = multiply1 * multiply2;
                    //заместваме multiply1 с result
                    numArr[multilyIndex1] = result;
                    break;
                //3.decrease - намаляваме елементите с 1.
                case "decrease":
                    for (int i = 0; i <= numArr.length - 1; i++) {
                        numArr[i]--;
                    }
                    break;
            }
            commandInput = scanner.nextLine();
        }
        for (int i = 0; i <= numArr.length - 1; i++) {
            if (i < numArr.length - 1) {
                System.out.print(numArr[i] + ", ");
            } else {
                System.out.print(numArr[i]);
            }
        }
    }
}
