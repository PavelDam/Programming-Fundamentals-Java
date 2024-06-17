package L06ObjectsAndClasses.Exercise.P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String personInfo = scanner.nextLine();
            String[] personInfoArr = personInfo.split(" ");
            String name = personInfoArr[0];
            int age = Integer.parseInt(personInfoArr[1]);

            Person person = new Person(name, age);
            personList.add(person);
        }
        for (Person item : personList) {

            if (item.getAge() > 30) {
                System.out.println(item);
            }

        }
    }
}
