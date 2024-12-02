public class Vacation {
    public static int rentalCarCost(int d) {
      if(d >= 7) {
        return 40 * d - 50;
      }
      else if(d < 7 && d >= 3) {
        return 40 * d - 20;
      }
      else {
        return d * 40;
      }
    }
  }