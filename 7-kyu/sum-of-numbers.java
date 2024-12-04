class Sum
{
   public int GetSum(int a, int b)
   {
    if (a == b) return a;
    int min = Math.min(a,b);
     int max = Math.max(a,b);
     
     return (max - min + 1) * (min + max) / 2;
   }
}