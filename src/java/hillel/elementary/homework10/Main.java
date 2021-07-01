package hillel.elementary.homework10;

import hillel.elementary.homework10.utils.Helper;
import hillel.elementary.homework10.utils.StringHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myString = " Art is a life! ";
        char[] array = {' ', 'd', 'e', 'k', 'o', ' '};

        StringHelper helper = new StringHelper();
        System.out.println("Adjusted string: " + helper.adjustSting(myString, array));

        Helper help = new Helper();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valid telephone: " + help.validatePhoneNumber(scanner));

        System.out.println("Valid email: " + help.validateEmail(scanner));

        System.out.println("Valid date of birth: " + help.validateDateOfBirthday(scanner));
    }
}
