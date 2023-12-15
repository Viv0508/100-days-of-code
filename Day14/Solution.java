class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel = 0, totalCost = 0;
        int n = gas.length;
        for(int i = 0;i<n;i++){
            totalFuel+=gas[i];
            totalCost+=cost[i];
        }
        
        if(totalFuel<totalCost)return -1;
        int startingIdx = 0, currentFuel = 0;
        for(int i = 0;i<n;i++){
            if(currentFuel <0){
        
                currentFuel = 0;
                startingIdx = i;
            }
            currentFuel += gas[i]-cost[i];
        }
        return startingIdx;
    }
}
