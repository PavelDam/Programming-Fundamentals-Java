package L03Arrays.Exercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum =0;
        for (int index = 0; index < n; index++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum +=currentNum;
            System.out.print(currentNum + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
