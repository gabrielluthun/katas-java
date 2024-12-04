class Kata
{
  public static int sum(int[] numbers)
  {
    if(numbers == null || numbers.length < 3) return 0;
    int min = numbers[0];
    int max = numbers[0];
    int somme = 0;
    
    for(int num : numbers) {
      if (num < min) min = num;
      if (num > max) max = num;
      somme = somme + num;
    }
    return somme - min - max;
  }
}