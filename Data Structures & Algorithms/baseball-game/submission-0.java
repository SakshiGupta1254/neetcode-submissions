class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for(String s : operations){
            if(s.equals("+")){
                Integer n = list.get(list.size()-1)+list.get(list.size()-2);
                list.add(n);
            }
            else if(s.equals("D")){
                Integer n = list.get(list.size()-1) * 2;
                list.add(n);
            }
            else if( s.equals("C")){
                list.remove(list.size()-1);
            }
            else{
                Integer n = Integer.parseInt(s);
                list.add(n);
            }
        }
        int sum =0;
        for(Integer i : list){
            sum += i;
        }
        return sum;
        
    }
}