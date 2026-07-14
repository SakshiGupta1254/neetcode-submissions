class BrowserHistory {
    int size = 0;
    Node homepage;
    Node current;
    class Node{
        String url;
        Node prev;
        Node next;
        public Node(String url){
            this.url = url;
        }
    }

    public BrowserHistory(String homepage) {
        this.homepage = new Node(homepage);
        this.current = this.homepage;

    }
    
    public void visit(String url) {
        Node n = new Node(url);
        
            current.next = n;
            // n.next = null;
            n.prev = current;
            current = n;


         size++;
    }
    
    public String back(int steps) {
    
        while(steps > 0 && current.prev != null){
            current = current.prev;
            steps--;
        }
        
            return current.url;
        
        
    }
    
    public String forward(int steps) {
        while(steps> 0 && current.next != null){
            current = current.next;
            steps--;
        }
        
            return current.url;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */