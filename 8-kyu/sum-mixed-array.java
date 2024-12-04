import java.util.List;

class MixedSum {

	public int sum(List<?> mixed) {	
		return mixed.stream()
                    .mapToInt(x -> Integer.parseInt(x.toString()))
                    .sum();
	}
}