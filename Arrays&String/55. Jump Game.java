class Solution {
    public boolean canJump(int[] nums) {
       
        int maxIdx=0; // it will track max kaha tak jaa sakte hai
        for(int i=0;i<nums.length;i++){
    // i am greedy i want to jump the maximum .=Greedy approach
          int curJump=i+nums[i];
          if(i>maxIdx) return false; // i reached at maxIdx already its saying i> not psbl i go from here only 
          maxIdx=Math.max(curJump,maxIdx);
          if(maxIdx>=nums.length-1){
            return true;
          }
        }
        return false; // u can return anything either true/false here 
    }
}
