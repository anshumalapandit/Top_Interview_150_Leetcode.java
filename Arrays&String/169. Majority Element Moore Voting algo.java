class Solution {
    public int majorityElement(int[] nums) {
        int cand=0;
        int point=0;
        for(int i=0;i<nums.length;i++){
            if(point==0){
                // cand ele will be out of the game
                // new member take over its place
                cand=nums[i];
            }
            // if point is != 0 then
            if(cand==nums[i]){
                // he came again it will gain point
                point++;
            }else{
                // oops new member came then its point get reduce
                point--;
            }
        }
        return cand;
    }
}
