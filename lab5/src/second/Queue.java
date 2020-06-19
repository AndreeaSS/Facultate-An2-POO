package second;

import first.Task;

public class Queue implements Container{

    Stack in = new Stack();
    Stack out = new Stack();

    @Override
    public Task pop() {
        if(in.isEmpty() && out.isEmpty())
            return null;
        if(out.isEmpty())
            out.transferFrom(in);

        return out.pop();
    }

    @Override
    public void push(Task task) {
        in.push(task);
    }

    @Override
    public int size() {
        return in.size() + out.size();
    }

    @Override
    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while(!container.isEmpty()) {
            Task t = container.pop();
            this.push(t);
        }
    }
}
