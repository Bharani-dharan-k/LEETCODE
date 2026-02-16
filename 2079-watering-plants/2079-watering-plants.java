class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int water = capacity;
        for(int i = 0;i < plants.length; i++){
            if(water < plants[i]){
                steps += 2 * i;
                water = capacity;
            }
            steps += 1;
            water -= plants[i];
        }
        return steps;
    }
}