class Hamming {

	private static String leftStrand;
	private static String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        String exceptionMessage;
        
        if (this.leftStrand.length() != this.rightStrand.length()) {
        	exceptionMessage = "leftStrand and rightStrand must be of equal length.";

        	if (this.leftStrand.length() == 0) {
        		exceptionMessage = "left strand must not be empty.";
        	} else if (this.rightStrand.length() == 0) {
        		exceptionMessage = "right strand must not be empty.";
        	}

        	throw new IllegalArgumentException(exceptionMessage);
        }
    }

    int getHammingDistance() {
    	int hammingDistance = 0;

    	for (int i = 0; i < this.leftStrand.length(); i++) {
    		if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
    			hammingDistance++;
    		}
    	}

    	return hammingDistance;
    }

}
