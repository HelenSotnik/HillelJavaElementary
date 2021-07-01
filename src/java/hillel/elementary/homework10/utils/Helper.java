package hillel.elementary.homework10.utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public String validatePhoneNumber(Scanner scanner) {
        System.out.println("Please enter Ukrainian phone number:");

        String telephone = scanner.nextLine();
        String regEx = "^((8|\\+3)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(telephone);

        boolean valid = matcher.matches();
        while (valid != true) {
            System.out.println("Telephone number is not valid. " +
                    "Please enter Ukrainian type of number:");
            telephone = scanner.nextLine();
        }
        return telephone;
    }

    public String validateEmail(Scanner scanner) {
        System.out.println("Please enter email:");

        String email = scanner.nextLine();
        String regEx = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";

        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        boolean valid = matcher.matches();
        while (valid != true) {
            System.out.println("Email is not valid. " +
                    "Please try again: ");
            email = scanner.nextLine();
        }
        return email;
    }

    public String validateDateOfBirthday(Scanner scanner) {
        System.out.println("Please enter date of birth:");

        String dateOfBirth = scanner.nextLine();
        String regEx = "\\b(?<month>\\d{1,2}).(?<day>\\d{1,2}).(?<year>\\d{2,4})\\b";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(dateOfBirth);

        boolean valid = matcher.matches();
        while (valid != true) {
            System.out.println("Date of birth is not valid. " +
                    "Please try again in format DD.MM.YYYY:  ");
            dateOfBirth = scanner.nextLine();
        }
        return dateOfBirth;
    }
}
