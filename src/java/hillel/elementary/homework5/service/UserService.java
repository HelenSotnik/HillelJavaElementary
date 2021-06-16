package hillel.elementary.homework5.service;

import hillel.elementary.homework5.entity.Entity;

public class UserService extends AbstractService implements Service {
    private static final String MESSAGE = "Current method is unavailable for UserService";

    @Override
    public void signUpUserData(Entity entity) {
        System.out.println(MESSAGE);
    }
}
