class Bob {
    public static int enough(int cap, int on, int wait){
        int spaceAvailable = cap - on;
        if (spaceAvailable >= wait) return 0;
        else {
          int passengersNotTaken = wait - spaceAvailable;
          return passengersNotTaken;
        }
    }
  }