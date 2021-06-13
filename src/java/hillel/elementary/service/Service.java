package hillel.elementary.service;

import hillel.elementary.entity.Entity;

import java.io.IOException;

public interface Service {
    boolean checkUser(Entity entity) throws IOException;

    void signUpUserData(Entity entity) throws IOException;
}
