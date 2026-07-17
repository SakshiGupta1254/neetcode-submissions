// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> r = new ArrayList<>();
        if(pairs.size()>0){
        r.add(new ArrayList<>(pairs));
        for(int i =1; i< pairs.size();i++){
            int j = i-1;
            while(j>=0 && pairs.get(j+1).key < pairs.get(j).key){
                Pair p =pairs.get(j+1);
                pairs.set(j+1,pairs.get(j));
                pairs.set(j,p);
                j--;
            }
            r.add(new ArrayList<>(pairs));
        }
        }
        return r;
    }
}
