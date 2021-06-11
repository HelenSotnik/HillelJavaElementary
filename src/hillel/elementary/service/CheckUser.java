package hillel.elementary.service;

import hillel.elementary.entity.Entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

abstract class CheckUser {
    private String filePath;

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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
