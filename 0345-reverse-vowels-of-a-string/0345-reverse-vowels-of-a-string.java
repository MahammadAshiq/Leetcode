class Solution {
    public boolean isvowel(char a) {
        return switch (a) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();

        while (i<j) {
            while (i<j && !isvowel(ch[i])) {
                i++;
            }
            while (i<j && !isvowel(ch[j])) {
                j--;
            }

            if (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}