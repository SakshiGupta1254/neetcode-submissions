class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] sorted = new int[position.length][2];
        Stack<Double> h = new Stack<>();
        for(int i =0; i<position.length ;i++){
            sorted[i][0] = position[i];
            sorted[i][1] = speed[i];
        }
        Arrays.sort(sorted,(x,y) -> Integer.compare(y[0],x[0]));
        for(int i =0; i<sorted.length ;i++){
            double time = (double)(target-sorted[i][0])/sorted[i][1];
            if(h.isEmpty() || time > h.peek()){
                h.push(time);
            }
            
        }
    return h.size();
    }
}
