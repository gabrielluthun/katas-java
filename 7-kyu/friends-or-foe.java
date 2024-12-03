import java.util.List;
import java.util.stream.Collectors;
class Kata {
   public static List<String> friend(List<String> x){
    
     return x.stream()  
            .filter(friends -> friends.length() == 4)
            .collect(Collectors.toList());
   }
}