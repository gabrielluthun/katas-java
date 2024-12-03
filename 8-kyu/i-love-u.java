class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        int phrase = (nb_petals - 1) % 6 + 1;
        
        switch(phrase) {
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";
            case 6:
                return "not at all";
            default:
                return "";
        }
    }
}