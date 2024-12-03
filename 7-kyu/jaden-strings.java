class JadenCase {

	public String toJadenCase(String phrase) {
if (phrase == null || phrase.isEmpty()) {
            return null;
        }
    
        String[] words = phrase.split(" ");
        StringBuilder jadenCased = new StringBuilder();


        for (String word : words) {
            if (!word.isEmpty()) {

                String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                jadenCased.append(capitalizedWord).append(" ");
            }
        }

        return jadenCased.toString().trim();
    }
  
	}
