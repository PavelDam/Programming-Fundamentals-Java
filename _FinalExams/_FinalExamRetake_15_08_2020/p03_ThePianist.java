package FinalExams.FinalExamRetake15082020;

import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int songCount = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> songsMap = new LinkedHashMap<>();
        //прочитаме данните от конзолата и запазваме записите в map-a
        for (int i = 1; i <= songCount; i++) {
            String[] inputSongArr = scanner.nextLine().split("\\|");
            String piece = inputSongArr[0];
            String composer = inputSongArr[1];
            String key = inputSongArr[2];

            songsMap.put(piece, new ArrayList<>());
            songsMap.get(piece).add(composer);
            songsMap.get(piece).add(key);
        }
        //прочитаме командата от конзолата
        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("Stop")) {
            String[] commandArr = inputCommand.split("\\|");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    //команда: Add|{piece}|{composer}|{key} -> добавяме песента в списака (map-a) ако не съществува и принтираме:
                    //"{piece} by {composer} in {key} added to the collection!"
                    //ако има такава песен принтираме: "{piece} is already in the collection!"
                    String addPiece = commandArr[1];
                    String addComposer = commandArr[2];
                    String addKey = commandArr[3];
                    if (!songsMap.containsKey(addPiece)) {
                        songsMap.put(addPiece, new ArrayList<>());
                        songsMap.get(addPiece).add(addComposer);
                        songsMap.get(addPiece).add(addKey);
                        System.out.printf("%s by %s in %s added to the collection!%n", addPiece, addComposer, addKey);
                    } else {
                        System.out.printf("%s is already in the collection!%n", addPiece);
                    }
                    break;
                case "Remove":
                    //команда: Remove|{piece} -> ако песента е в map-a я изтриваме и принтираме:  "Successfully removed {piece}!"
                    //ако песента я няма принтираме: "Invalid operation! {piece} does not exist in the collection."
                    String removePiece = commandArr[1];
                    if (songsMap.containsKey(removePiece)) {
                        songsMap.remove(removePiece);
                        System.out.printf("Successfully removed %s!%n", removePiece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", removePiece);
                    }
                    break;
                case "ChangeKey":
                    //команда: "ChangeKey|{piece}|{new key}" ->
                    // ако песента е в map-a сменяме нейния {key}(тоналност) с {new key} и принтираме: "Changed the key of {piece} to {new key}!"
                    // ако песента я няма принтираме: "Invalid operation! {piece} does not exist in the collection."
                    String changePiece = commandArr[1];
                    String changeKey = commandArr[2];
                    if (songsMap.containsKey(changePiece)) {
                        songsMap.get(changePiece).set(1, changeKey);
                        System.out.printf("Changed the key of %s to %s!%n", changePiece, changeKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", changePiece);
                    }
                    break;
            }
            inputCommand = scanner.nextLine();
        }

        //принтираме всички песни от мапа във формат: "{Piece} -> Composer: {composer}, Key: {key}"
        songsMap.entrySet().stream()
                .forEach(kvp -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        kvp.getKey(), kvp.getValue().get(0), kvp.getValue().get(1)));
    }
}
