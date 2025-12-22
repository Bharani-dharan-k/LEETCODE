class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged=new ArrayList<>();
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        int[] curr=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] next=intervals[i];
            if(curr[1]>=next[0]){
                curr[1]=Math.max(curr[1],next[1]);
            }else{ 
                merged.add(curr);
                curr=next;
            }
        }merged.add(curr);
        return merged.toArray(new int[merged.size()][]);
    }
}