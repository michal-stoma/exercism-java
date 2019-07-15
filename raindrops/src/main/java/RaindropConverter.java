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
    		.map(FACTORS::get)
    		.reduce(String::concat)
    		.orElse(Integer.toString(number));
    }

}
