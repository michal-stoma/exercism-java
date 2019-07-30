import java.util.Map;
import java.util.HashMap;

class Scrabble {

	private final static Map<Integer, Integer> SCORES = new HashMap<Integer, Integer>();

	static {
		"DG".chars().forEach(c -> SCORES.put(c, 2));
		"BCMP".chars().forEach(c -> SCORES.put(c, 3));
		"FHVWY".chars().forEach(c -> SCORES.put(c, 4));
		"K".chars().forEach(c -> SCORES.put(c, 5));
		"JX".chars().forEach(c -> SCORES.put(c, 8));
		"QZ".chars().forEach(c -> SCORES.put(c, 10));
	}

	private static String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        return this.word.toUpperCase()
	        			.chars()
	        			.map(c -> SCORES.getOrDefault(c, 1))
	        			.sum();
    }

}
