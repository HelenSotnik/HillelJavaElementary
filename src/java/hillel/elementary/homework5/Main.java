package hillel.elementary.homework5;

import hillel.elementary.homework5.entity.Admin;
import hillel.elementary.homework5.entity.User;
import hillel.elementary.homework5.service.AdminService;
import hillel.elementary.homework5.service.UserService;

public class Main {
    public static void main(String[] args) throws Exception {

        String filePath = "/Users/lenasotnik/Desktop/Hillel/HillelJavaElementary/src/resources/FileUser.txt";

        User user = new User();
        user.setFirstName("Martha");
        user.setLastName("Steward");
        user.setAge(55);
        user.setEmail("martha@gmail.com");
        user.setPassword("stew.m1966");

        Admin admin = new Admin();
        admin.setFirstName("Dilan");
        admin.setLastName("McKinley");
        admin.setAge(25);
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin-44320.g");

        UserService userService = new UserService();
        userService.setFilePath(filePath);

        AdminService adminService = new AdminService();
        adminService.setFilePath(filePath);

        userService.signUpUserData(user);
        adminService.signUpUserData(admin);
        adminService.signUpUserData(user);

        System.out.println(userService.checkUser(admin));
        System.out.println(adminService.checkUser(user));
    }
}
