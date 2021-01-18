package HW_book;

public class Main {
    public static void main(String[] args) {
        Title title = new Title("Harry Potter");
        Author author = new Author("Joan K. Rowling");
        Content content = new Content("1. The Boy Who Lived\n" +
                "2. The Vanishing Glass\n" +
                "3. The Letters from No One");

        title.show();
        author.show();
        content.show();
    }

}
