package HW_book;

import java.security.PublicKey;

public class Title {
    private String title;

    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println(getTitle());

    }
}
