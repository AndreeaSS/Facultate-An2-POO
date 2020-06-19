package second;

import first.Task;

import java.util.ArrayList;

public class Stack implements Container{

    ArrayList<Task> stack = new ArrayList<>();

    @Override
    public Task pop() {
        if(stack.isEmpty())
            return null;
        Task t = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return t;
    }

    @Override
    public void push(Task task) {
        stack.add(task);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while(!container.isEmpty()) {
            Task t = container.pop();
            this.push(t);
        }
    }
}
