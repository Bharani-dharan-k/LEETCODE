class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ice = 0;
        int temp = coins;
        Arrays.sort(costs);
        for(int x : costs){
            if(x <= temp)
            {
                ice += 1;
                temp -= x;
            } 
        }
        return ice;
    }
}