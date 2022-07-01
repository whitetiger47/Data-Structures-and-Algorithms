class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        String str = s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        char[] arr=str.toCharArray();
        while(left<right)
        {
            if(arr[left]!=arr[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}