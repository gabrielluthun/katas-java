class Solution{
    public static String doubleChar(String s){
      StringBuilder stringResult = new StringBuilder();
      
      for (char c : s.toCharArray()) {
        stringResult.append(c).append(c);
      }
      
      return stringResult.toString();
    }
  }