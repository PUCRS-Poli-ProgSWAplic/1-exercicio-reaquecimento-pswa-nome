package factoryCount;

public class ConsoleLog implements Log {
    public void log(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
