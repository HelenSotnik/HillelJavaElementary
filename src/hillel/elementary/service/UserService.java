package hillel.elementary.service;

import hillel.elementary.entity.Entity;

public class UserService extends CheckUser implements Service {
    private static final String MESSAGE = "Current method is unavailable for UserService";

    @Override
    public void signUpUserData(Entity entity) {
        System.out.println(MESSAGE);
    }
}
