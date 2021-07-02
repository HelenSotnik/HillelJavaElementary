package hillel.elementary.homework10.utils;

import hillel.elementary.homework10.exceptions.StringFormatException;

public class StringHelper {
    public String adjustSting(String myString, char[] charArray) throws StringFormatException {
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

    private String checkArrayCreateString(char[] arrayOfChar) throws StringFormatException {
        if (arrayOfChar == null) {
            throw new StringFormatException("Char array is empty.");
        }
        String arrayString = String.valueOf(arrayOfChar);
        return arrayString;
    }

    private void checkStringsForEmptiness(String arrayString, String myString) throws StringFormatException {
        if (myString.isBlank() || arrayString.isBlank()) {
            throw new StringFormatException("String is empty.");
        }
    }

    private String cutFrontRearSlash(String s) {
        return s.trim();
    }

    private String concatenateStrings(String s, String s2) {
        return s.concat(" " + s2);
    }

    private String cutCharsFromTheMiddleOfString(String s) {
        System.out.println("String length: " + s.length());
        System.out.println("Initial String: " + s);
        
        if (s.length() % 2 != 0) {
            s = s.substring(0, s.length() / 2) + s.substring(s.length() / 2 + 1);
        } else {
            s = s.substring(0, s.length() / 2 - 1) + s.substring(s.length() / 2 + 1);
        }
        System.out.println("String length after cut in the middle: " + s.length());
        return s;
    }
}
