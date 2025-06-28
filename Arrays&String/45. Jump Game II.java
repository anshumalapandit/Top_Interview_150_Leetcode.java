class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int l=0;
        int r=0;
        // bfs approach
        while(r<nums.length-1){
            int farthest=0; // it will tack max kitna jump kar sakte
            for(int i=l;i<=r;i++){
              farthest=Math.max(i+nums[i],farthest);
            }
            l=r+1;
            r=farthest;
            jumps++;
        }
        return jumps;
    }
}
