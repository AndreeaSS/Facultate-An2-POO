package first;

public class CounterOutTask implements Task{

    static int count = 0;

    @Override
    public void execute() {
        count++;
        System.out.println(count);
    }
}
