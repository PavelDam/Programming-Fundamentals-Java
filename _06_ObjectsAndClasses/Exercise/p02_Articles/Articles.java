package L06ObjectsAndClasses.Exercise.P02Articles;

public class Articles {
    //1.полета -> характеристики
    private String title;
    private String content;
    private String author;

    //2.конструктор -> създава нови обекти
    public Articles(String title, String content, String author) {
        //нов обект със следните стойности
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //3.метод за промяна на стойности
    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    //4.гетери -> за достъпване на стойностите на обекта в мейн метода
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
    //вграден метод toString -> превръща обекта в текст

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
        //return String.format("%s - %s: %s",this.title, this.content, this.author);
    }
}
