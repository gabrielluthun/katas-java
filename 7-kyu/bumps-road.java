class BumpsTheRoad {
    public static String bumps(final String road) {
      int compteurBosses = 0;
      
      for(char c : road.toCharArray()) {
        if (c == 'n') compteurBosses++;
        if (compteurBosses > 15) return "Car Dead";
      }
      
      return "Woohoo!";
    }
  }