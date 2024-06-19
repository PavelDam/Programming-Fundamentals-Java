package L07AssociativeArrays.Exercise;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> academyMap = new LinkedHashMap<>();

        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!academyMap.containsKey(name)) {
                academyMap.put(name, new ArrayList<>());
                academyMap.get(name).add(grade);
            } else {
                academyMap.get(name).add(grade);
            }
        }

        Map<String, Double> averageGradeMap = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Double>> entry : academyMap.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);
            if (averageGrade >= 4.50) {
                averageGradeMap.put(studentName, averageGrade);
            }
        }
        averageGradeMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades = 0;
        for (double grade : listGrades) {
            sumGrades += grade;
        }
        return sumGrades / listGrades.size();
    }
}
