class Kata {
    public static final String generateShape(int n) {

        if (n < 1 || n > 50) return "Nombre invalide";


        String result = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                result += "+";
            }
            if (i < n) result += '\n';
        }

        return result;
    }
}