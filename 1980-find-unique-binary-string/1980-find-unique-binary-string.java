import java.util.*;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        HashSet<String> set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }
        for(int i = 0; i < (1 << n); i++){
            String bin = Integer.toBinaryString(i);
            while(bin.length() < n){
                bin = "0" + bin;
            }
            if(!set.contains(bin)){
                return bin;
            }
        }
        return "";
    }
}