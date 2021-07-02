package hillel.elementary.homework10.utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public String validatePhoneNumber(Scanner scanner) {
        String regEx = "^((8|\\+3)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";

        System.out.println("Please enter Ukrainian phone number:");
        String telephone = scanner.nextLine();

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(telephone);

        while (!matcher.matches()) {
            System.out.println("Phone number is not valid." +
                    " Please enter Ukrainian phone number type: ");
            telephone = scanner.nextLine();
            matcher = pattern.matcher(telephone);
            if (matcher.matches()) {
                break;
            }
        }
        return telephone;
    }

    public String validateEmail(Scanner scanner) {
        String regEx = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";

        System.out.println("Please enter email:");
        String email = scanner.nextLine();

        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        while (!matcher.matches()) {
            System.out.println("Email is not valid. " +
                    "Please try again: ");
            email = scanner.nextLine();
            matcher = pattern.matcher(email);
            if (matcher.matches()) {
                break;
            }
        }
        return email;
    }

    public String validateDateOfBirthday(Scanner scanner) {
        String regEx = "\\b(?<month>\\d{1,2}).(?<day>\\d{1,2}).(?<year>\\d{2,4})\\b";

        System.out.println("Please enter date of birth:");
        String dateOfBirth = scanner.nextLine();

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(dateOfBirth);

        while (!matcher.matches()) {
            System.out.println("Date of birth is not valid. " +
                    "Please try again in format DD.MM.YYYY:  ");
            dateOfBirth = scanner.nextLine();
            matcher = pattern.matcher(dateOfBirth);
            if (matcher.matches()) {
                break;
            }
        }
        return dateOfBirth;
    }
}
