class Solution {
    public String reverseVowels(String s) {

        char[] ca = s.toCharArray();
        int i = 0, j = ca.length - 1;

        while (i < j) {

            while (i < j && !isVowel(ca[i])) i++;
            while (i < j && !isVowel(ca[j])) j--;

            char temp = ca[i];
            ca[i] = ca[j];
            ca[j] = temp;

            i++;
            j--;
        }

        return new String(ca);
    }

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}