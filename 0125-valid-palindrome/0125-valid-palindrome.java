class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char l=Character.toLowerCase(s.charAt(i));
            char r=Character.toLowerCase(s.charAt(j));
            if(!Character.isLetterOrDigit(l)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(r)){
                j--;
                continue;
            }
            if(l!=r){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}