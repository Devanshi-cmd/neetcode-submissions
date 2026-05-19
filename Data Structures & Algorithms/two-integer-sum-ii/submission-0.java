class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int b;
        for(int i=0;i<n;i++){
            b=n-1;
            while(b>i){
                if(numbers[i]+numbers[b]==target){
                    return new int[]{i+1,b+1};
                }
                b--;
            }
        }
        return new int[]{-1,-1};
    }
}
