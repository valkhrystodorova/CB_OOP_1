package HW_book;

public class Content {
    private String content;
    public Content(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void show(){
        System.out.println(getContent());
    }
}
