import java.util.HashMap;

class RaindropConverter {
	private static final HashMap<Integer, String> FACTORS = new HashMap();
	
	static {
		FACTORS.put(3, "Pling");
		FACTORS.put(5, "Plang");
		FACTORS.put(7, "Plong");
	}

    String convert(int number) {
        /* 
         * .keySet() returns Set
         * .stream() returns Stream
         * .map() returns String
         * .reduce() returns Optional
         */
    	return FACTORS.keySet()
    		.stream()
    		.sorted()
    		.filter(key -> number % key == 0)
    		.map(key -> FACTORS.get(key))
    		.reduce((string1, string2) -> string1.concat(string2))
    		.orElse(Integer.toString(number));
    }

}
