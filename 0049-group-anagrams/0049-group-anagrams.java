class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hp = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String s1 = String.valueOf(c);
            if(!hp.containsKey(s1)){
                hp.put(s1,new ArrayList<>());
            }
            hp.get(s1).add(s);
        }
        return new ArrayList<>(hp.values());
    }
}