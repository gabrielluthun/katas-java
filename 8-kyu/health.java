class Game {
  
    public static int combat(int health, int damage) {
      
      return Math.max(0, health - damage);
    }
  }
  