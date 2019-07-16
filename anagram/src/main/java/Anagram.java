import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
	private String word;

	Anagram(String word){
		this.word = word;
	}

	private static int[] _sort(String element) {
		return element
			.toLowerCase()
			.chars()
			.sorted()
			.toArray();
	}

	private boolean _filter(String element) {
		return Arrays.equals(_sort(this.word), _sort(element)) && !(this.word.toLowerCase().equals(element.toLowerCase()));
	}

	public List<String> match(List<String> candidates) {
		return candidates
			.stream()
			.filter(e -> _filter(e))
			.collect(Collectors.toList());
	}

}