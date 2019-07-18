import java.util.Stack;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		String numberAsString = String.valueOf(numberToCheck);
		int power = numberAsString.length();
		int armstrong = 0;

		for (int i = 0; i < power; i++) {
			int digit = Character.digit(numberAsString.charAt(i), 10);
			armstrong += Math.pow(digit, power);
		}

		return numberToCheck == armstrong;
		
	}

}
