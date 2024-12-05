import java.util.Arrays;
 class SortAndStar {

    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String firstValue = s[0];
        return String.join("***", firstValue.split(""));
    }

    public static void main(String[] args) {
        String[] input = {"banana", "apple", "cherry"};
        String result = twoSort(input);
        System.out.println(result); // Output: a***p***p***l***e
    }
}