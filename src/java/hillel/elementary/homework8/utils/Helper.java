package hillel.elementary.homework8.utils;

import hillel.elementary.homework8.exceptions.UserExpectedError;
import hillel.elementary.homework8.exceptions.WrongFieldException;
import hillel.elementary.homework8.exceptions.WrongSumException;

public class Helper {
    public void checkAccountIdLength(String accountId) throws WrongFieldException {
        if (accountId.length() != 10) {
            throw new WrongFieldException("Incorrect client Account Id length: "
                    + accountId.length());
        }
    }

    public void checkSum(Double sum) throws WrongSumException {
        if (sum > 1000.00) {
            throw new WrongSumException("Incorrect sum: " + sum);
        }
    }


    public void checkAccountIdEquality(String accountIdWhoSends, String accountIdWhoAccepts) {
        if (accountIdWhoSends.equals(accountIdWhoAccepts)) {
            throw new UserExpectedError("Account Id Who Sends should not match Account Id who accepts.\n" +
                    "Transaction failed.");
        }
    }
}
