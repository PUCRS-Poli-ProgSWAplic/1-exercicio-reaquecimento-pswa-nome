package factoryCount;

public class LogFactory {
    public static Log Log(String type) {
        if (type.equals("console")) {
            return new ConsoleLog();
        } else if (type.equals("txt")) {
            return new TxtLog();
        } else {
            return null;
        }
    }   
}
