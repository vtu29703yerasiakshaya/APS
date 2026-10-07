class MinStack {
    Stack<Integer> S;
    Stack<Integer> ms;

    public MinStack() {
        S = new Stack<>();
        ms = new Stack<>();
    }

    public void push(int value) {
        S.push(value);
        if (ms.isEmpty())
            ms.push(value);
        else {
            int min = Math.min(value, ms.peek());
            ms.push(min);
        }
    }

    public void pop() {
        S.pop();
        ms.pop();
    }

    int peek() {
        return S.peek();
    }

    public int top() {
        return S.peek();
    }

    public int getMin() {
        return ms.peek();
    }
}
