package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int combatPower = pokePower;
        int targetsHit = 0;
        while (combatPower >= distanceBetweenTargets) {

            combatPower -= distanceBetweenTargets;
            targetsHit++;
            if (combatPower == pokePower / 2) {
                combatPower /= exhaustionFactor;
            }
        }
        System.out.println(combatPower);
        System.out.println(targetsHit);
    }
}
