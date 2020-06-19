package fourth;

import first.Task;
import second.Stack;
import third.Strategy;

public class RedoBackTaskRunner extends AbstractTaskRunner{

    Stack cont = new Stack();

    public RedoBackTaskRunner(Strategy strategy) {
        super(strategy);

    }

    @Override
    protected void afterExecution(Task task) {
        cont.push(task);
    }

    public void redo(){
        while(!cont.isEmpty()) {
            Task task = cont.pop();

            task.execute();
        }
    }
}
