package fourth;

import first.Task;
import third.Strategy;

public class CounterTaskRunner extends AbstractTaskRunner{
    int count = 0;

    public CounterTaskRunner(Strategy strategy) {
        super(strategy);
    }

    @Override
    protected void afterExecution(Task task) {
        count++;
    }

    public int getCounter() {
        return count;
    }
}
