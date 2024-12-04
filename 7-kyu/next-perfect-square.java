class NumberFun {
    public static long findNextSquare(long sq) {
    long root = (long) Math.sqrt(sq);
    if (root * root != sq) return -1;
    return (root + 1) * (root + 1);
    }
  }