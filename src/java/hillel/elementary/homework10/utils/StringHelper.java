package hillel.elementary.homework10.utils;

public class StringHelper {
    public String adjustSting(String myString, char[] charArray) {
        String arrayString = checkArrayCreateString(charArray);

        checkStringsForEmptiness(arrayString, myString);

        myString = myString.toUpperCase();
        arrayString = arrayString.toLowerCase();

        myString = cutFrontRearSlash(myString);
        arrayString = cutFrontRearSlash(arrayString);

        String newString = concatenateStrings(myString, arrayString);

        newString = cutCharsFromTheMiddleOfString(newString);

        return newString;
    }

    private String checkArrayCreateString(char[] arrayOfChar) {
        if (arrayOfChar == null) {
            throw new NullPointerException("Char array is empty.");
        }
        String arrayString = String.valueOf(arrayOfChar);
        return arrayString;
    }

    private void checkStringsForEmptiness(String arrayString, String myString) {
        if (myString.isBlank() || arrayString.isBlank()) {
            throw new NullPointerException("String is empty.");
        }
    }

    private String cutFrontRearSlash(String s) {
        return s.trim();
    }

    private String concatenateStrings(String s, String s2) {
        return s.concat(" " + s2);
    }

    private String cutCharsFromTheMiddleOfString(String s) {
        s = s.substring(s.length() / 2, s.length() / 2 + 1);
        return s;
    }
}
