package org.striver.dsa;

class Main {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            charCount[chars.charAt(i) - 'a'] += 1;
        }
        int res = calculateWords(words, charCount);
        return res;
    }

    public int calculateWords(String[] words, int[] charCount) {
        int res = 0;
        for (String word : words) {
            int[] tempCount = charCount;
            boolean exists = true;
            for (int i = 0; i < word.length(); i++) {
                tempCount[word.charAt(i) - 'a'] -= 1;
                if (tempCount[word.charAt(i) - 'a'] < 0) {
                    exists = false;
                }
            }
            if (exists == true)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        Main main = new Main();
        System.out.println(main.countCharacters(words, chars));
    }
}