package HW_book;

public class Author {
    private String author;
    public Author(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(){
        this.author= author;
    }
    public void show(){
        System.out.println(getAuthor());
    }
}
