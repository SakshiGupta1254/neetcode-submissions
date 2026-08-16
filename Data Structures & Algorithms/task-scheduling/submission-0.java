class Solution {
    class Task{
        int frequency;
        int executionTime;
        Task(int f, int et){
            frequency = f;
            executionTime = et;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        int t=0;
        HashMap<Character, Integer> h = new HashMap<>();
        
            for(char ch: tasks){
                h.put(ch, h.getOrDefault(ch,0)+1);
            }
        PriorityQueue<Task> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.frequency,a.frequency));
        for(Character ch : h.keySet()){
            pq.offer(new Task(h.get(ch),0));
        }


        Queue<Task> q = new LinkedList<>();
        
        while(!pq.isEmpty() || !q.isEmpty()){
            t++;
            if(!pq.isEmpty()){
                Task task = pq.poll();
                task.frequency--;
                if(task.frequency >0){
                    task.executionTime = t +n;
                    q.offer(task);
                   
                } 
            }
            if(!q.isEmpty() && q.peek().executionTime == t){
                pq.offer(q.poll());

            }
        }
        

        
        return t;
    }
}

