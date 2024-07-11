package FinalExams.FinalExam04042020;

import java.util.*;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heroesCount = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroMap = new LinkedHashMap<>();

        for (int i = 1; i <= heroesCount; i++) {
            String[] inputHero = scanner.nextLine().split("\\s+");
            String heroName = inputHero[0];
            int hp = Integer.parseInt(inputHero[1]);
            int mp = Integer.parseInt(inputHero[2]);

            heroMap.put(heroName, new ArrayList<>());
            heroMap.get(heroName).add(hp);
            heroMap.get(heroName).add(mp);
        }
        //MaxHP = 100, MaxMP = 200;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String command = input.split(" - ")[0];
            String name = input.split(" - ")[1];
            switch (command) {
                case "CastSpell":
                    //команда: CastSpell – {hero name} – {MP needed} – {spell name}
                    //         ако {hero name} има достатъчно >= mp от {MP needed} прехвърля {MP needed} на {spell name}
                    //         принтираме: "{hero name} has successfully cast {spell name} and now has {mana points left} MP!"
                    //         ако няма достатъчно mp принтираме: "{hero name} does not have enough MP to cast {spell name}!"
                    int mpNeeded = Integer.parseInt(input.split(" - ")[2]);
                    String spellName = input.split(" - ")[3];
                    int currentMp = heroMap.get(name).get(1);
                    if (currentMp >= mpNeeded) {
                        heroMap.get(name).set(1, currentMp - mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spellName, currentMp - mpNeeded);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", name, spellName);
                    }
                    break;
                case "TakeDamage":
                    //команда: TakeDamage – {hero name} – {damage} – {attacker}
                    //         намалява hp на {hero name} с {damage},ако след намаляването hp na {hero name} >0
                    //         принтираме: "{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
                    //         ако hp на {hero name} <= 0 принтираме: "{hero name} has been killed by {attacker}!"
                    int damage = Integer.parseInt(input.split(" - ")[2]);
                    String attacker = input.split(" - ")[3];
                    int currentHp = heroMap.get(name).get(0);
                    currentHp -= damage;
                    if (currentHp > 0) {
                        heroMap.get(name).set(0, currentHp);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, currentHp);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", name, attacker);
                        heroMap.remove(name);
                    }
                    break;
                case "Recharge":
                    //команда: Recharge – {hero name} – {amount}
                    //         увеличаваме mp на {hero name} с {amount}
                    //         ако mp + {amount} > 200, сетваме mp на 200
                    //         принтираме: "{hero name} recharged for {amount recovered} MP!
                    int amount = Integer.parseInt(input.split(" - ")[2]);
                    int rechargeMp = heroMap.get(name).get(1);
                    int neededMp;
                    if (amount + rechargeMp > 200) {
                        neededMp = 200 - rechargeMp;
                        heroMap.get(name).set(1, 200);
                    } else {
                        neededMp = amount;
                        heroMap.get(name).set(1, rechargeMp + neededMp);
                    }
                    System.out.printf("%s recharged for %d MP!%n", name, neededMp);
                    break;
                case "Heal":
                    //команда: Heal – {hero name} – {amount}
                    //         увеличаваме hp на {hero name} с {amount}
                    //         ако hp + {amount} > 100, сетваме hp на 100
                    //         принтираме: 	"{hero name} healed for {amount recovered} HP!"
                    int heal = Integer.parseInt(input.split(" - ")[2]);
                    int healHp = heroMap.get(name).get(0);
                    int neededHp;
                    if (heal + healHp > 100) {
                        neededHp = 100 - healHp;
                        heroMap.get(name).set(0, 100);
                    } else {
                        neededHp = heal;
                        heroMap.get(name).set(0, healHp + neededHp);
                    }
                    System.out.printf("%s healed for %d HP!%n", name, neededHp);
                    break;
            }

            input = scanner.nextLine();
        }
        //принтираме: "{hero name}
        //             HP: {current HP}
        //             MP: {current MP}"
        heroMap.entrySet().stream()
                .forEach(kvp -> System.out.printf("%s%nHP: %d%nMP: %d%n",
                        kvp.getKey(), kvp.getValue().get(0), kvp.getValue().get(1)));
    }
}
