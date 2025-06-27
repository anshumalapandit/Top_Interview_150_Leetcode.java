class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=2; // i want to keep first 2 elements as it is .. start modifying from 3rd
        if(nums.length==1){
            return 1;
        }
        if(nums.length==2){
            return 2;
        }
        for(int i=2;i<nums.length;i++){
            int firstEle=nums[idx-2];
            if(firstEle!=nums[i]){
                nums[idx]=nums[i];
                idx++;
            }else{
                continue;
            }
        }
        return idx;
    }
}
