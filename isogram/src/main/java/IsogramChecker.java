class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.replaceAll("[-| ]", "").toLowerCase();
        return phrase.length() == phrase.chars().distinct().count();
    }

}
