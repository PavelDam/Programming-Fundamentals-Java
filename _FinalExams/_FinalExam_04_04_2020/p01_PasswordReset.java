package FinalExams.FinalExam04042020;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String input = scanner.nextLine();


        while (!input.equals("Done")) {
            String[] commandArr = input.split("\\s+");
            String command = input.split("\\s+")[0];

            switch (command) {

                case "TakeOdd":
                    //Команда: TakeOdd - взимаме символите на нечетните позиции и ги конкатенираме в new raw password и принтираме
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 1; i < password.length(); i += 2) {
                        newPassword.append(password.charAt(i));
                    }
                    password = newPassword.toString();
                    System.out.println(password);
                    break;
                case "Cut":
                    //Команда: Cut {index} {length} - взимаме стринга с начало {index} и дължина {length}
                    int start = Integer.parseInt(commandArr[1]);
                    int end = start + Integer.parseInt(commandArr[2]);
                    password = new StringBuilder(password).delete(start, end).toString();
                    System.out.println(password);
                    break;
                case "Substitute":
                    //Команда: Substitute {substring} {substitute} -
                    // ако паролата съдържа {substring} заменяме всички съвпадения с {substitute}
                    String target = commandArr[1];
                    String replacement = commandArr[2];
                    if (password.contains(target)) {
                        password = password.replace(target, replacement);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }
}
