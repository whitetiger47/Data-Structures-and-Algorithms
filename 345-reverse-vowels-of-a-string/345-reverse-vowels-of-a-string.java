class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = Arrays.asList('a','A', 'e', 'E', 'i', 'I', 'O', 'o', 'U', 'u');
        Set<Character> set = new HashSet<>(vowels);
        
        char[] input = s.toCharArray();
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            // if both i and j are vowels, swap them;
            if (set.contains(input[i]) && set.contains(input[j])) {
                char temp = input[i];
                input[i++] = input[j];
                input[j--] = temp;
            }
            
            while (i < j && !set.contains(input[i])) {
                i++;
            }
            
            while (i < j && !set.contains(input[j])) {
                j--;
            }
        }
        
        return new String(input);
    }
}