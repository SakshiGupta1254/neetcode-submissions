// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {

      pivotSort(pairs,0, pairs.size()-1);
      return pairs;
    }
    public void pivotSort(List<Pair> pairs, int l, int r){
        if(l<r){
            int pivot = partition(pairs,l, r);
            pivotSort(pairs,l,pivot-1);
            pivotSort(pairs,pivot+1,r);
        }
    }
    public int partition(List<Pair> pairs, int l, int r){
            int p = pairs.get(r).key;
            int i = l-1;
            for(int a= l; a<r;a++){
                if(pairs.get(a).key< p){
                    i++;
                    Pair temp = pairs.get(i);
                    pairs.set(i,pairs.get(a));
                    pairs.set(a, temp);
                }
            }
            Pair temp = pairs.get(i+1);
                    pairs.set(i+1,pairs.get(r));
                    pairs.set(r,temp);
                    return i+1;
    }
}
