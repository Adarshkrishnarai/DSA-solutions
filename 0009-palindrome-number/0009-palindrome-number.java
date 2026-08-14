class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n=x,rev=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            if(rev>Integer.MAX_VALUE/10) 
            return false;
            rev=rev*10+rem;
        }
        if(rev==x) return true;
        else
        return false;
    }
}