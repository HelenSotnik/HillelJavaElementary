package hillel.elementary.service;

import hillel.elementary.entity.Entity;

import java.io.*;

public class AdminService implements Service {
    private String filePath;

    @Override
    public boolean checkUser(Entity entity) throws IOException {
        UserService userService = new UserService();
        userService.setFilePath(getFilePath());
        return userService.checkUser(entity);
    }

    @Override
    public void signUpUserData(Entity entity) throws IOException {
        File file = new File(getFilePath());
        FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
        writer.write(entity.toString());
        writer.close();
    }

    public String getFilePath() {
        return filePath = filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
