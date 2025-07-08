class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0; // keep track of the number of capital letters
        int n = word.length(); // length of the input word

        // iterate through the characters of the word
        for (int i = 0; i < n; i++) {
            // if the character is a capital letter, increase the counter
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }

        // if there are no capital letters (all letters are lowercase)
        if (capitalCount == 0) {
            return true; // the input word is valid
        }
        // if all letters are capital letters
        else if (capitalCount == n) {
            return true; // the input word is valid
        }
        // if only the first letter is a capital letter
        else if (capitalCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true; // the input word is valid
        }
        // otherwise, the input word is not valid
        else {
            return false;
        }
    }
}