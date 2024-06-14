package L06ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Song {
    static class Song {
        private String typeList;
        private String name;
        private String duration;

        public Song(String typeList, String name, String duration) {
            this.typeList = typeList;
            this.name = name;
            this.duration = duration;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getDuration() {
            return this.duration;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("_");

            Song currentSong = new Song(inputArr[0], inputArr[1], inputArr[2]);
            songList.add(currentSong);
        }
        String type = scanner.nextLine();
        if (type.equals("all")) {
            for (Song item : songList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songList) {
                if (item.getTypeList().equals(type)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
