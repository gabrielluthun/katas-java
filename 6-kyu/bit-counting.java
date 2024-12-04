class BitCounting {
    public static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
          // shift all bits to the right 
            n >>>= 1;
        }
        return count;
    }
}