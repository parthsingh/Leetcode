//Given an integer n, return any array containing n unique integers such that they add up to 0.

class Solution {
    public int[] sumZero(int n) 
    {
        int[] ans = new int[n];

        if(n%2==0)
        {
            for(int i = 0; i<n - 1; i+=2)
            {
                ans[i] = i+1;
                ans[i+1] = -(i+1); 
            }
        }

        if(n%2 != 0)
        {
            ans[0] = 0;
            for(int i = 1; i<n - 1; i+=2)
            {
                ans[i] = i+1;
                ans[i+1] = -(i+1); 
            }

        }

        return ans;

        
    }
}
