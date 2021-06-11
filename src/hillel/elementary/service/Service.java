package hillel.elementary.service;

import hillel.elementary.entity.Entity;

import java.io.IOException;

interface Service {
    public boolean checkUser(Entity entity) throws IOException;

    public void signUpUserData(Entity entity) throws IOException;
}
