class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag = true;
        int upper =1;
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }
            if(Character.isUpperCase(ch[0]))
            {
                for(int i=1;i<ch.length;i++)
                {
                    if(Character.isUpperCase(ch[i]))
                    {
                        upper++;
                    }
                }
                if(upper<ch.length && upper!=1)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
         if(Character.isLowerCase(ch[0]))
            {
                for(int i=1;i<ch.length;i++)
                {
                    if(Character.isUpperCase(ch[i]))
                    {
                        flag=false;
                    }
                }
             return flag;
            }
        return true;
    }
}
