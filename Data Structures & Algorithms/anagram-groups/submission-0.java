class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ana = new HashMap<>();
        List<List<String>> strs1 = new ArrayList();
        for(int i=0; i<strs.length; i++){
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                String sortedStr = new String(chars);
                ana.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(strs[i]);
        }
        strs1.addAll(ana.values());
        return strs1;

    }
}
