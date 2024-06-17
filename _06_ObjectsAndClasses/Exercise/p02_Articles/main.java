package L06ObjectsAndClasses.Exercise.P02Articles;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.прочитаме входните данни за статията
        String inputArticle = scanner.nextLine();
        //2.превръщаме входните данни в масив
        String[] articleParts = inputArticle.split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];
        //3.създаваме от класа Article нов обект с име article създаваме го с конструктор Article,който приема(title,content,author)
        Articles article = new Articles(title, content, author);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            String inputCommand = scanner.nextLine();
            String[] commandArr = inputCommand.split(": ");
            String command = commandArr[0];

            if (command.equals("Edit")) {
                //взимаме новата стийност на съдържанието на статията(article)
                String newContent = commandArr[1];
                //подаваме новата стойност на метода edit,който замества content с newContent
                article.edit(newContent);

            } else if (command.equals("ChangeAuthor")) {
                //взимаме новата стийност на автор на статията(article)
                String newAuthor = commandArr[1];
                //подаваме новата стойност на метода changeAuthor,който замества author с newAuthor
                article.changeAuthor(newAuthor);

            } else if (command.equals("Rename")) {
                String newTitle = commandArr[1];
                article.rename(newTitle);
            }

        }
        System.out.println(article);
    }
}
