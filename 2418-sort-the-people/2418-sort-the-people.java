class Solution {
    public String[] sortPeople(String[] names, int[] height) {
        int n = names.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0;j < n - i -1; j++){
                if(height[j] < height[j + 1]){
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;

                    int temp1 = height[j];
                    height[j] = height[j + 1];
                    height[j + 1] = temp1;
                }
            }
        }
        return names;
    }
}