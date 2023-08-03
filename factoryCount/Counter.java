package factoryCount;


public class Counter {
    public static void main(String[] args) {
        Log log = LogFactory.Log("txt");
        for(int i = 0; i < 10; i++) {
            log.log(new int[] {i});
        }
    }
}
