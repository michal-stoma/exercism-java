public class PangramChecker {

	private static final int ALPHABET_COUNT = 26;

    public boolean isPangram(String input) {
    	long input_count = input
				    		.toLowerCase()
				    		.chars()
				    		.filter(Character::isLetter)
				    		.distinct()
				    		.count();

    	return input_count == ALPHABET_COUNT;
    }

}
