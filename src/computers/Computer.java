package computers;

import java.lang.reflect.Array;

public class Computer {
    String computerName;

    public Computer(String computerName) {
        this.computerName = computerName;
    }

    @Override
    public String toString() {
        return computerName;
    }
}
