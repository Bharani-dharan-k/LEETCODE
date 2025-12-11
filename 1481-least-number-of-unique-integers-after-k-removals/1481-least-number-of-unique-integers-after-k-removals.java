class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int[] res = new int[map.size()];
        int i = 0;
        for(int a : map.values()){
            res[i++] = a;
        }
        Arrays.sort(res);
        for(i = 0; i < res.length; i++){
            if(k < res[i]) break;
            k -= res[i];
        }
        return res.length - i;
    }
}