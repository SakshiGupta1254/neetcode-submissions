class MyStack {
    Queue<Integer> u = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        u.offer(x);
    }
    
    public int pop() {
        int n = u.size();
        if(u.size() != 0){
            for(int i=0; i<= n-1;i++){
              int e =  u.element();
                u.poll();
                if(i != n-1){
                u.offer(e);
                }
                else{
                    return e;
                }

            }
        }
    return -1;
    
    }
    
    public int top() {
        int n = u.size();
         int e =0;
        if(n != 0){
           
        for(int i=0; i<= n-1;i++){
              e =  u.element();
              u.poll();
              u.offer(e);
                
        }
       
        }
        return e;
    }
    
    public boolean empty() {
        if(u.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */