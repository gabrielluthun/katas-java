class Solution {
    public static String whatCentury(int year) {
        int century = (year - 1) / 100 + 1;
        String suffix;
        
        if (century % 100 >= 11 && century % 100 <= 13) {
            suffix = "th";
        } else {
            switch (century % 10) {
                case 1:  suffix = "st"; break;
                case 2:  suffix = "nd"; break;
                case 3:  suffix = "rd"; break;
                default: suffix = "th"; break;
            }
        }
        
        return century + suffix;
    }
}