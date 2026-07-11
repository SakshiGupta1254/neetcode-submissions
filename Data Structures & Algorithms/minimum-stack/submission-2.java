class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> mins = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        mins.push(mins.isEmpty()? val : Math.min(mins.peek(),val));

    }
    
    public void pop() {
        s.pop();
        mins.pop();
        // if(!mins.isEmpty()){
        // mins.push(mins.peek());
        // }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
