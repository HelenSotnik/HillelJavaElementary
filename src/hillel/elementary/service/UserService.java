package hillel.elementary.service;

import hillel.elementary.entity.Entity;

import java.io.*;

public class UserService implements Service {
    private static final String MESSAGE = "Current method is unavailable for UserService";
    private String filePath;

    @Override
    public boolean checkUser(Entity entity) throws IOException {
        File file = new File(getFilePath());
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String emailLine = entity.getEmail();
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals(emailLine)) {
                return true;
            }
        }
        bufferedReader.close();
        fileReader.close();
        return false;
    }

    @Override
    public void signUpUserData(Entity entity) {
        System.out.println(MESSAGE);
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
