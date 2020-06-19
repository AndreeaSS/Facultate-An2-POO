package first;

import java.util.Random;

public class RandomOutTask implements Task{

    int randNo;

    public RandomOutTask() {
        Random rand = new Random();
        this.randNo = rand.nextInt();
    }

    @Override
    public void execute() {
        System.out.println(this.randNo);
    }
}
