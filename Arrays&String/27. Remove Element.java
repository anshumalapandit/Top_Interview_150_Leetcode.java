class Solution {
    public int removeElement(int[] nums, int val) {
     int idx=0;
     int count=0;
     for(int i=0;i<nums.length;i++){
        int cur=nums[i];
        if(nums[i]!=val ){
            nums[idx]=cur;
            idx++; // yes you can use count pointer instead of idx no use of idx
            count++;
        }else if(nums[i]==val){
            // if its is equal then i will not store this element in nums just ignore
           continue;
        }
     }
     return count;   
    }
}
