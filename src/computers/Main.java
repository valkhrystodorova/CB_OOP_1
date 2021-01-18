package computers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("name" + (i+1));
        }

        System.out.println(Arrays.toString(computers));


    }
}
