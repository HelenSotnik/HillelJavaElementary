package hillel.elementary.homework5.service;

import hillel.elementary.homework5.entity.Entity;

import java.io.*;

public class AdminService extends AbstractService implements Service {

    @Override
    public void signUpUserData(Entity entity) throws IOException {
        File file = new File(super.getFilePath());
        FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
        writer.write(entity.toString());
        writer.close();
    }
}
