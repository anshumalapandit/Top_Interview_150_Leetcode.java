class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n];
        int ele=1;
        int rmin=0;
        int cmin=0;
        int rmax=n-1;
        int cmax=n-1;
        int totalEle=n*n;
        while(totalEle>0){
            // left to right
            for(int c=cmin;c<=cmax;c++){
                ans[rmin][c]=ele;
                  totalEle--;
                ele++;
            }
            //top to bottom
            for(int r=rmin+1;r<=rmax;r++){
                ans[r][cmax]=ele;
                  totalEle--;
                ele++;
            }
            // right to left
            if(rmin<=rmax && cmin<=cmax){
            for(int c=cmax-1;c>=cmin; c--){
                ans[rmax][c]=ele;
                  totalEle--;
                ele++;
            }
            //bottom to top
            for(int r=rmax-1;r>=rmin+1;r--){
                ans[r][cmin]=ele;
                totalEle--;
                ele++;
            }
            }
            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }
        return ans;
    }
}
