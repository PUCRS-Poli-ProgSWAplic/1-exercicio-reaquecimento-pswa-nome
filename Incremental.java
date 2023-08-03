public class Incremental{
    private static Incremental instance;
    private static int count = 0;
    private int num;

    private Incremental(){
        num = ++count;
    }

    public static Incremental getInstance(){
        if(instance == null){
            instance = new Incremental();
        }
        else{
            // incrementa a instancia já existente
            instance.num++;
        }
        return instance;
    }

    public String toString(){
        return "Incremental " + num;
    }
}