class Solution {
    static int dp[][];
    public int lcs(String s,String t,int n,int m){
        // initialization
        dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        
        // if not present then will find
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                // important remember this logic differs as question
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        // remember asa memoization mai karte hai
        // for(int d[]:dp){
        //     Arrays.fill(d,-1);
        // }
        int lenOfLcs=lcs(s,t,n,m);
        if(lenOfLcs==n){
            return true;
        }
        return false;
    }
}
