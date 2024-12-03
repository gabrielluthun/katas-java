class Kata{
    public static double find_average(int[] array){
        if (array == null || array.length == 0) {
        return 0;
      }
      
      double sum = 0;
      for (int num : array) {
        sum += num;
      }
      
      return sum / array.length;
    }
  } 