class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }else{
                // modify shift element to left
                nums[count]=nums[i];
                count+=1;
            }
        }
        return count;
    }
}
