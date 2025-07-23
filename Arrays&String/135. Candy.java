class Solution {
    public int candy(int[] ratings) {
      int left[]=new int[ratings.length];
      int right[]=new int[ratings.length];
      Arrays.fill(left,1);
      Arrays.fill(right,1);
      // lets go left to right
      for(int i=1;i<ratings.length;i++){
        if(ratings[i]>ratings[i-1]){
            // then we need to give more candies to this 
            left[i]=left[i-1]+1;
        }
      }
      //lets go right to left
      for(int i=ratings.length-2;i>=0;i--){
        // why from n-2 : bcoz n-1 ka right elem nhi hota it will give index oo bound errpr
        if(ratings[i]>ratings[i+1]){
            right[i]=right[i+1]+1;
        }
      }
      // now lets take maximise of both and include it in our ans
      int ans=0;
      for(int i=0;i<ratings.length;i++){
        ans+=Math.max(left[i],right[i]);
      }
      return ans;
    }
}
