package hillel.elementary.homework8.services;

import hillel.elementary.homework8.entities.Client;
import hillel.elementary.homework8.utils.Helper;

public class TransactionService {
    public void proceedTransaction(Client client, String accountId) {
        Helper helper = new Helper();
        helper.checkAccountIdEquality(client.getAccountId(), accountId);
    }
}
