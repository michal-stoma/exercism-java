import java.util.stream.Stream;

class Acronym {

	String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
    	return Stream
    			.of(phrase.replaceAll("_","").split("(?!')\\W"))
    			.filter(it -> !it.isEmpty())
    			.map(it -> it.substring(0,1))
    			.map(String::toUpperCase)
    			.reduce("", String::concat);
    }
}
