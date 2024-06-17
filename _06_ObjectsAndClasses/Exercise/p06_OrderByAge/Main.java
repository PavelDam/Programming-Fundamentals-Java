package L06ObjectsAndClasses.Exercise.P06OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] personInfo = input.split(" ");
            String name = personInfo[0];
            String id = personInfo[1];
            int age = Integer.parseInt(personInfo[2]);

            Person person = new Person(name, id, age);
            personList.add(person);


            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for (Person item : personList) {
            System.out.println(item);
        }
    }
}
