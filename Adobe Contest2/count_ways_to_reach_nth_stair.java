class Solution{
    
    // function to count ways to reach mth stair
    Long countWays(int N){
        
        // your code here
        long a=1;
        //if number of stairs is 1 then return 1
        if(N==1)
            return a;
        long dp[]=new long[N+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=N;i++){
            //number of ways to reaching the ith stair=no of ways of (i-1)+no of ways of(i-2)
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[N];
        
    }
    
}