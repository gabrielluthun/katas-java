class Kata {

    public static int dutyFree(int normPrice, int discount, int hol) {
      double savingPerBottle = (normPrice * discount) / 100.0;
      return (int) (hol / savingPerBottle);
      
    }
  
  }