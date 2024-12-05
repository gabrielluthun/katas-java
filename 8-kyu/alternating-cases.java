class StringUtils {
  
    public static String toAlternativeString(String string) {
      StringBuilder lowerAndUpper = new StringBuilder(string.length());
      
      for (int i = 0; i < string.length(); i++) {
        char ch = string.charAt(i);
        
        if (Character.isUpperCase(ch)) {
          lowerAndUpper.append(Character.toLowerCase(ch));
        } else if (Character.isLowerCase(ch)) {
          lowerAndUpper.append(Character.toUpperCase(ch));
        } else {
          lowerAndUpper.append(ch);
        }
      }
      
      return lowerAndUpper.toString();
    }
  }