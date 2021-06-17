package hillel.elementary.homework5.service;

import hillel.elementary.homework5.entity.Entity;

import java.io.IOException;

public interface Service {
    boolean checkUser(Entity entity) throws IOException;

    void signUpUserData(Entity entity) throws IOException;
}
