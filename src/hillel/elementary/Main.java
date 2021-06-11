package hillel.elementary;

import hillel.elementary.entity.Admin;
import hillel.elementary.entity.User;
import hillel.elementary.service.AdminService;
import hillel.elementary.service.UserService;

public class Main {
    public static void main(String[] args) throws Exception {

        String filePath = "/Users/lenasotnik/Desktop/Elementary/src/hillel/elementary/FileUser.txt";

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
