class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<=j){
            int cursum=numbers[i]+numbers[j];
            if(cursum==target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            if(target<cursum){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}
