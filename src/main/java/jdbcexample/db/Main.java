package jdbcexample.db;

import jdbcexample.db.manager.UserManager;
import jdbcexample.db.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        try {
//            User user=new User("poxos","poxosyan","poxos@mail.ru","poxos");
//        userManager.addUser(user);
//            System.out.println(user);

            List<User> allUsers = userManager.getAllUser();
            for (User user : allUsers) {
                System.out.println(user);
            }
            userManager.deleteUserById(6);

            allUsers = userManager.getAllUser();
            for (User user : allUsers) {
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
