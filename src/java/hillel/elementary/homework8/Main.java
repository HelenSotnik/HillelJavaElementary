package hillel.elementary.homework8;

import hillel.elementary.homework8.entities.Client;
import hillel.elementary.homework8.exceptions.WrongFieldException;
import hillel.elementary.homework8.exceptions.WrongSumException;
import hillel.elementary.homework8.services.TransactionService;
import hillel.elementary.homework8.utils.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your client Account Id: ");

        String accountIdWhoSends = sc.next();
        String validAccountIdWhoSends =
                validateAccountIdLength(accountIdWhoSends, sc, helper);

        System.out.println("Enter recipient client Account Id: ");
        String accountIdWhoAccepts = sc.next();
        String validAccountIdWhoAccepts =
                validateAccountIdLength(accountIdWhoAccepts, sc, helper);

        System.out.println("Enter sum of money transaction: ");
        double sum = sc.nextDouble();
        double validSum = validateSumOfTransaction(sum, sc, helper);
        sc.close();

        System.out.println("Sum of transaction is " + validSum + "hrn. " +
                "Please wait for checking the client data ...");

        Client client = new Client();
        client.setAccountId(validAccountIdWhoSends);
        client.setSum(validSum);

        TransactionService service = new TransactionService();
        service.proceedTransaction(client, validAccountIdWhoAccepts);
        System.out.println("Money Transaction is successful!");
    }

    private static String validateAccountIdLength(String accountId, Scanner sc, Helper help) {
        try {
            while (accountId.length() != 10) {
                help.checkAccountIdLength(accountId);
                System.out.println("Account Id length should be 10.\n" +
                        "Enter Account Id again:");
                accountId = sc.next();
            }
        } catch (WrongFieldException e) {
            e.printStackTrace();
        }
        return accountId;
    }

    private static Double validateSumOfTransaction(Double sum, Scanner sc, Helper help) {
        try {
            while (sum > 1000) {
                help.checkSum(sum);
                System.out.println("Sum cannot be bigger than 1000.\n" +
                        "Enter Sum of transaction again: ");
                sum = sc.nextDouble();
            }
        } catch (WrongSumException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
