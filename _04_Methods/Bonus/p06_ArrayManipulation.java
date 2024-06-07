package L04Methods.Bonus;

import java.util.Arrays;
import java.util.Scanner;

public class P06ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            String[] commandArr = commands.split(" ");

            //команда : exchange {index} -> разделя масива на две (след индеска и до него) и им разменя местата
            //ако индекса е извън обхвата на масива печатаме "Invalid index"
            if ("exchange".equals(commandArr[0])) {
                int exIndex = Integer.parseInt(commandArr[1]);
                //проверка дали индеска е извън обхвата на масива
                if (exIndex > inputArr.length - 1) {
                    System.out.println("Invalid index");
                    commands = scanner.nextLine();
                    continue;

                } else {
                    int[] leftArr = new int[exIndex + 1];
                    int[] rightArr = new int[inputArr.length - 1 - exIndex];

                    for (int i = 0; i <= exIndex; i++) {
                        leftArr[i] = inputArr[i];
                    }
                    for (int i = 1; i <= rightArr.length; i++) {
                        rightArr[i - 1] = inputArr[exIndex + i];
                    }
                    int[] combined = new int[rightArr.length + leftArr.length];
                    System.arraycopy(rightArr, 0, combined, 0, rightArr.length);
                    System.arraycopy(leftArr, 0, combined, rightArr.length, leftArr.length);
                    inputArr = combined;
                }
            }
            //команда : max even/odd -> връща номера на индекса на най-голямото четно/неяетно число
            //ако има два или повече еднакви елемента връщаме индекса на най-десния елемент
            //ако неможе да бъде намерено такова число печатаме "No matches"

            if (commandArr[0].equals("max")) {
                if (commandArr[1].equals("even")) {
                    int largestEven = Integer.MIN_VALUE;
                    int maxEvenIndex = 0;
                    for (int i = 0; i < inputArr.length; i++) {
                        // прескачаме ако числото е нечетно
                        if (inputArr[i] % 2 == 1) {
                            continue;
                        }
                        // проверяваме четните числа
                        if (inputArr[i] > largestEven) {
                            // подновяваме текущата стойност
                            largestEven = inputArr[i];
                            maxEvenIndex = i;
                        }
                    }
                    if (largestEven == Integer.MIN_VALUE) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(maxEvenIndex);
                    }
                } else if (commandArr[1].equals("odd")) {
                    int largestOdd = Integer.MIN_VALUE;
                    int maxOddIndex = 0;
                    for (int i = 0; i < inputArr.length; i++) {
                        if (inputArr[i] % 2 == 0) {
                            continue;
                        }
                        if (inputArr[i] > largestOdd) {
                            largestOdd = inputArr[i];
                            maxOddIndex = i;
                        }
                    }
                    if (largestOdd == Integer.MIN_VALUE) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(maxOddIndex);
                    }
                }
            }
            if (commandArr[0].equals("min")) {
                if (commandArr[1].equals("even")) {
                    int smallestEven = Integer.MAX_VALUE;
                    int minEvenIndex = 0;
                    for (int i = 0; i < inputArr.length; i++) {
                        // Skip number if odd
                        if (inputArr[i] % 2 == 1) {
                            continue;
                        }
                        // Now we only consider and collect even numbers
                        if (inputArr[i] < smallestEven) {
                            // Update the current guess
                            smallestEven = inputArr[i];
                            minEvenIndex = i;

                        }
                    }
                    if (smallestEven == Integer.MAX_VALUE) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(minEvenIndex);
                    }
                } else if (commandArr[1].equals("odd")) {
                    int smallestOdd = Integer.MAX_VALUE;
                    int minOddIndex = 0;
                    for (int i = 0; i < inputArr.length; i++) {
                        if (inputArr[i] % 2 == 0) {
                            continue;
                        }
                        if (inputArr[i] < smallestOdd) {
                            smallestOdd = inputArr[i];
                            minOddIndex = i;
                        }
                    }
                    if (smallestOdd == Integer.MAX_VALUE) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(minOddIndex);
                    }
                }
            }
            if (commandArr[0].equals("first")) {
                int count = Integer.parseInt(commandArr[1]);
                if (count > inputArr.length) {
                    System.out.println("Invalid count");
                    commands = scanner.nextLine();
                    continue;

                }
                if (commandArr[2].equals("even")) {
                    int evenCounter = 0;

                    for (int i = 0; i < inputArr.length; i++) {
                        if (i == inputArr.length - 1 || evenCounter == count) {
                            System.out.print("]");
                            System.out.println();
                            break;
                        }
                        if (inputArr[i] % 2 == 0) {

                            evenCounter++;
                            if (evenCounter == 1) {
                                System.out.printf("[%d", inputArr[i]);
                            } else {
                                System.out.printf(", %d", inputArr[i]);
                            }
                        }
                    }
                    if (evenCounter == 0) {
                        System.out.println("[]");
                    }
                } else if (commandArr[2].equals("odd")) {
                    int oddCounter = 0;


                    for (int i = 0; i < inputArr.length; i++) {
                        if (i == inputArr.length - 1 || oddCounter == count) {
                            System.out.print("]");
                            System.out.println();
                            break;
                        }
                        if (inputArr[i] % 2 == 1) {

                            oddCounter++;
                            if (oddCounter == 1) {
                                System.out.printf("[%d", inputArr[i]);
                            } else {
                                System.out.printf(", %d", inputArr[i]);
                            }
                        }
                    }
                    if (oddCounter == 0) {
                        System.out.println("[]");
                    }
                }
            }
            if (commandArr[0].equals("last")) {
                int count = Integer.parseInt(commandArr[1]);
                if (count > inputArr.length) {
                    System.out.println("Invalid count");
                    commands = scanner.nextLine();
                    continue;

                }
                if (commandArr[2].equals("even")) {
                    int evenCounter = count;
                    int[] lastEvenCount = new int[count];

                    for (int i = inputArr.length - 1; i >= 0; i--) {

                        if (inputArr[i] % 2 == 0) {

                            lastEvenCount[evenCounter - 1] = inputArr[i];
                            evenCounter--;
                        }
                    }
                    if (evenCounter == count) {
                        System.out.println("[]");
                    }
                } else if (commandArr[2].equals("odd")) {
                    int oddCounter = 0;

                    for (int i = 0; i < inputArr.length; i++) {
                        if (i == inputArr.length - 1 || oddCounter == count) {
                            System.out.print("]");
                            System.out.println();
                            break;
                        }
                        if (inputArr[i] % 2 == 1) {

                            oddCounter++;
                            if (oddCounter == 1) {
                                System.out.printf("[%d", inputArr[i]);
                            } else {
                                System.out.printf(", %d", inputArr[i]);
                            }
                        }
                    }
                    if (oddCounter == 0) {
                        System.out.println("[]");
                    }
                }
            }

            commands = scanner.nextLine();
        }
        for (int i = 0; i < inputArr.length; i++) {
            if (i == inputArr.length - 1) {
                System.out.printf("%d]", inputArr[i]);
            }else if (i == 0){
                System.out.printf("[%d, ",inputArr[i]);
            }else{
                System.out.printf("%d, ",inputArr[i]);
            }
        }
    }
}