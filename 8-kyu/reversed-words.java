class ReverseWords {
    public static String reverseWords(String str) {

        String[] words = str.split(" ");
        
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        
        return String.join(" ", words);
    }
}